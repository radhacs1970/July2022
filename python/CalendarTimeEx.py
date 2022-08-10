import calendar
import time as tt

cal = calendar.month(2022, 8)
print( cal )
print(calendar.month_name[3])

currentTime= tt.localtime(tt.time())

print("Local current time is:", currentTime)

currentTime= tt.asctime ( tt.localtime(tt.time()) )
print("Local time:", currentTime )