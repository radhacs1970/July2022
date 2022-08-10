import random

print( random.randint (0,10) )

print( random.randrange(0, 10, 1) )

print( random.random() )

# random float number within a range
print(random.uniform(5.5, 25.5))
# Output 5.86390810771935

# random seed
random.seed(2)
print(random.randint(10, 20))
# 10
random.seed(2)
print(random.randint(10, 20))
# 10
