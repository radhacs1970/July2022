#  Ordered , - List maintains the order of data insertion
# Changeable - List data can be modify the items
# Hetrogenous - It can contain data of different types
# Contains duplicates - in list data

# how to create a empty list

mylist1=[];
mylist2 = list();

# create and initialize a list
mylist3 = [1,2,3]
mylist4 = list( ('red','green', 'yellow'))

print ( 'emptylist ', mylist1, mylist2)
print( 'list3', mylist3)
print( 'list4', mylist4)

# create a hetrogenous list ie contaiing different data types

mylist5 = ['hai', 1, True, 2.3, 3+4j, ('a','b')]
print( ' example for hetrogenous list ', mylist5)

# print using for and in
for item in mylist5:
    print( 'individual item : ' , item)


# print using the range operator
for i in range (0, len(mylist5)):
    print('in the index ', i , ' the value is ', mylist5[i])

# print using slicing operator
print ( mylist5[2:4])

# using negative indexing
# print the value from the last index
print( mylist5[-1])

# print the value from the last index but one
print( mylist5[-2])

# add element to a list

mylist2.append('apple')
mylist2.append('orange')
mylist2.append('grapes')

print('after append', mylist2)

# insert in a specific location
mylist2.insert(1,'banana')
print('after insert in index 1', mylist2)

# extend the list by adding in the end
mystr = ["cherry", 'fruit']
mylist2.extend(mystr)

mylist2.extend(mylist3)

print( ' after 2 extends ', mylist2)

# remove a item from the list using the value  or using the index

mylistr = [1,2,3,4,5,4,3,4]
mylistr.remove(4)
print(mylistr)
# to remove all the occurence of a value then use the for loop

mylistr.pop(2)  # pop removes an element from the index.
print(mylistr)

mylistr.clear()

mylistcopy = mylist2.copy()
print(' copy the list ', mylistcopy)
mylistcopy.remove(1)
mylistcopy.remove(2)
mylistcopy.remove(3)

# sort happens on homogenous items only
mylistcopy.sort()
print( 'sorted ', mylistcopy )

mylistcopy.reverse()
print ( ' reverse order', mylistcopy )

mylistc = [1,2,3,2,1,3,1,1,5,7]  # list uses square brackets
print( 'count is ' , mylistc.count(1) )
# count gives how many times the value is occured

print( min(mylistc))
print( max(mylistc))

mylisti = [10,20,30]
mylisti += mylistc  # __add__
print( mylisti )

del mylistc
# print ( mylistc )
