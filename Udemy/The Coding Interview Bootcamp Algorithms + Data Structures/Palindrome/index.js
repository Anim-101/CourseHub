// Given a String, return true if the string is a palindrome
// or false if it is not. palindromes are string that form
// same word if it is reversed. "Do" include spaces and
// punctuation in determining if the string is a palindrome.Given
// Examples:
// palindrome("abba") === true
// palindrome("abcdefg") === false

// function palindrome(string) {
//   const reversed = string.split("").reverse().join("");

//   return string === reversed;
// }

// Alternate Solution Using every() Helper
function palindrome(string) {
  return string.split("").every((char, i) => {
    return char === string[string.length - i - 1];
  });
}

module.exports = palindrome;
