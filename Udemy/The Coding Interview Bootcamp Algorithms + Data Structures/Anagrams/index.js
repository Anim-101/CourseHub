// Check to see if two provided strings are anagrams of each other.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation. Consider capital letters to be the same as lower
// case.
// Examples:
// anagram('rail safety', 'fairy tales') --> True
// anagram('RAIL! SAFETY!', 'fairy tales') --> True
// anagram('Hi there', 'Bye there') --> False

// Solution One
// function anagrams(stringA, stringB) {
//   const aCharMap = buildCharMap(stringA);
//   const bCharMap = buildCharMap(stringB);

//   if (Object.keys(aCharMap).length !== Object.keys(bCharMap).length) {
//     return false;
//   }

//   for (let char in aCharMap) {
//     if (aCharMap[char] !== bCharMap[char]) {
//       return false;
//     }
//   }

//   return true;
// }

// function buildCharMap(string) {
//   const charMap = {};

//   for (let char of string.replace(/[^\w]/g, "").toLowerCase()) {
//     charMap[char] = charMap[char] + 1 || 1;
//   }

//   return charMap;
// }

// Solution Two
function anagrams(stringA, stringB) {
  return regExpString(stringA) === regExpString(stringB);
}

function regExpString(string) {
  return string.replace(/[^\w]/g, "").toLowerCase().split("").sort().join("");
}

module.exports = anagrams;
