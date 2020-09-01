const capitalize = require("./index");

test("Capitalize is a function", () => {
  expect(typeof capitalize).toEqual("function");
});

test("capitalize first letter of every words in a sentence", () => {
  expect(capitalize("hi there, how is it going?")).toEqual(
    "Hi There, How Is It Going?"
  );
});

test("capitalize first letter of every words in a sentence", () => {
  expect(capitalize("i love breakfast at bill miller bbq")).toEqual(
    "I Love Breakfast At Bill Miller Bbq"
  );
});
