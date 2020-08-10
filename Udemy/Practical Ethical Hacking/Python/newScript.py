#!/bin/bash
import sys #Importing Sys - Sys = A System Functions and Paramters
from datetime import datetime
from datetime import datetime as dt #Importin with Alias

print(sys.version)
print(datetime.now())
print(dt.now())

myName = "Anim"
print(myName[0])
print(myName[-1])

sentence = "This is a Sentence"
print(sentence[:4])
print(sentence.split())

sentenceSplit = sentence.split()
sentenceJoin = ' '.join(sentenceSplit)
print(sentenceJoin)

quote = "He said, 'Give me the Gun'"
print(quote)

quoteOne = 'He Said, "La, La, La"'
print(quoteOne)

quoteTwo = "He Said, \"Give me Love\""
print(quoteTwo)

tooMuchSpace = "		Hello"
print(tooMuchSpace.strip())

print("A" in "Apple")
print("a" in "Apple")

letter = "A"
word = "Apple"
print(letter.lower() in word.lower())

movie = "The Interstellar"
print("My Favorite Movie is " + movie + ".")
print("This is my Favorite move, {}.".format(movie))

print("\n")

#Dictionaries - Key / Value Pairs {}
drinks = {"White Russian": 7, "Old Fasion": 10, "Lemon Drop": 8} #Drink is Key and Price is Value (Key/Value) Pair

print(drinks)

employees = {"Finance": ["Bob", "Linda", "Tina"], "IT": ["Gene", "Loise", "Teddy"], "HR": ["Jimmy", "Mort"]}
print(employees)

employees["Legal"] = ["Mr. Frond"] #Adding new Key:Value Pair
print(employees)

employees.update({"Sales": ["Andy", "Ollie"]})
print(employees) #Adding new Key:Value Pair using Update

drinks['White Russian'] = 8
print(drinks)

print(drinks.get("White Russian"))