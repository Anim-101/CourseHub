// const person = {
//     name: 'Max',
//     age: 29,
//     greet: function() {
//         console.log('Hi, I am', this.name);
//     }
// };

const person = {
    name: 'Max',
    age: 29,
    greet() {
        console.log('Hi, I am', this.name);
    }
};

person.greet();