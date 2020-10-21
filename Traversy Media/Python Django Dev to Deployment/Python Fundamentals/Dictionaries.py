# Creating a Dict
# person = {
#     'firstName': 'John',
#     'lastName': 'Doe',
#     'age': 30
# }

# Using a constructor
person = dict(firstName='John', lastName='Doe', age=30)

# Accessing Value
# print(person['firstName'])
# print(person.get('lastName'))

# Adding Key Value
# person['phone'] = '555-555-5555'

# # Get keys
# print(person.keys())

# # Get Values
# print(person.items())

# Making a copy
# personTwo = person.copy()
# personTwo['city'] = 'Boston'

# Removing Items
# del(person['age'])
# person.pop('lastName')

# clear
# person.clear()

# Getting Length

# print(len(person))

# List of Dictionary
people = [
    {'name': 'Martha', 'age': 40},
    {'name': 'Bob', 'age': 20},
    {'name': 'OReily', 'age': 30},
]

print(people[1]['name'])
