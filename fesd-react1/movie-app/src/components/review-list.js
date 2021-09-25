import React, { Component } from 'react'
import Review from './review';


export default class ReviewList extends Component {
  render() {
    return (
// {/* review card */}
<div className="card-text">

  Reviews

  {this.props.reviews.map(review => 
          <Review key={review.id} review={review} />)}
</div>
    )
  }
}
