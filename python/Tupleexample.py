#  Ordered , - Tuple maintains the order of data insertion
#  UNChangeable - tuple data cannot be modified
# Hetrogenous - It can contain data of different types
# Contains duplicates - in tuple data  ()

tp1 = (1,2,3,4,5,6)
print( len(tp1))

tph1 = tuple((1, 2, 'hello', 2+3j, 'h', False,  [1,2,3] ))
for item in tph1:
    print('tuple item ' , item)

tp2 = ('p', 'y', 't', 'h', 'o', 'n')
for i in range (4):
    print(tp2[i])

# iterate using negative indexing
for i in range (-6,0):
    print(tp2[i] , end=", ")  # by default print end with new line
    # suppose if you want to change it to printin  the same line
    # end = ,
print()
print ( 3 in tp1)
print ( 99 not in tp1 )

print('max is {0}   min is  {1}'.format(  max(tp1), min(tp1)) )

tp3 = tp1 + tp2
print(tp3)