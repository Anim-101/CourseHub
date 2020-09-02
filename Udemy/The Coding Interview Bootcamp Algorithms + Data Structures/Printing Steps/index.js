// Write a function that accepts a positive number N.
// The function should console log a step shape with N
// levels using the # character. Make sure the step has
// spaces on the right side!
// Examples:
//     steps(2)
//         '# '
//         '##'
//     steps(3)
//         '# '
//         '##'
//         '###'
//     steps(4)
//         '# '
//         '##'
//         '###'
//         '####'

// Iterative Solution
// function steps(number) {
//   for (let row = 0; row < number; row++) {
//     let stair = "";

//     for (let column = 0; column < number; column++) {
//       if (column <= row) {
//         stair += "#";
//       } else {
//         stair += " ";
//       }
//     }

//     console.log(stair);
//   }
// }

// Recursive Solution
function steps(number, row = 0, stair = "") {
  if (number === row) {
    return;
  }

  if (number === stair.length) {
    console.log(stair);

    return steps(number, row + 1);
  }

  //   if (stair.length <= row) {
  //     stair += "#";
  //   } else {
  //     stair += " ";
  //   }

  const addStair = stair.length <= row ? "#" : " ";

  steps(number, row, stair + addStair);
}

module.exports = steps;
