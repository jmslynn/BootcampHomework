import React from 'react';
import ReactDOM from 'react-dom';
import '../node_modules/bootstrap/dist/css/bootstrap.css';
import './index.css';
//import App from './App';
import NewsFeed from './components/news-feed'
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  //with jsx
  <NewsFeed />,
  document.getElementById('root')
  );

  // without jsx
  // React.createElement(NewsFeed, {}, null),
  // document.getElementById('root')
//);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
