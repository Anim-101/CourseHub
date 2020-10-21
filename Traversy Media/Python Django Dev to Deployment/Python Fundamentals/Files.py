# Opening File
myFile = open('myfile.txt', 'w')

# Get Some Info
print('Name: ', myFile.name)
print('Is Closed: ', myFile.closed)
print('Opening Mode: ', myFile.mode)

# Writing to File
myFile.write('I Love Python')
myFile.write(' and JavaScript')
myFile.close()

# Appneding to File
myFile = open('myfile.txt', 'a')
myFile.write(' I also like PHP')
myFile.close()

# Read from a File
myFile = open('myfile.txt', 'r')
text = myFile.read(20)
print(text)