# def func():
#     return 1
# func()
# def hello():
#     return "Hello!"
# hello()
# greet = hello

# def hello(name = 'Yo'):
#     print('Hello function has been executed')

#     def greet():
#         return '\t This is the greet() func inside hello!'

#     def welcome():
#         return '\t This is the welcome() func inside hello!'

#     # print(greet())

#     # print(welcome())

#     # print("This is the end of the func hello()")

#     print("I am going to return a function")

#     if name == 'Yo':
#         return greet
#     else:
#         return welcome

# # hello()

# # welcome()

# my_new_func = hello('Yo')

# print(my_new_func())

# def cool():
#     def super_cool():
#         return 'I am very cool, Yo'
#     return super_cool()


# some_func = cool()

# def hello():
#     return 'Yo'


# def other(some_def_func):
#     print('Other code runs here!')
#     print(some_def_func())


# other(hello)

def new_decorator(original_func):
    def wrap_func():
        print('Some extra code before the orignal function')

        original_func()

        print('Some extra code, after the original function')

    return wrap_func


# def func_needs_decorator():
#     print('I want to be decorated')


# decorated_func = new_decorator(func_needs_decorator)

# decorated_func()


@new_decorator
def func_needs_decorator():
    print('I want to be decorated')


func_needs_decorator()
