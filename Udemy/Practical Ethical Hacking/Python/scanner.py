#!/bin/python

import sys
import socket
from datetime import datetime

#Defining Target
if len(sys.argv) == 2:
	target = socket.gethostbyname(sys.argv[1]) #Translating HostName to IPV4
else:
	print("Invalid Amount of Arguments")
	print("Sntax: python3 scanner.py <IP>")


#Adding Banner
print("-" * 50)
print("Scanning Target " + target)
print("Time Started: " + str(datetime.now()))
print("-" * 50)

try:
	for port in range(1, 65535):
		s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		socket.setdefaulttimeout(1)
		result = s.connect_ex((target, port)) #Returning an Error Indicator
		if result == 0:
			print("Port {} is open".format(port))
		s.close()

except KeyboardInterrupt:
	print("\nExiting program.")
	sys.exit()

except socket.gaierror:
	print("\nHostname could not be resolved.")
	sys.exit()

except socket.error:
	print("\nCould not connect to server.")
	sys.exit()