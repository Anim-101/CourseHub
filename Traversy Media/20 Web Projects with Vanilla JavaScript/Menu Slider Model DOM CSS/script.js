const toggle = document.getElementById('toggle');
const close = document.getElementById('close');
const open = document.getElementById('open');
const model = document.getElementById('model');

// Toggling Nav Bar
toggle.addEventListener('click', () =>
    document.body.classList.toggle('show-nav')
);

// Showing Model
open.addEventListener('click', () => model.classList.add('show-model'));

// Hiding Model
close.addEventListener('click', () => model.classList.remove('show-model'));

// Hiding Model by Outside Click
window.addEventListener('click', e => e.target == model ? model.classList.remove('show-model') : false);