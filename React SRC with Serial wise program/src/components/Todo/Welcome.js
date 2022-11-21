import React, { useState } from 'react'
import { useLinkClickHandler, useLocation } from 'react-router-dom'
import { Button } from 'reactstrap'
import { Link } from 'react-router-dom'

const Welcome = () => {
    const [message, setMessage] = useState(' ')
    const location = useLocation()
    const clickHandler = async () => {
        const data = await fetch("http://localhost:8082/getMessage")
        const output = await data.json();
        //setMessage('hello!!! Master Devloper');
        console.log(output)
        setMessage(output.data)
    }
    return (
        <div><h2>Welcome {location.state.user} to the TODO application..<Link to="/todos">list of todos</Link>.</h2><br />{message}<br />
            Click the button to get a customise welcome message<br />
            <Button color="success" onClick={clickHandler}>
                Click me
            </Button>
        </div>
    )
}

export default Welcome