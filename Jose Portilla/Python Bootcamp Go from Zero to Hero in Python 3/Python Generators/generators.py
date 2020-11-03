# def create_cubes(number):
#     result = []
#     for x in range(number):
#         result.append(x**3)
#     return result


# for x in create_cubes(10):
#     print(x)

# def create_cubes(number):

#     for x in range(number):
#         yield x ** 3


# for x in create_cubes(10):
#     print(x)

# print(create_cubes(100))

# print(list(create_cubes(10)))

# def gen_fibon(number):

#     a = 1

#     b = 1

#     for i in range(number):
#         yield a
#         a, b = b, a + b


# for number in gen_fibon(10):
#     print(number)

# def gen_fibon(number):
#     a = 1
#     b = 1

#     output = []

#     for i in range(number):
#         output.append(a)

#         a, b = b, a + b

#     return output


# for number in gen_fibon(10):
#     print(number)


# def simple_gen():
#     for x in range(3):
#         yield x


# for number in simple_gen():
#     print(number)

# g = simple_gen()

# print(next(g))
# print(next(g))
# print(next(g))
# # print(next(g))

s = 'hello'

# for letter in s:
#     print(letter)

s_iter = iter(s)

print(next(s_iter))
