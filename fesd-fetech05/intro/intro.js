//console.log($('body'));

let p=$('#test');
let div = $('.my-class');
let ul = $('ul');

console.log(p);
console.log(div);
console.log(ul);

console.log(p.text());
p.text('New Text');

$('input').attr('placeholder', 'Placeholder Text');

div.prepend('<p>prepended paragraph</p>');
div.append('<p>appended paragraph</p>');
div.before('<p>this is the paragraph added before the div</p>');
div.after('<p>this is the paragraph added after the div</p>');

div.empty();

ul.remove();

$('input').hide();
setTimeout(() => $('input').show(), 2000);