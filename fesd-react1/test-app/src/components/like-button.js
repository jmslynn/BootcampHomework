import React from 'react';

export default class LikeButton extends React.Component {
  render() {
    //with jsx
    return <button className="btn btn-secondary">Like</button>;
    // without jsx
    // return React.createElement('button', {class: 'btn btn-primary'}, 'Like');
  }
}