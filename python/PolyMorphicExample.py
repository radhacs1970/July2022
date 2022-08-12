class Shape:
    def drawShape(self):
        print(' drawing different types of shapes')

    def area(self):
        print( 'abstract no area can be made with this shape')

class Rectangle(Shape):
    def __init__(self, l, b):
        self.l = l
        self.b = b

    def area(self):
        ar = self.l * self.b
        print( 'rectangle length and breadth ', self.l, self.b)
        print ( 'rectangle area is' , ar )

# Overloading + operator with magic method
    def __add__(self, other):

        l = self.l + other.l
        b = self.b + other.b
        return  Rectangle(l, b)

# overloading * operator with magic method
    def __mul__(self, other):
        l = self.l * other
        b = self.b * other
        return Rectangle(l, b)


# apply

s = Shape()
s.drawShape()

rect = Rectangle(3,4)
rect.area()
rect.drawShape()

r1 = Rectangle ( 3,4 )
r2 = Rectangle ( 10, 20)
r3 = r1 + r2
r3.area()

r4 = r1 *  5
r4.area()

