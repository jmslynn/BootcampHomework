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
  content.parentNode.removeChild(content);
});