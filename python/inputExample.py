# example for input

myname =  input("Enter my name")
mycity = input("enter my city")

print( myname, ' live in ', mycity )

# getting integer
a  = input(" enter a number ")
b = int( input("enter a number "))

af = float( input(" enter a float"))

total = int(a) + b + af
print( total)

#split - using the spaces.
schoolname, rollno, batchno  = \
    input( "enter my schoolname, rollno, batchno").split()

print( " my details ",  schoolname )