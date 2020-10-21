import json

# Sample JSON
userJSON = '{"firstName": "John", "lastName": "Doe", "age": 30}'

# Parsing into Dictionary
userDict = json.loads(userJSON)

print(userDict)
print(userDict['firstName'])

car = {'maker': 'Ford', 'model': 'Mustang', 'year': 1970}

carJSON = json.dumps(car)

print(carJSON)