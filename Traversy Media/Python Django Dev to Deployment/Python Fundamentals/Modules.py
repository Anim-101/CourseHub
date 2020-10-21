# Core moduls
import datetime
from datetime import date
import time
from time import time
# today = datetime.date.today()
# today = date.today()
# timestamp = time()

# pip modules
import camelcase

# camel = camelcase.CamelCase()
# text = 'hello there world'
# print(camel.hump(text))

# Custom Modules
import Validator
from Validator import validate_email

email = 'test#text.com'

if validate_email(email):
    print("Email is valid")
else:
    print('Not an Email')