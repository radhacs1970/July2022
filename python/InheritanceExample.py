class Person:

    def __init__(self, name, age , ssn ):
        self.name  = name # public
        self._age = age  # protected
        self.__ssn  = ssn  #private
        print( ' person name ', name)

    def dispPersonDetails(self):
        print('inside person class ', self.name,
              ' ', self._age, ' ', self.__ssn)


# single level inheritance
class Employee(Person):
    def __init__(self, project, salary, name, age, ssn):
        self.project = project
        self.salary = salary
        print(' Employee project ', project)
        super().__init__(name, age, ssn)

    def dispEmpDetails(self):
        print('Employee information- project ',
              self.project, ' salary:  ', self.salary)
        print( "protected attribute from parent ", self._age)

class Company:

    def __init__(self, companyName):
        print( 'company name', companyName)
        self.companyName = companyName

    def company_info(self,  location):
        print( ' company details : ', self.companyName, ' location :', location)

# multiple inheritance
class regularEmp( Employee, Company):

    def __init__(self):
        Employee.__init__(self, 'Hotel manangement',20000,'Mega',21,99887)
        Company.__init__(self, 'hexaware')
        self.desig = 'programmer'

    def comEmpInfo(self):
        print('inheriting both Employee and company')
        print( 'designation is ', self.desig)
        self.company_info('Mumbai')
        self.dispEmpDetails()

# multilevel heritance   base - person, derived - employee,
class PartTimeEmployee(Employee):

    def __init__(self, numofhours, project, salary, name, age, ssn ):
        self.numofhours = numofhours
        super().__init__(project, salary, name, age, ssn)

    def ptempInfo(self):
        print( 'Part time employee details : ' ,  self.numofhours)
        super().dispEmpDetails()
        #self.dispEmpDetails()

#hierarchical inheritance
# person -> employee, actor, politician

class Actor(Person):

    def actorInfo(self):
        print("acting on action films ")

class Politician(Person):
    def polInfo(self):
        print( "politics details")

# hybrid inheritance
class ActNPol(Actor, Politician):
    def actAndPolitics(self):
        print( " Does Both Act ad Politics")


#applying the inheritance

pr1 = Person('rr',32,98122)
pr1.dispPersonDetails()

# example for single level inheritance
emp1 = Employee('CMS',20000,'geetha',20,78123)
emp1.dispEmpDetais()
emp1.dispPersonDetails()

# example of multiple inheritance
re = regularEmp()
re.comEmpInfo()

# example of multilevel inheritance
pem = PartTimeEmployee(6, 'Admin',9879,'jegan',30,87872)
pem.ptempInfo()
pem.dispPersonDetails()

# hierarchical Inheritance

pr2 = Person('lakshmi', 32, 76542)
pr2.dispPersonDetails()

er2 = Employee('ERP', 75000, 'Arun', 25, 12121)
er2.dispEmpDetails()

act1 = Actor('madhan', 25, 912121)
act1.dispPersonDetails()
act1.actorInfo()

pol = Politician('happ', 60, 10902)
pol.dispPersonDetails()
pol.polInfo()

# hybrid inheritance

actpol = ActNPol('arjun',20,89212)
actpol.actAndPolitics()
actpol.dispPersonDetails()
actpol.actorInfo()
actpol.polInfo()

