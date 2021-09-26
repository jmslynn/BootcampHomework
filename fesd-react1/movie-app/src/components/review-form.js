import React, { Component } from 'react'

export default class ReviewForm extends Component {
  render() {
    return (
      <form>
  <div className="form-group">
    <label htmlFor="userName">User Name</label>
    <input type="text" className="form-control" id="userName" aria-describedby="emailHelp" placeholder="Enter your user name" />
  </div>
  <div className="form-group">
    <label htmlFor="review">What do you think?</label>
    <input type="text" className="form-control" id="review" placeholder="write your review here" />
  </div>
  <button type="submit" className="btn btn-secondary">Submit</button>
</form>
    )
  }
}
