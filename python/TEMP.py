

# how to input from user the values list or set
# index in str

myStr = "hello"
print( myStr[2])

for  i in range( len(myStr)):
    print( myStr[i])


mylist= list();
for i in range(4):
    st=input('enter a value')
    mylist.append(st)

print( mylist )

mytuple = tuple(mylist)

print( mytuple)

myset= set();
for i in range(6):
    st=input('enter a unique value')
    myset.add(st)

print( myset )

mydict = dict()

mydict.__setitem__('niche', 'programming')

print( mydict )

for i in range(3):
    key= input("enter key")
    value = input( "enter value")
    mydict.__setitem__(key, value)

print( mydict )

