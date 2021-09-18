import React from 'react';

export default class Menu extends React.Component {
  render() {
    //with jsx
    return (
      <nav className="navbar">
        <div class="logo">E</div>
  <ul><li><a href="index.html" class="App-link">Home</a></li>
    <li><a href="products.html" class="App-link">Our Products</a></li>
      <li><a href="shop.html" class="App-link">Our Shop</a></li>
  </ul>
</nav>
    );
  }
}