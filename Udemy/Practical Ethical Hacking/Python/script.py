#!/bin/python3

#Variables and Methods
quote = "Live Thy Life."
print(quote)
print(quote.upper()) #Upper() Funtion to Make it UpperCase
print(quote.lower()) #Lower() Function to Make it LowerCase
print(quote.title()) #Title() Function to Make it Title
print(len(quote)) #Prints Length of Characters of Quote


name = "Anim-101" #String
age = 25 #Integer
gpa = 3.56 #Float

print(int(age))
print(int(30.9))

print("My Name is "  + name + ", and I am " + str(age) + " years old.")

age +=1

print(age)

birthday = 1
age += birthday
print(age)

print("\n")

#Functions
print("Here is example of Function:")

def who_am_i(): #This is a Function
	name = "Anim-101"
	age = 30
	print("My Name is "  + name + ", and I am " + str(age) + " years old.")

who_am_i()

#Adding Parameter in Function
def add_one_hundred(num):
	print(num + 100)

add_one_hundred(16)

#Multiple Parameters in Function
def add(x, y):
	print(x + y)

add(8, 8)

def multiply(x, y):
	return x * y

print(multiply(8, 8))

def square_root(x):
	print(x ** .5)

square_root(64)

def newLine():
	print('\n')

newLine()