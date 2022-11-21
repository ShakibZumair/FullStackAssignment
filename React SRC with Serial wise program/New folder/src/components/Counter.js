import React from 'react'

const Counter = (props) => {
  
  const bstyle={
    backgroundColor:'green',
    fontSize:'25px',
    padding:'15px',
    color:'red',
    width:'100px'

  }  
  
  return (
    <div>
         <input style={bstyle} type="button" value="click" onClick={()=>{props.incrF(props.incr)}}/>
    </div>
  )
}

export default Counter