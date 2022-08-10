def add(num1, num2 ):
    sum = num1 + num2
    return sum

def mul(num1, num2 ):
    sum = num1 * num2
    return sum

def addmany( *num ):
    sum=0
    for n in num:
        sum = sum + n
    return sum
