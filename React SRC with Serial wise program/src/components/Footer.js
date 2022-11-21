import React from 'react'

const Footer = () => {
  const style={
      position:'fixed',
      left:'0',
      bottom:'0',
      width:'100%', 
      backgroundColor:'black',
      color:'red'
  }
  return (
    <footer className="footer" style={style}>
      <div className="container">
        <span className="text-muted">Todo Application@Yash Technologies All rights reserved.</span>
      </div>
    </footer>
  )
}

export default Footer