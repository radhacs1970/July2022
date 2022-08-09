print("Welcome Mavericks")

# learn on datatypes

a = 5
b=3.14
c= 5+8j
print ( a, type(a))
print( b, type(b))
print(c, type(c))

flagNo = False;
flagYes = True;

print( flagNo, type(flagNo))
print(flagYes, type(flagYes))

str1 = " Learning python"
print( str1, type(str1))

alist = [1,2,3,4]
print( alist, type(alist))

atuple = (a,b,c)
print( atuple, type(atuple))

aset = { 'red', 'green', 'blue'}
print( aset, type(aset))

# learning about instance
nf = 99.8
result = isinstance(nf , float )
print ( " is nf float ", result ) # returns true

result = isinstance(aset , float )
print ( " is aset a  float ", result ) # returns false


result = isinstance(aset , set )
print ( " is aset a  set ", result ) # returns true


 #dictionary with integer keys
my_dict = {1: 'apple', 2: 'ball',3:'red'}
print( my_dict)

# example of floor division
print ( ' example for floor division ')
m = 37
n = 7
print ( 'result of floor division is ' ,  m // n , 'Quotient ')

print ( 'result of modulo division is ' ,  m % n , ' is remainder')

