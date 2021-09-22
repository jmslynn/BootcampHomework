import React from 'react';
import ReplyButton from './reply-button';
import LikeButton from './like-button';

//let e = React.createElement;

export default class Comment extends React.Component {
  render() {
    //with jsx
    return (
      <div className="card w-75">
        <div className="card-header bg success text-white">
        {this.props.username} {this.props.date}
        </div>
        <div className="card-body">
        {this.props.content}
        </div>
        <div className="card-footer">
        <LikeButton />
        <ReplyButton />
        </div>
      </div>
    );
    // without jsx
    // return e('div', {class: 'card w-75'}, 
    //   e('div', {class: 'card-header bg-success text-white'},'Username and Time'),
    //   e('div', {class: 'card-body'},'Comment Content'),
    //   e('div', {class: 'card-footer'},
    //     e(LikeButton, {}, null),
    //     e('span', {}, ' '),
    //     e(ReplyButton, {}, null)
    //   )
    //);
  }
}