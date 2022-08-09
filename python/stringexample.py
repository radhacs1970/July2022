emptystr = str()

print ( emptystr)

singlequote = str ('hi')
doublequote = str ("good day")
triplequote = """I am document definiton 
string that can expand
to multiple lines to detail the functionality
of the function """

print( singlequote)
print ( doublequote)
print( triplequote )

# slicing example
slstr = "PYTHON"
print( 'example for  slicing ')
print( slstr[:])
print ( slstr[0:2])
print( slstr [:4])
print( slstr[2:])
print( slstr[2:5])

print( 'example for negative slicing ')
print( slstr[-4:])
print( slstr[-3: -1])
print( slstr[::-1])


# deleting a string

delstring = " to delete"
print (delstring)
del delstring

# repeat operation
color = " red "
print( color *4)

# example for in and not in string.
inExStr = "Welcome"
print( 'o' in inExStr)
print ( 'a' not in inExStr)

print ( 'com'  in inExStr)
print ( 'com' not in inExStr)


# format using % operator

x = 10
y = 11.3
mys = " hai "
print ( " Hi I am an integer %d\n  Hi I am an float   %f\n  Hi I am an string   %s\n"%(x,y,mys) )

# example of split function
spStr = " There are red circles, blue rectangles, black pentagors"
str2 = spStr.split()
print( " using default spaces : " , str2)
str3 = spStr.split(",")
print( " using commas : " , str3)
str4 = spStr.split('r')
print( " using letters: " , str4)

str5 = spStr.split("re")
print ("using re as delim", str5)

str6 = spStr.split('r', 3 )  # delimits max 3 parts
print( " using letters: " , str6)

#find example

fstr = "a new sentence to write"
str7 = fstr.find('new')
print ( str7)

str8 = fstr.find('a')
print ( str8)

str9 = fstr.find('old')
print ( str9)