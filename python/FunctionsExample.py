def greetanyDataType(name):
    """ This function greets the
        person with Good day """
    print( "hai " ,  name , " Have a Good Day !!! ")

greetanyDataType( 10+9j )
mystr = 'Monica'
greetanyDataType( mystr )


def greetStringOnly(name):
    """ This function greets the
        person with Good day """
    print( "hai " +  name + " Have a Good Day !!! ")

greetanyDataType( 'ganesh' )
mystr = 'Monica'
greetanyDataType( mystr )

def greetUsingdotFormat(name):
    """ This function greets the
        person with Good day """
    strm = "hai {} Good day".format(name)
    print( strm )

greetUsingdotFormat('ganeshaaa')
greetUsingdotFormat(100)


def createGreet(name):
    stmsg = "Good day " + name
    return stmsg

mygreet = createGreet( ' lalitha ')
print( mygreet)

#scope of the variable temp is with in function
# returns float
def calculateCommission(sal):
    temp = 0.05
    comm = sal * temp;
    return comm

salforme = 10000
mycomm = calculateCommission(salforme)
print ( ' salary  commission', salforme , ' ' , mycomm )

# functional arguments
def empdetails( eid, ename ):
    # "This prints a passed info into this function"
    print("Employee id: ", eid)
    print("Employee name ", ename)

empdetails('emp105','madhu')

# functional arguments
def empdetailsWithDefaultValue( eidv, enamev='Ajay' ):
    # "This prints a passed info into this function"
    print("Employee id: ", eidv)
    print("Employee name ", enamev)

empdetailsWithDefaultValue('emp109','Arvind')
empdetailsWithDefaultValue(108)

# order of arguments
empdetails(eid='107',ename='ganesh')
empdetails(ename='shiva', eid='108')
empdetails( 400, ename='Roja')
# empdetails(  ename='Roja', 400 )
# positional argument follows keyword argument

empdetailsWithDefaultValue(eidv='emp110',enamev='Geetha')

empdetailsWithDefaultValue(enamev='karthik', eidv='emp111')
empdetailsWithDefaultValue( eidv='emp200')

# any number of arguments
def greetmany(*names):
    for nm in names:
        print (" hello ", nm )

greetmany( "meena","geetha", "uma", "mala")
greetmany("sundar")

lsname = ['megna','sushma','kavitha']
greetmany(lsname)  # list is considered as single argument

#for many argument sum the given numbers
# total is local variable. the visiblity is within the function block
def summation( *nums):
    total = 0
    for no in nums:
        total = total + no
    return total

gsum = summation( 10, 12, 14 )
print( 'total ' , gsum )

def multiply( mynum):
    val = mynum * gsum
    print( val , ' inside the function multiply')
    return val

myval = multiply(10)
print( 'value is ', myval )


# python return multiple values...

def arithmetic( n1, n2):
    a1 = n1 + n2
    s1 =  n1-n2
    m1 = n1*n2
    d1 = n1/n2
    # return all the four val
    return a1, s1, m1, d1

a,b,c,d = arithmetic(40,10)
print( ' add ', a , ' sub ', b, ' mul ', c , ' div ', d )


# **kwargs - variable number keyword arguments
def greetwithtitle(**titlename ):
    """ This is a doc string,,,  this function greets the title key and name key """
    print(titlename)
    print(titlename.keys())
    print(titlename.values())
    print(titlename.items())

greetwithtitle( title="Mr", name="latha")


def kwargExample(**data):
    for key, value in data.items():
        print('{} is {}'.format(key,value))

kwargExample(FirstName='Sita',LastName='Ram',Age=10)

# example of doc string

print(greetwithtitle.__doc__)


# example for pass
def factorial(n):
    pass

factorial(4)
