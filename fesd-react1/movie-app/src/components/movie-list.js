import React, { Component } from 'react';
import Movie from './movie';



export default class MovieList extends Component {
  render() {
    return (
      <div className="row my-3">
        <div className="col d-flex">
        {this.props.movies.map(movie => 
          <Movie key={movie.id} movie={movie} />)}
        </div>
      </div>
    )
  }
}
