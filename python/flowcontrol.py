print("FLOW CONTROL")
x = int( input('enter a number'))
y = int( input( 'enter second number'))
z = int( input( 'enter three number'))

if x%2 == 0:
    print( 'x is even')
else:
    print( 'x is odd')

print ("example and or condition ")
if ( x > y  and x > z ):
    print ( ' x is greater among the three values ', x ,y ,z )
elif ( y> x and y > z ):
    print(' y is greater among the three values ', x, y, z)
else:
    print(' z is greater among the three values ', x, y, z)

print ("example for or condition ")
if ( x > 10 or y > 10):
    print(' x or y is greater than 10' , x , y )

print("example for not condition ") #15 8 7
if (not( y > 10 or z > 10) ):
    print("either y or z is NOT greater than 10 number", y, z)

#example for in  and not in
print( "example for in  and not in ")
list1 = [10, 20, 30, 40]
print( 20 in list1)
print( 99 not in list1 )

if ( 30 in list1):
    print( "value is in list")
else:
    print( "value is not in list")