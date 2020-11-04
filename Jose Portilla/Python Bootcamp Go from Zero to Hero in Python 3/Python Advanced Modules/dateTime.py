import datetime

t = datetime.time(5, 25, 1)

print(t)

print(t.microsecond)

print(datetime.time.min)

print(datetime.time.max)

print(datetime.time.resolution)

print(datetime.date.today())

print(datetime.date.today().timetuple())

print(datetime.date.today().day)

print(datetime.date.max)

print(datetime.date.min)

print(datetime.date.resolution)

dateOne = datetime.date(2015, 3, 11)

print(dateOne)

dateTwo = dateOne.replace(year=1990)

print(dateTwo)

print(dateOne - dateTwo)
