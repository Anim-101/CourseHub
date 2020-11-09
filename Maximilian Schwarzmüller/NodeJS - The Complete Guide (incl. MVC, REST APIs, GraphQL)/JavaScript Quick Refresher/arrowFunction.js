const name = 'Max';
let age = 29;
const hasHobbies = true;

age = 30;

// const summerizeUser = function(userName, userAge, userHasHobby) {
//     return ('Name is ' + userName + ', age is ' + userAge + ', and the user has hobbies: ' + userHasHobby);
// }

const summerizeUser = (userName, userAge, userHasHobby) => {
    return ( 'Name is ' + userName + ', age is ' + userAge + ' and the user has hobbies: ' + userHasHobby);
}

console.log(summerizeUser(name, age, hasHobbies));

// const add = (a, b) => {
//     return a + b;
// }

const add = (a, b) => a + b;

const addOne = (a) => a + 1;

const addTwo = a => a + 2;

const addRandom = () => 1 + 2;

console.log(add(1, 2));

console.log(addOne(1));

console.log(addTwo(2));

console.log(addRandom());