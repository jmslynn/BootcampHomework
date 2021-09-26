import React, { Component } from 'react'

export default class Review extends Component {
  render() {
    return (
      <div className="card mx-2 w-75">
        <div className="card-body">
          <h5 className="card-title">
            A review by: {this.props.review.user_name}. 
          Rating: {this.props.review.stars}/5 stars</h5>
         <p> Review: {this.props.review.review}</p>
 </div> </div>  )
  }
}
