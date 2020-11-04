from collections import namedtuple

t = (1, 2, 3)

print(t[0])

Dog = namedtuple('Dog', 'age breed name')

sammy = Dog(age=2, breed='Lab', name='Sammy')

print(sammy.age)

print(sammy[1])

Cat = namedtuple('Cat', 'fur claws name')

c = Cat(fur='Fuzzy', claws=False, name='Kitty')

print(c.fur)

print(c[2])
