# # Creating Function
# def sayHello(name='Mr. Robot'):
#     """
#     Prints Hello and Name.
#     """
#     print('Hello ' + name)
# # sayHello('Mr. Robot')
# # sayHello('Yo')
# # Returning Value


# def getSum(numOne, numTwo):
#     total = numOne, numTwo
#     return total


# # print(getSum(1, 2))
# numSum = getSum(1, 2)


# def addOneToNum(num):
#     num += 1
#     return num


# num = 5
# newNum = addOneToNum(num)
# print(newNum)

# Lambda Function
getSum = lambda numOne, numTwo : numOne + numTwo

print(getSum(9, 2))

addOneToNum = lambda num : num + 1
print(addOneToNum(10))
