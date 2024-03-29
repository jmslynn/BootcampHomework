import React, { Component } from 'react';

export default class Counter extends React.Component {
  state = {
    count: 0,
    tags: [tag1, tag2, tag3]
  };

  render() { 
    return (<div>
      {/* why is badge formatting not working? */}
      <span className={this.getBadgeClasses()}>{this.formatCount()}</span>
      <button className="btn btn-secondary btn-sm">Increment</button>
      <ul>
        { this.state.tags.map(tag => <li>{tag}</li>)}
        </ul>
      </div>);
  }

  getBadgeClasses() {
    let classes = "badge m-2 badge-";
    classes += (this.state.count === 0) ? "warning" : "primary";
    return classes;
  }

formatCount() {
  //why is count in {}?
  const {count} = this.state;
  return count === 0 ? 'Zero': count;
}

}