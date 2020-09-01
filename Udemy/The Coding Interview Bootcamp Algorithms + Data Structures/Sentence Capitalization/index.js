// Write a function that accepts a string. The function should
// capitalize the first letter of each word in the string then
// return the capitalized string.
// Examples:
// capitalize('a short sententce') --> 'A Short Sentence'
// capitalize('a lazy fox') --> 'A Lazy Fox'
// capitalize('look, it is working!') --> 'Look, It Is Working!'

// Solution Two
function capitalize(string) {
  let result = string[0].toUpperCase();

  for (let i = 1; i < string.length; i++) {
    if (string[i - 1] === " ") {
      result += string[i].toUpperCase();
    } else {
      result += string[i];
    }
  }

  return result;
}

// Solution One
// function capitalize(string) {
//   const words = [];

//   for (let word of string.split(" ")) {
//     words.push(word[0].toUpperCase() + word.slice(1));
//   }

//   return words.join(" ");
// }

module.exports = capitalize;
