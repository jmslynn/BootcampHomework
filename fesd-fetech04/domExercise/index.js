let button = document.getElementById('btn');
let content = document.getElementById('content');

button.addEventListener('click', () => {
  if (content.innerHTML=='goodbye') {
    content.innerHTML = 'hello';
  } else {
    content.innerHTML = 'goodbye';
  }
});

document.getElementById('remove').addEventListener('click', () => {
  let idToRemove = document.getElementById('remove-id').value;
  let elementToRemove = document.getElementById(idToRemove);
  elementToRemove.parentNode.removeChild(elementToRemove);
  document.getElementById('remove-id').value = '';
});

let id=0;


document.getElementById('add').addEventListener('click', () => {
let parent = document.getElementById('paragraphs');
let newElement = document.createElement('p');
newElement.innerHTML = document.getElementById('new-text').value;
newElement.setAttribute('id', id++);
parent.appendChild(newElement);
document.getElementById('new-text').value='';
});

//quiz question week 4
//listen for the click
document.getElementById('p-button').addEventListener('click', () => {
  //find the parent element for the paragraph
  let parent = document.getElementById('p-div');
  //create the paragraph element
  let newElement = document.createElement('p');
  //write the words
  newElement.innerHTML = document.getElementById('p-input').value;
  //add the element
  parent.appendChild(newElement);
  //clear the field
  document.getElementById('p-input').value='';
  });
