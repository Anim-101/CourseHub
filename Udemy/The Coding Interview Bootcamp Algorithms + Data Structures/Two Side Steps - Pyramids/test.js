const pyramid = require("./index");

beforeEach(() => {
  jest.spyOn(console, "log");
});

afterEach(() => {
  console.log.mockRestore();
});

test("pyramid is a Function", () => {
  expect(typeof pyramid).toEqual("function");
});

test("Prints a pyramid for number = 2", () => {
  pyramid(2);
  expect(console.log.mock.calls[0][0]).toEqual(" # ");
  expect(console.log.mock.calls[1][0]).toEqual("###");
  expect(console.log.mock.calls.length).toEqual(2);
});

test("Prints a pyramid for number = 3", () => {
  pyramid(3);
  expect(console.log.mock.calls[0][0]).toEqual("  #  ");
  expect(console.log.mock.calls[1][0]).toEqual(" ### ");
  expect(console.log.mock.calls[2][0]).toEqual("#####");
  expect(console.log.mock.calls.length).toEqual(3);
});

test("Prints a pyramid for number = 4", () => {
  pyramid(4);
  expect(console.log.mock.calls[0][0]).toEqual("   #   ");
  expect(console.log.mock.calls[1][0]).toEqual("  ###  ");
  expect(console.log.mock.calls[2][0]).toEqual(" ##### ");
  expect(console.log.mock.calls[3][0]).toEqual("#######");
  expect(console.log.mock.calls.length).toEqual(4);
});
