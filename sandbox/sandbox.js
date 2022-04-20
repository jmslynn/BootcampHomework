function squareDigits(num){
  let length = num.toString().length;
  let result;
  for (let i=0; i<length; i++) {
    let digit = num.toString()[i];
    let square = digit * digit;
    result = `${result}${square}`;
    console.log(result);
  }
  return result;
}

squareDigits(72);
