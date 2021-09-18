import React from 'react';

export default class Login extends React.Component {
  render() {
    //with jsx
    return (
  
<div className="main">
  <form>
    <h3>Log In</h3>
    <label>
    Name:
    <input type="text" name="name" />
  </label>
  <label>
    Password:
    <input type="text" name="password" />
  </label>
  <input type="submit" value="Submit" />
  </form>
</div>
    );
  }
}