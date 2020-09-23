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


print("\n")
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
	age = 25
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

#Boolean Expressions [True or False]
print("Boolean Expressions:")

boolOne = True
boolTwo = 3*3 == 9
boolThree = False
boolFour = 3*3 != 9

print(boolOne, boolTwo, boolThree, boolFour)
print(type(boolOne))

boolFive = "True"
print(type(boolFive))

#Relational and Boolean Operators
greaterThan = 7 > 5 #True
lesserThan = 5 < 7 #True
greaterThanEqualTo = 7 >= 7 #True
lesserThanEqualTo = 7 <= 7 #True

testAnd = (7 > 5) and (5 < 7) #True
testAndTwo = (7 > 5) and (5 > 7) #False
testOr = (7 > 5) or (5 < 7) #True
testOrSecond = (7 > 5) or (5 > 7) #True

testNot = not True #False

newLine()

#Conditional Statements
def drink(money):
	if money >= 2:
		return "You Have a Drink!"
	else:
		return "No Drink, Buddy!"

print(drink(3))
print(drink(1))

def alchohol(age, money):
	if (age >= 21) and (money >= 5):
		return "We are getting a Drink!"
	elif (age >= 21) and (money <5):
		return "Come back with enoug Money!"
	elif (age < 21) and (money >= 5):
		return "Good Try!!"
	else:
		return "Not Possible"

print(alchohol(21, 5))
print(alchohol(21, 4))
print(alchohol(20, 4))
print(alchohol(20, 5))

newLine()

#Lists - Mutable (Can be Changed) []
movies = ["The Interstellar", "3 Idiots", "After The Storm", "Grave of Fireflies"]

print(movies[1]) #Returning 2nd Item
print(movies[0]) #Returning 1st Item
print(movies[1:3]) #Returning Items from 1st till 3rd but not 3rd or afterwards
print(movies[1:4]) #Returning Items from 1st till 4th but not 4th or afterwards
print(movies[1:]) #Returning Items from 1st to end
print(movies[:2]) #Returning Items from 1st to till 2nd but not 2nd or afterwards
print(movies[-1]) #Returning last Item
print(len(movies))

movies.append("Hotarubi no Morie")
print(movies)

movies.pop() #Poping last Item from List
print(movies)

movies.pop(0) #Poping 1st Item from List
print(movies)

newLine()

#Tuples - Immutable (Can't be Changed) ()
grades = ("a", "b", "c", "d", "e")

print(grades[1])

newLine()

#Looping

#For Loops - Star to Finish of an Iteration
vegetables = ["cucumber", "spinach", "cabbage"]

for x in vegetables:
	print(x)

newLine()

#While Loops - Execute as long as True
i = 1

while i < 10:
	print(i)
	i += 1