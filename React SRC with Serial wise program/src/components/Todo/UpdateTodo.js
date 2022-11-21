import moment from 'moment/moment';
import React, { useEffect, useState } from 'react'
import { useLocation } from 'react-router-dom'
import { Button, Container, Form, Label, FormGroup, Input, Alert } from 'reactstrap';

const UpdateTodo = () => {
  const location = useLocation();
  const [todo, setTodo] = useState({})
  const onChangeHandler=(e)=>{
    setTodo({...todo , [e.target.name]:e.target.value})
  }
  useEffect(() => {
    console.log('the update component has been called');
    const d= moment(location.state.todo.complitionDate).format('YYYY-MM-DD')
    console.log(d)
    console.log(location.state.todo)
    setTodo({...location.state.todo , completionDate:d});
  }, [])
 
  return (
    <Container style={{ marginTop: '20px', width: '50%' }}>

      <Form>
        <FormGroup>
          <Label for="name">
            Name
          </Label>
          <Input
            id="name"
            name="name"
            type="text"
            value={todo.name}
            onChange={onChangeHandler}
  />
        </FormGroup>

        <FormGroup>
          <Label for="description">
            Description
          </Label>
          <Input
            id="description"
            name="description"
            type="text"
            value={todo.description}
            onChange={onChangeHandler}

          />
        </FormGroup>

        <FormGroup>
          <Label for="done">
          Done
          </Label>
          <Input
            id="done"
            name="done"
            type="checkbox"
            checked={todo.done}
            onChange={onChangeHandler}

          />
        </FormGroup>

        <FormGroup>
          <Label for="complitionDate">
          Complition Date
          </Label>
          <Input
            id="complitionDate"
            name="complitionDate"
            type="Date"
            value={todo.complitionDate}
            onChange={onChangeHandler}

          />
        </FormGroup>
      
        <Button color="success" >
          Update
        </Button>
      </Form>
    </Container>
  )
}

export default UpdateTodo   