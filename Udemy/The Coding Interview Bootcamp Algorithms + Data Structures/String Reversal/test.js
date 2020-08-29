const reverse = require("./index");

test("Reverse funtion exists", () => {
  expect(reverse).toBeDefined();
});

test("Reverse funtion exists", () => {
  expect(reverse("abcd")).toEqual("dcba");
});

test("Reverse function exists", () => {
  expect(reverse("Hello World")).toEqual("dlroW olleH");
});

test("Reverse function exists", () => {
  expect(reverse("I love watching Mr. Robot!")).toEqual(
    "!toboR .rM gnihctaw evol I"
  );
});

test("Reverse function exists", () => {
  expect(reverse("This is test Data")).toEqual("ataD tset si sihT");
});

test("Reverse function exists", () => {
  expect(reverse("Good Bye, Test")).toEqual("tseT ,eyB dooG");
});
