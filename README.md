# filereader tasks by Pawan Intawongsa (5910545752)
I ran the tasks on a MSI laptop with 2.7@ GHz i7-6700HQ , and got these result:

Task | Time
--------------------------------------|-------:
Append 53744 chars to String | 0.865762 sec
Append 53774 chars to String | 0.003060 sec
Append 52539 chars to StringBuilder | 0.020104 sec

String take longest time because everytime we read a file to String, String will create a new Object so it take a longer time

BufferReader is 2nd fastest because it read String by line and add to a String so take a bit less time than add to String by char

StringBuilder is fastest because in StringBuilder its has an attribute char[] which mean it will update this array as like what you input in.And char[] will increase automatically when the input is more than its length
