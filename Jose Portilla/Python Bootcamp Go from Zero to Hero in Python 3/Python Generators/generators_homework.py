# def gensquares(n):
#     for i in range(n):
#         yield i ** 2


# for x in gensquares(10):
#     print(x)

# import random

# random.randint(1, 10)


# def rand_num(low, high, n):

#     for i in range(n):
#         yield random.randint(low, high)


# for num in rand_num(1, 10, 12):
#     print(num)

my_list = [1, 2, 3, 4, 5]

gencomp = (item for item in my_list if item > 3)

for item in gencomp:
    print(item)
