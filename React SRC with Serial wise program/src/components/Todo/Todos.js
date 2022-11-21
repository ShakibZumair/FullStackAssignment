import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { Container  , Table , Button} from 'reactstrap'
const Todos = () => {

  const navigate= useNavigate();
  const getAllTodos=async()=>{
     const data=await fetch("http://localhost:8082/api/v1/todo/")
     const myTodos=await data.json();
     
     setTodos(myTodos) 
  }
  const updateTodo=async(id)=>{
    const data=await fetch(`http://localhost:8082/api/v1/todo/${id}`, {method:'get'})
    const value=await data.json();
   navigate("/update" , {state:{todo:value}})
  }

  const deleteTodo=async(id)=>{
    console.log(id)
    const data=await fetch(`http://localhost:8082/api/v1/todo/${id}`, {method:'delete'})
    const value=await data.json();
    getAllTodos()
  }
  useEffect(()=>{
    getAllTodos()
  },[])


   const [todos , setTodos]=useState([])

  return (
    <Container>
      <Table striped>
        <thead>
          <tr>
            <th>
              ID
            </th>
            <th>
              Name
            </th>
            <th>
              Description
            </th>
            <th>
              completionDate
            </th>
            <th>
              isDone
            </th>
            <th>
              Update
            </th>
            <th>
              Delete
            </th>
          </tr>
        </thead>
        <tbody>
          {todos.map((todo)=>{return <tr>
            <td>{todo.id}</td>
            <td>{todo.name}</td>
            <td>{todo.description}</td>
            <td>{todo.completionDate===null?'#NaN':todo.completionDate}</td>
            <td>{todo.done.toString()}</td>
            <td><Button color="success" onClick={()=>updateTodo(todo.id)}>Update</Button></td>
            <td><Button color="danger"  onClick={()=>deleteTodo(todo.id)}>Delete</Button></td>

          </tr>})}
        </tbody>
      </Table>
    </Container>
    // <div>Todos</div>
  )
}

export default Todos