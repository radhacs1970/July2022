emptydict = {}  # creation of empty dictionary
print(type(emptydict))


# dictionary  - unordered , key are unique,  mutable
person = {"name": "geetha", "age": "20", "location": "chennai"}
print(person)

# access the elements in dict
print( ' age is ', person['age'])

#get key value to get the value
print( person.get('location'))
print( person.get('name'))

# to get all the values
print('values are ', person.values())

# to get all the keys
print('keys are ', person.keys())

#print all items
print('items are ', person.items())


# iterate the dict
for key in person:
    print( key, ':', person[key])

for key_value in person.items():
    print(key_value[0], key_value[1])

#length of dict
print( 'length ' , len(person))

person["skill"]="singing"
person.update( {'languages': 'English Hindi'})
person['age'] =  24
print(person)

#deleting the dict keys
del person['age']
person.pop('skill')
print(person)

# check if keyname exists in dictionary

keyname = 'location'
if keyname in person.keys():
    print( 'location is present in  keys ' , person[keyname])
else:
    print( 'location is not in person keys ')

# sorted method to keys or values
print ( sorted(person))
print(sorted(person.keys()))
print(sorted(person.values()))
