// creating class, instanting object
// using default constructor, 
// changing to no arg constructorm multiple arg constructot
// This acting as java bean
public class Student   {
  private String name;
  private int rollno;
  // a instance block is created inside a class but outside all methods.

  {
    System.out.println(" instance block is invoked");
    rollno= 888;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public void setRollno(int rollno){
    this.rollno = rollno;
  }
  public int getRollno(){
    return  this.rollno;
  }
// Order of execution
// 1. Object is created using new 
// 2. instance block is executed
// 3. constructor is executed.

  // instead of default of constructor changed to no arg constructor
  public Student(){
    System.out.println(" No arg constructor is caled");
    this.name = "ananmika";
    //this.rollno = 999;
  }
  // two argument constructor
  public Student( String name, int rollno){
    this.name = name;
    this.rollno = rollno;
  }

  void showStudentDetails(){
    System.out.println("Name of the Student is " + 
    this.name + 
    " roll no is " + rollno );
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", rollno=" + rollno + "]";
  }

}