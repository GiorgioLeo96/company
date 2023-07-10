import "./App.css";
import React from "react";
import LoginForm from "./component/loginForm";
import RegisterForm from "./component/registerForm";

const App = () => {
  return (
    <div>
      <h1>App di Login e Registrazione</h1>
      <LoginForm />
      <RegisterForm />
    </div>
  );
};

export default App;
