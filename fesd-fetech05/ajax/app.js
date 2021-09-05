//const { data } = require("jquery");

//get request
//$.get('https://reqres.in/api/users/2', (data) => console.log(data));

$.get('https://reqres.in/api/users/2', function(data) {
  for(let i=0; i<data.length; i++) {
    let row = $('<tr><td>' + data[i].first_name + '</td><td>' + data[i].last_name + '</td><td>' + data[i].email + '</td></tr>');
    $('#customer-table').append(row);
  }
});










//post request
// $.post('https://reqres.in/api/users', {
//   name: 'Tommy',
//   job: 'Front End Software Developer',
// }, (data) => console.log(data)
// );