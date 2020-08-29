// Problem -
// Given a string, return a new string with reversed
// Test
// reverse('apple') === 'elppa'
// revesrse('hello') === 'olleh'
// reverse('Greetings!') === '!sgniteerG'

// Solution One
// function reverse(string) {
//   // Basic Solution
//   // const array = string.split("");
//   // array.reverse();
//   // return array.join();

//   // One Line Solution
//   return string.split("").reverse().join("");
// }

// Solution Two
// function reverse(string) {
//   let reversed = "";

//   for (let character of string) {
//     reversed = character + reversed;
//     debugger;
//   }

//   return reversed;
// }

// Solution Three
// ES5
// function reverse(string) {
//   return string.split("").reduce((reversed, character) => {
//     return character + reversed;
//   }, "");
// }
// ES6
function reverse(string) {
  return string.split("").reduce((rev, char) => char + rev, "");
}

// Testing for Debugging Mode via Node
// reverse("Anim-101");

module.exports = reverse;
