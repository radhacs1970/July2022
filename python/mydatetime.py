from datetime import time , timedelta, datetime as ds

# calling the constructor
my_time = time(12, 14, 00)

print("Entered time", my_time)

# calling constructor with 1
# argument
mynewtime =  time(hour=2,minute=55,second=30,microsecond=100)

print( mynewtime )
my_time = time(minute=12)
print("\nTime with one argument", my_time)

# Calling constructor with
# 0 argument
my_time = time()
print("\nTime without argument", my_time)
print("hour =", my_time.hour)
print("minute =", my_time.minute)
print("second =", my_time.second)
print("microsecond =", my_time.microsecond)


# date2 = date1 + timedelta
today = ds.now()
date2 = today +  timedelta(days=5)
print( date2 )