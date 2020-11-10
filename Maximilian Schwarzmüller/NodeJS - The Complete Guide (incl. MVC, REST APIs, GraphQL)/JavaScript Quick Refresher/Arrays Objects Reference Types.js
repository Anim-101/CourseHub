const person = {
    name: 'Max',
    age: 29,
    greet() {
        console.log('Hi, I am ' + this.name);
    }
};

const hobbies = ['sports', 'coockies'];

hobbies.push('programming');

console.log(hobbies)