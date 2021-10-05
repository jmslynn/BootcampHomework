import React, {useState} from 'react';

const StarRating = () => {
  // use state hook to store the index of the star clicked
  //? is setRating function just useState ?
  const [rating, setRating] = useState(0);
  const [hover, setHover] = useState(0);
  return (
  <div className="star-rating">
    {/* braces for javascript, bracket for array, dots for spread, 5 element array, map to new array called star, create a star icon wrapped in a button in each spot in array */}
    {[...Array(5)].map((star, index) => {
      index += 1;
      return (
        <button
        type="button"
        key="{index}"
        // if index <= rating, "on" else "off"
        className={index <= (hover || rating) 
          ? "on" : "off"}
        // clicking a star calls setRating for that star
        onClick={() => setRating(index)}
        onMouseEnter={() => setHover(index)}
        onMouseLeave={() => setHover(rating)}
        >
        <span className="star">&#9733;</span>
        </button>
      );
    })}
  </div>
  );
};

export default StarRating;