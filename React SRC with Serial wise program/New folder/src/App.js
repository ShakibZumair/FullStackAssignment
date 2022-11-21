import logo from './logo.svg';
import './App.css';
import Hello from './components/Hello';
import Counter from './components/Counter';
import Base from './components/Base';
import { useState } from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Home from './components/Todo/Home';
import About from './components/Todo/About';
import Login from './components/Todo/Login';

function App() {
  const [num, setNum] = useState(0)
  const incrFunction = (a) => {

    setNum(num + parseInt(a))
  }
  return (
    <div className="App">
      <Base>
        <BrowserRouter>
           <Routes>
              <Route path="*" element={<Home />} />
              <Route path="home" element={<Home />} />
              <Route path="login" element={<Login />} />
              <Route path="about" element={<About />} />
           </Routes>
        </BrowserRouter>
      </Base>

    </div>
  );
}

export default App;
