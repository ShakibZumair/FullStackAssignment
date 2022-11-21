import React, { useState } from 'react'
import { useNavigate } from 'react-router';
import { Button, Container, Form, Label, FormGroup, Input, Alert } from 'reactstrap';

const Login = (props) => {
  const [user, setUser] = useState({ username: 'Gaurav', password: '123' })
  const [loginsuccess, setLoginSuccess] = useState(true);
  const navigate = useNavigate();
  const onChangeHandler = (event) => {
    setUser({ ...user, [event.target.name]: event.target.value })
    // console.log(user)
  }

  const ClickHandler = (e) => {
    e.preventDefault();
    // console.log('the current username is '+user.username)
    // console.log('the current password is '+user.password)
    if (user.username === 'Gaurav' && user.password === '123') {
      setLoginSuccess(true)
      props.login(user.username);
      navigate("/welcome", { state: { user: user.username } })

    }
    else {

      setLoginSuccess(false)
      setTimeout(() => {
        setLoginSuccess(true)
      }, 3000)
    }
  }
  return (
    <Container style={{ marginTop: '20px', width: '50%' }}>
      {/* {loginsuccess && <Alert color ="success">
       Congratulation login success
      </Alert>} */}
      {!loginsuccess && <Alert color="danger">
        Login failure please try again
      </Alert>}
      <Form>
        <FormGroup>
          <Label for="username">
            Username
          </Label>
          <Input
            id="username"
            name="username"
            placeholder="enter your name"
            type="text"
            onChange={onChangeHandler}
          />
        </FormGroup>
        <FormGroup>
          <Label for="password">
            Password
          </Label>
          <Input
            id="password"
            name="password"
            placeholder="enter your password"
            type="password"
            onChange={onChangeHandler}
          />
        </FormGroup>
        <Button color="success" onClick={ClickHandler} >
          Login
        </Button>
      </Form>
    </Container>
  )
}

export default Login