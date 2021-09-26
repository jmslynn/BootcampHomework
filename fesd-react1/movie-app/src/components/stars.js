import React, { Component } from 'react'

export default class Stars extends Component {
  render() {
    return (
      <form>
  <div className="form-group">
  <p>Please rate this movie out of 5 stars</p>
  <input type="radio" id="1" name="star_rating" value="1" />
  <label htmlFor="1">1</label><br />
  <input type="radio" id="2" name="star_rating" value="2" />
  <label htmlFor="1">2</label><br />
  <input type="radio" id="3" name="star_rating" value="3" />
  <label htmlFor="1">3</label><br />
  <input type="radio" id="4" name="star_rating" value="4" />
  <label htmlFor="1">4</label><br />
  <input type="radio" id="5" name="star_rating" value="5" />
  <label htmlFor="1">5</label><br />
  </div>
  <button type="submit" className="btn btn-primary">Submit</button>
</form>

    )
  }
}
