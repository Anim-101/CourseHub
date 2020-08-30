const palindrome = require("./index");

test("Palindrome function is defined", () => {
  expect(typeof palindrome).toEqual("function");
});

test("'aba is a palindrome'", () => {
  expect(palindrome("aba")).toBeTruthy();
});

test("' aba' is a palindrome'", () => {
  expect(palindrome(" aba")).toBeFalsy();
});

test("'aba ' is a palindrome'", () => {
  expect(palindrome("aba ")).toBeFalsy();
});

test("'greetings' is a palindrome'", () => {
  expect(palindrome("greetings")).toBeFalsy();
});

test("'10000000001' is a palindrome'", () => {
  expect(palindrome("10000000001")).toBeTruthy();
});

test("'Fish hsif' is a palindrome'", () => {
  expect(palindrome("Fish hsif")).toBeFalsy();
});

test("'pennep' is a palindrome'", () => {
  expect(palindrome("pennep")).toBeTruthy();
});
