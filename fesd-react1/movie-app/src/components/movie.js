import React, { Component } from 'react';
import ReviewList from './review-list';
import { REVIEWS } from '../shared/data';
import Stars from './stars';

export default class Movie extends Component {
  render() {
    return (
      // movie card
      <div className="card mx-2 w-75">
        <div className="card-body">
          <h5 className="card-title">
            {this.props.movie.title} 
            <Stars />
          </h5>
          <h6 className="card-subtitle mb-2 text-muted">
            Category: {this.props.movie.category}, 
            Rating: {this.props.movie.rating}
          </h6>
          <p className="card-text">
            Synopsis: {this.props.movie.synopsis}
          </p>
          {/* onclick: show review form */}
          <button className="btn btn-primary">Leave A Review</button> 
          {/* onclick: show rating mechanism */}
          <button className="btn btn-primary">Rate This Movie</button>
        </div>
        <ReviewList reviews={REVIEWS}/>
      </div>
    )
  }
}
