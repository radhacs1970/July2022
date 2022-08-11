class Student:
    school_name = 'vidhya Mandhir'

    def __init__(self, name='xxxx', age=18 ):
        self.name = name
        self.age = age

    def displayGreetings(self):
        print( " hai, great day ", self.name, self.age )

    @classmethod
    def showMySchoolName(cls):
        print( ' School Name is ', cls.school_name )

    @classmethod
    def changeMySchoolName(cls, newSchoolName):
        cls.school_name = newSchoolName
        print(' New School Name is ', cls.school_name)

    @staticmethod
    def find_notes(subjectname):
        return ['chap1', 'chap3','chap4']

s1 = Student('mega', 20)

s2 = Student( 'Arun', 19)

s3 = Student( 'Arvind ')
s4 = Student()


s1.displayGreetings()
Student.displayGreetings(s1)
Student.displayGreetings(s2)

s3.displayGreetings()
Student.displayGreetings(s4)

print( s1.name )
print( 's1 Name : ' , getattr(s1, 'name') )
print( 's2 Name : ' , getattr(s2, 'name') )
print( 's3 Name : ' , getattr(s3, 'name') )

setattr(s2, 'course' ,'java') # creating instance variable for s2 only

print( s2.course)

setattr(s1, 'skill' ,'singing')
s1.hobby = 'reading' # creating instance variable for s1 only

print( ' skill of s1 ', getattr(s1, 'skill'))

print( ' hobby of  s1 ', s1.hobby )

# example of dict function
print( ' instance variables with values in the objects.')
print( s1.__dict__ )
print( s2.__dict__ )
print( s3.__dict__ )
print( s4.__dict__ )



# example for class variable
print( 'School Name  is ', Student.school_name)
print( 'School Name  is ', s4.school_name)
Student.showMySchoolName()
s1.showMySchoolName()

Student.changeMySchoolName('DonBosco')
print( 'School Name  is ', Student.school_name)
s3.showMySchoolName()

#example of static method
val = Student.find_notes('science')
print( val )

s1.__delattr__('name')
#s1.displayGreetings() # throws error since the name is deleted

del s1

# print( s1.age ) # throws error since the s1 object is deleted
