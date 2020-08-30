const chunk = require("./index");

test("function chunk exists", () => {
  expect(typeof chunk).toEqual("function");
});

test("Chunk divides an array of 10 elements with chunk size 2", () => {
  const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  const chunked = chunk(array, 2);

  expect(chunked).toEqual([
    [1, 2],
    [3, 4],
    [5, 6],
    [7, 8],
    [9, 10],
  ]);
});

test("Chunk divides an array of 3 elements with chunk size 1", () => {
  const array = [1, 2, 3];
  const chunked = chunk(array, 1);

  expect(chunked).toEqual([[1], [2], [3]]);
});

test("Chunk divides an array of 5 elements with chunk size 3", () => {
  const array = [1, 2, 3, 4, 5];
  const chunked = chunk(array, 3);

  expect(chunked).toEqual([
    [1, 2, 3],
    [4, 5],
  ]);
});

test("Chunk divides an array of 13 elements with chunk size 5", () => {
  const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13];
  const chunked = chunk(array, 5);

  expect(chunked).toEqual([
    [1, 2, 3, 4, 5],
    [6, 7, 8, 9, 10],
    [11, 12, 13],
  ]);
});
