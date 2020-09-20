const anagrams = require("./index");

test("anagrams function exists", () => {
  expect(typeof anagrams).toEqual("function");
});

test("'hello' is an anagram of ''llohe", () => {
  expect(anagrams("hello", "llohe")).toBeTruthy();
});

test("'Whoa! Hi!' is an anagram of 'Hi! Whoa!'", () => {
  expect(anagrams("Whoa! Hi!", "Hi! Whoa!")).toBeTruthy();
});

test("'One one' is not anagram of 'Two two two'", () => {
  expect(anagrams("One one", "Two two two")).toBeFalsy();
});

test("'One one' is not anagram of 'One one c'", () => {
  expect(anagrams("One one", "One one c")).toBeFalsy();
});

test("'A tree, a life, a bench' is not an anagram of 'A tree, a fence, a yard'", () => {
  expect(
    anagrams("A tree, a life, a benceh", "A tree, a fence, a yard")
  ).toBeFalsy();
});