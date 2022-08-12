class Student:

    def __init__(self , name, age, rollno):
        self.name = name
        self.__age = age  #private
        self._rollno = rollno #protected

    def showMyage(self):
        print( 'my age is ' , self.__age)

    def set_age(self, age ):
        self.__age = age

    def get_age(self):
        return self.__age

    def mydetails(self):
        print( ' name ', self.name , ' age: ', self.__age ,  " rollNo: ", self._rollno)


stName = input("enter name ")
stAge = int( input ( " enter age ") )
stRollNo = int ( input( "enter rollno") )

st1 = Student(stName, stAge, stRollNo )
print( st1.name )
print( st1._rollno)

# print( st1.__age)  # throw error


st1.showMyage()
st1.set_age( 22)
print( st1.get_age())

# get list of students example

stList = list()
for  i in range(4) :
    stName = input("enter name ")
    stAge = int(input(" enter age "))
    stRollNo = int(input("enter rollno"))
    stList.append( Student(stName,stAge,stRollNo) )

for item in stList :
     item.mydetails() # prints individual values.


