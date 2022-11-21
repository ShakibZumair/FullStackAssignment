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
import Welcome from './components/Todo/Welcome';
import Todos from './components/Todo/Todos';
import AuthenticationService from './service/AuthenticationService';
import UpdateTodo from './components/Todo/UpdateTodo';

function App() {
  const [num, setNum] = useState(0)
  const [loginStatus, setLoginStatus] = useState(AuthenticationService.isLoggedIn)

  const login = (username) => {
    AuthenticationService.login(username);
    setLoginStatus(true)
  }

  const logout = (username) => {
    AuthenticationService.logout();
    setLoginStatus(false)
  }
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
            <Route path="login" element={<Login login={login} />} />
            <Route path="about" element={<About />} />
            <Route path="welcome" element={<Welcome />} />
            <Route path="todos" element={<Todos />} />
            <Route path="update" element={<UpdateTodo />} />

          </Routes>
        </BrowserRouter>
      </Base>

    </div>
  );
}

export default App;
