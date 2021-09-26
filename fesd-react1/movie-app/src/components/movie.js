import React, { Component } from 'react';
import ReviewList from './review-list';
import { REVIEWS } from '../shared/data';
import ReviewForm from './review-form';
import Stars from './stars';

export default class Movie extends Component {
  constructor(props) {
    super(props);
    this.state = {
      showStarsForm: false,
      showReviewForm: false
    };
  //   this.handleShowStarsForm = 
  //     this.handleShowStarsForm.bind(this);
  //   this.handleShowReviewForm = 
  //     this.handleShowReviewForm.bind(this);
   }

  handleShowStarsForm(e) {
    e.preventDefault();
    this.setState((prevState) => ({
      showStarsForm: prevState.showStarsForm ? false : true
    }));
  }

  handleShowReviewForm(e) {
    e.preventDefault();
    this.setState((prevState) => ({
      showReviewForm: prevState.showReviewForm ? false : true
    }));
  }


  render() {
    const {showReviewForm} = this.state;
    return (
      // movie card
      <div className="card mx-2 w-75">
        <div className="card-body">
          <h5 className="card-title">
            {this.props.movie.title} 
            <span>  4/5 stars</span>
          </h5>
          <h6 className="card-subtitle mb-2 text-muted">
            Category: {this.props.movie.category}, 
            Rating: {this.props.movie.rating}
          </h6>
          <p className="card-text">
            Synopsis: {this.props.movie.synopsis}
          </p>
          {/* onclick: show review form */}
          <button className="btn btn-primary" onClick={this.handleShowReviewForm}>
          {showReviewForm ? "Leave A Review" : "Close"}</button> 
          {/* onclick: show rating mechanism */}
          <button className="btn btn-primary" onClick={this.handleShowStarsForm}>Rate This Movie</button>
          {showReviewForm && <ReviewForm />}
          {/* <ReviewForm />
          <Stars /> */}
        </div>
        <ReviewList reviews={REVIEWS}/>
      </div>
    )
  }
}