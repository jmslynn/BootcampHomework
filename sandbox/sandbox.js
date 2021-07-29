// You are working for an event scheduling company and were asked to create something that helps organize events better. The app you are working on already has an Event class as follows:


// class Event {
//   constructor(title, date) {
//     this.title = title; //string
//     this.date = date; //string
//   }
// }

// Your task is to create a class named EventOrganizer that contains a property called events (an array of Events) and two methods: addNewEvent, and removeEvent.

// addNewEvent should take an event and add it to the events array ONLY if an event with the same title doesn't exist already.

// removeEvent should take a string representing the event title and remove the event with the matching title.

class Event {
  constructor(title, date) {
    this.title = title;
    this.date = date;
}
}

class EventOrganizer {
constructor(events) {
this.events = events;
this.eventArray = [];
}

addNewEvent(event) {
let index = events.findIndex(newArray);
if(index === -1) {
this.events.push(event);
}
}

removeEvent(event) {
let index = events.findIndex(newArray);
this.events.splice(index, 1);
}
testMethod() {
  console.log("hello");
}
} //end class

let event1 = new Event ('event1', 'date1');
let event2 = new Event ('event2', 'date2');
let event3 = new Event ('event3', 'date3');

let newArray = [event1, event2, event3];
let allEvents = new EventOrganizer;
allEvents.testMethod(event1);

//==================================================================================================

// The product owner on your development team believes they've seen a pattern as to which customers purchase the most socks. To verify, you've been asked to write a function that processes an array of customer objects and return a new array that contains only customers that match ANY of the following criteria:

//     name starts with a 'C' (upper or lowercase)
//     address contains no undefined fields
//     the city is Peoria and the state is AZ
//     membership level is GOLD or PLATINUM unless the customer is younger than 29, then SILVER is okay too

// The array of customer objects will have the following schema:
// const customers = [
//     {
//         name: 'Sam',
//         address: {
//             street: '1234 W Bell Rd',
//             city: 'Phoenix',
//             zip: '85308',
//             state: 'AZ'
//         },
//         membershipLevel: 'GOLD',
//         age: 32
//     },
//     //more customers with the same schema
// ];

// Note: The solution to this problem does not require the use of callbacks. 

// let mapArray = customers.map(
// (customers.name[0] === 'C' || customers.name[0] === 'c') ||
// customers.address !== '' ||
// (customers.city === "Peoria" && customers.state === "AZ") ||
// (customers.age > 29 || (customers.age >= 29 && customers.membershipLevel !== "SILVER"))
// );

// This doesn't work. I either need something to better direct the mapping function or pull an array of a specific field results out of the object array and then map those arrays. I'm also not entirely sure customers.name[0] actually works. Pretty sure it does, but couldn't get that far in testing.

//I lost about 10 minutes dealing with a wonky internet connect.