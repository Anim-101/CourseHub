// Write a program that console logs the numbers
// from 1 to name. But for multiples of three print
// "fizz" instead of the number and for the multiples
// of five print "buzz". For numbers which are multiples
// of both three and five print "fizzbuzz"
// Examples:
// fizzbuzz(5);
// 1
// 2
// fizz
// 4
// buzz

function fizzBuzz(number) {
  for (let i = 1; i <= number; i++) {
    // Is the number a multiple of 3 and 5
    if (i % 3 === 0 && i % 5 === 0) {
      console.log("fizzbuzz");
    } else if (i % 3 === 0) {
      console.log("fizz");
    } else if (i % 5 === 0) {
      console.log("buzz");
    } else {
      console.log(i);
    }
  }
}

module.exports = fizzBuzz;
