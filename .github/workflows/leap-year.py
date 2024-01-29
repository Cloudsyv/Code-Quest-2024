import sys
import math
import string
cases = int(sys.stdin.readline().rstrip())
for caseNum in range(cases):
  Years = int(sys.stdin.readline().rstrip())
  for i in range(Years):
    Year = int(sys.stdin.readline().rstrip())
    if Year > 1582 and Year%4 == 0 and Year%100 != 0:
      print("Yes")
    elif Year%400 == 0:
      print("Yes")
    else:
      print("No")
