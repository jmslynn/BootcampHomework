import React from 'react';

export default class ReplyButton extends React.Component {
  render() {
    //with jsx
    return <button className="btn btn-secondary">Reply</button>;
    // without jsx
    // return React.createElement('button', {class: 'btn btn-primary'}, 'Reply');
  }
}