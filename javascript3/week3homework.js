//question 1
console.log('question 1');
let ages = [];
ages.push(3, 9, 23, 64, 2, 8, 28, 93);
console.log(ages[ages.length - 1] - ages[0]);
ages.push(78);
console.log(ages[ages.length - 1] - ages[0]);

let sumAges = 0;
for (let i = 0; i < ages.length; i++) {
  sumAges = sumAges + ages[i];
}
console.log("average= " + sumAges / ages.length);
//question 2
console.log('question 2');

let names = [];
let sumNames = 0;
names.push("Sam", "Tommy", "Tim", "Sally", "Buck", "Bob");

for (let i = 0; i < names.length; i++) {
  sumNames = sumNames + names[i].length;
}
console.log("average = " + sumNames / names.length);

let string = "";
for (let i = 0; i < names.length; i++) {
  string = string + " " + names[i];
}
console.log(string);

//question 3 & 4
//3. access the last element of any array with arrayName.length-1
//4. access the first element of any array with arrayName[0]

//question 5
console.log('question 5')
let nameLengths = [];

for (let i = 0; i < names.length; i++) {
  nameLengths.push(names[i].length);
}
console.log(nameLengths);
console.log(nameLengths[3]);

//question 6
let sumLengths = 0;
console.log('question 6');
for (i = 0; i < nameLengths.length; i++) {
  sumLengths = sumLengths + nameLengths[i];
}
console.log(sumLengths);

//question 7
console.log('question 7');

let word = 'breakfast';
let n = 4;

function concatWord(word, n) {
  let string = "";
  for (let index = 1; index <= n; index++) {
    string = string + word;
  }
  return string;
}

console.log(concatWord(word, n));

//question 8
console.log('question 8');
let firstName = "Elizabeth";
let lastName = "Bennet";
let fullName = "";

function createFullName(first, last) {
  fullName = firstName + " " + lastName;
  return fullName;
}

createFullName(firstName, lastName);
console.log(fullName);

//question 9
console.log('question 9');

function isSumGreaterThan100() {
  for (let i = 0; i < ages.length; i++) {
    sumAges = sumAges + ages[i];
  }
  if (sumAges >= 100) { return true; }
}
console.log(isSumGreaterThan100(ages));

//question 10
console.log('question 10');
let numbers = [];

numbers.push(14, 39, 48, 50, 26, 46);
function findAverageOfArray(numbers) {
  let sum = 0;
  for (let i = 0; i < numbers.length; i++) {
    sum = sum + numbers[i];
  }
  return sum / numbers.length;
}
console.log(findAverageOfArray(numbers));

//question 11
console.log('question 11');

function isAverageFirstArrayGreaterThanSecond(first, second) {
  function getAverageOfArray(array) {
    let sum = 0;
    for (let i = 0; i < array.length; i++) {
      sum = sum + numbers[i];
    }
    return sum / numbers.length;
  }

  let firstAverage = getAverageOfArray(first);
  let secondAverage = getAverageOfArray(second);
  if (firstAverage > secondAverage) {
    return true;
  } else { return false; }
}
//  average of ages: 34.22, average of numbers: 37.16, false
console.log(isAverageFirstArrayGreaterThanSecond(ages, numbers));

//question 12
console.log('question 12');
let isHotOutside = false;
let moneyInPocket = 49.79;

function willBuyDrink() {
  if (isHotOutside === true && moneyInPocket > 10.50) {
    return true;
  } else { return false; }
}

console.log(willBuyDrink(isHotOutside, moneyInPocket));

//question 13
console.log('question 13');

// When my son was applying to colleges he put together a spreadsheet with data for
// each school and included rankings from niche.com on various things. It's hard
// to see in a spreadsheet which schools have the best ranking for each. This
// method will find the best rank of each array of rankings
// and link it to it's corresponding school. The schools hold the same
// place in each array.
let mathRank = [61, 62, 96, 87, 34, 120, 139, 219];
let engineeringRank = [27, 41, 44, 59, 69, 109, 113, 190];
let studentLifeRank = [64, 76, 214, 53, 576, 129, 65, 134];
let diversityRank = [51, 23, 418, 478, 25, 158, 217, 0];
let schools = ["Northeastern University", "Boston University", "Worcester Polytechnic Institute",
  "University of Pittsburgh", "University of Rochester", "UCONN - Storrs", "UMASS - Amherst",
  "University of New Hampshire"];

function whichSchool(ranks, schools) {
  let best = ranks[0];
  let school = schools[0];
  for (let i = 0; i < schools.length; i++) {
    if (best < ranks[i] && ranks[i] != 0) {
      best = ranks[i];
      school = schools[i];
    } // close if
  } // close for
  return school;

}// close function

console.log("The school with the best ranking for math is: " + whichSchool(mathRank, schools));
console.log(
  "The school with the best ranking for engineering is: " + whichSchool(engineeringRank, schools));
console.log(
  "The school with the best ranking for student life is: " + whichSchool(studentLifeRank, schools));
console.log("The school with the best ranking for diversity is: " + whichSchool(diversityRank, schools));


