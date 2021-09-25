import React, { Component } from 'react'

export default class Review extends Component {
  render() {
    return (
      <div className="card mx-2 w-75">
        <div className="card-body">
          <h5 className="card-title">
          {this.props.review.user_name}
          {this.props.review.stars}
          {this.props.review.review}
A review <button>More...</button>
</h5> </div> </div>  )
  }
}
