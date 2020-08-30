const maxChar = require("./index.js");

test("maxChar functions exists", () => {
  expect(typeof maxChar).toEqual("function");
});

test("Finds the most frequently used char", () => {
  expect(maxChar("a")).toEqual("a");
  expect(maxChar("abcdefghijklmnaaaa")).toEqual("a");
});

test("Works with numbers in the string", () => {
  expect(maxChar("ab1c1d1e1f1g1")).toEqual("1");
});
