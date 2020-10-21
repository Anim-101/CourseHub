# Creating class
class User:
    # Constructor
    def __init__(self, name, email, age):
        self.name = name
        self.email = email
        self.age = age

    def greeting(self):
        return f"My Name is {self.name} and I am {self.age} years old :'( "

    def has_birthday(self):
        self.age += 1

# Init User Object
# user = User('Yo Yo', 'yo@yo.com', 20)
# janet = User('Janet', 'janet@yo.com', 30)

# # Editing Properties
# user.age = 38

# print(user.age)
# print(janet.age)

# janet.has_birthday()

# # Calling Method
# print(janet.greeting())


class Customer(User):
    def __init__(self, name, email, age):
        self.name = name
        self.email = email
        self.age = age
        self.balance = 0

    def set_balance(self, balance):
        self.balance = balance

    def greeting(self):
        return f"My name is {self.name} and I am {self.age} and I owe a balance of {self.balance}"

# Init Customer
john = Customer('John Doe', 'john@gamil.com', 40)

john.set_balance(500)

print(john.greeting())