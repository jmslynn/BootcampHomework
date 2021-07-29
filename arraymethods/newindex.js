let fruitArray = ['apple', 'banana', 'cherry', 'durian', 'jackfruit', 'mango'];

console.log('hello');

console.log(fruitArray.indexOf('cherry'));
console.log(fruitArray.indexOf('watermelon'));

//add watermelon and lime to array
fruitArray.push('grape', 'orange');


console.log(fruitArray);

//remove apple from array
let index = fruitArray.indexOf('cherry');
fruitArray.splice(index,1);
console.log(fruitArray);