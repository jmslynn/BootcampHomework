import React from 'react';

export default class Counter extends React.Component {
  constructor (props) {
    super(props);
    this.handleClick = this.handleClick.bind(this);
  }

//define the function, bund the 'this' keyword above to the method
//creating the separate method (instead anon method inside return)
//and binding allows re-use of the method
  handleClick() {
    this.props.onClick(this.props.name);
  }
  render() {
    return (
      <button className="btn btn-primary"
      //use the function with 'this'
      onClick={this.handleClick}>
        {this.props.name} {this.props.count}
      </button>
    )
  }
}