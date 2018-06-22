import sys
list1=[1,2,3,4]

print(list1[0])

print("Key: %s, Value: %s" %("word", 10))

rangelist = range(10)
print(rangelist)

def func(s, i):
    s+="!!!"
    i+=10
    return s, i

mystr = "Hello"
myint = 3
print(func(mystr, myint))
print((mystr,myint))

