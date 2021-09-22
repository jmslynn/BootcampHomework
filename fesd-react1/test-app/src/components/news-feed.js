import React from 'react';
import Post from './post';

//let e = React.createElement;


export default class NewsFeed extends React.Component {
  render() {

    let comments = [
      {
          content: 'This is the first comment',
          username: 'Alana',
          date: '12-12-2018'
        },
        {
          content: 'This is a post',
          username: 'Evan',
          date: '12-1-2018'
        },
        {
          content: 'This is another post',
          username: 'Sigrid',
          date: '12-2-2018'
        }
    ];
    //with jsx
    return (
      <div className="container">
        <Post {...{comments: comments, content: 'this is post content'}}/>
        <Post {...{content: 'Here is another post!'}}/>
      </div>
    );
    // without jsx
    // return e('div', {class: 'container'}, 
    // e(Post, {}, null),
    // e(Post, {}, null),
    // e(Post, {}, null)
    // );
  }
}