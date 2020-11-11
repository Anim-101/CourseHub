const person = {
    name: 'Max',
    age: 29,
    greet() {
        console.log('Hi, I am ' + this.name);
    }
};

const printName = ({ name }) => {
    console.log(name);
}

printName(person);

const {name, age} = person;

console.log(name, age)

const hobbies = ['Sports', 'Cooking'];

const [hobbyOne, hobbyTwo] = hobbies;

console.log(hobbyOne, hobbyTwo)