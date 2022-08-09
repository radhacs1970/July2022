print("*******  For Loop  ******")
list = [1, 2, 3, 4, 5]

sum = 0
for i in list:
     sum += i

print(sum)

words = ['mac', 'java', 'window']
for i in words:
    print(i, len(i))

#list1 = []  #empty list
#for i in range(1,5):
#    mystr = input("value to list")
 #   list1.append(mystr)
list1 = [ 'red', 'green','yellow','orange']
print("print my list ", list1)

# second way of printing
for i in range(len(list1)):
    print(' using for loop printing list index ', list1[i])

print( "example of default range starts from 0")
for i in range(10):
    print(i)
for i in range(2, 10, 2):
    print(i)

# example nested for loop
rows = int( input("number of rows to print "))
for i in range(0, rows):
    # inner loop
    for j in range(i):
        print( '*', end="")
    print()

for i in range(10):
    print("$", end="")
print()

number = 9
for i in range(1, 16):
    mul_table = number * i
    if ( i%2 == 0 ):
        continue
    if ( i >= 13 ):
        break
    print("{1} * {0} = {2}".format(number, i, mul_table))


for letter in 'Python':
    pass


