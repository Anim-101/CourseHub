const person = {
    name: 'Max',
    age: 29,
    greet() {
        console.log('Hi, I am' + this.name);
    }
};

// Spread Operator - Copying Object
const coppiedPerson = {...person}

const hobbies = ['Sports', 'Cooking']

// const coppiedArray = hobbies.slice();

// Copy existsing array
const coppiedArray = [...hobbies]

console.log(coppiedArray)
console.log(coppiedPerson)

// const toArray = (argOne, argTwo, argThree) => {
//     return [argOne, argTwo, argThree];
// };
const toArray = (...args) => {
    return args;
};

console.log(toArray(1, 2, 3, 5, 6, 7, 8, 9))