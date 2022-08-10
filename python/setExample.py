# Set is :
    # UnOrdered: does not follow data insertion order by user
    # UnChangeable: But can insert or append
    # Hetrogenous
    # Unique :  No Duplicate data allowed  {}

emptyset = set() # creation of empty set
print(type(emptyset))


s1 = { 'red', '3', ' 3+4j'}
s2 = set(('apple', 'pine', 'grapes', 'orange', 'pine', 'grapes' ))

print(s1)
print(s2)
print(type(s1))
print(type(s2))
print ('apple' in s2)
print( 'banana' not in s2 )
print( 'leng is ', len(s2))
s2.add('pomogeranate')
s2.update(['blueberry', 'strawberry'])

print(s2)

# difference, intersection, superset, subset
color1 = {'red','green','blue','yellow'}
color2 = { 'red','yellow','orange', 'black', 'white'}
color3 = { 'orange','white'}
c3 = color1.union(color2)
print( 'union'  ,  c3 )

c4 = color1.intersection(color2 )
print(' intersection ', c4 )

#color1 = {'red','green','blue','yellow'}
#color2 = { 'red','yellow','orange', 'black', 'white'}

c5 = color1.difference(color2)
print( ' difference ', c5 )

c6 = color2.difference(color1)
print( ' difference ', c6 )


print( 'subset is ' , color3.issubset(color2))
print(  'super is   ' , color2.issuperset(color3))

print( ' is disjoint ', color1.isdisjoint(color2))   #false
print( ' is disjoint ', color1.isdisjoint(color3))   #true

# sorted set
cset = sorted(color1)
print( cset )
print ( type(cset))

