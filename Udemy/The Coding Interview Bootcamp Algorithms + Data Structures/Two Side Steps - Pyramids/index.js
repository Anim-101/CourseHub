// Write a function that accepts a positive number N.
// The function should console log a pyramid shape
// with N levels using the # character. Make sure the
// pyramid has spaces on both the left *and right hand sides.
// Examples:
//     pyramid(1)
//         '#'
//     pyramid(2)
//         ' # '
//         '###'
//     pyramid(3)
//         '  #  '
//         ' ### '
//         '#####'

// Iterative Solution
// function pyramid(number) {
//   const midPoint = Math.floor((2 * number - 1) / 2);

//   for (let row = 0; row < number; row++) {
//     let level = "";

//     for (let col = 0; col < 2 * number - 1; col++) {
//       if (midPoint - row <= col && midPoint + row >= col) {
//         level += "#";
//       } else {
//         level += " ";
//       }
//     }
//     console.log(level);
//   }
// }

// Recursive Solution
function pyramid(number, row = 0, level = "") {
  if (row === number) {
    return;
  }

  if (level.length === 2 * number - 1) {
    console.log(level);

    return pyramid(number, row + 1);
  }

  const midPoint = Math.floor((2 * number - 1) / 2);

  let add;

  if (midPoint - row <= level.length && midPoint + row >= level.length) {
    add = "#";
  } else {
    add = " ";
  }

  pyramid(number, row, level + add);
}

module.exports = pyramid;
