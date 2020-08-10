#!/bin/bash

if [ "$1" == "" ]
then
echo "You forgot to put an IP address!"
echo "Syntax: ./ipsweep.sh 192.168.1 <put an IP address you want to use this script for>"
else
for ip in `seq 1 254`; do
ping -c 1 $1.$ip | grep "64 bytes" | cut -d " " -f 4 | tr -d ":" &
done
fi