
public class TestEmployee {
  public static void main(String[] args) {
    /****
    System.out.println(Employee.MAX_EMP);
    System.out.println(Employee.companyName);
    System.out.println(Employee.empCount);
    Employee.dispCompanyName();
    
    Employee e1 = new Employee();
    float com = e1.calcCommission(7);
    System.out.println("commision is " + com);
    Employee.showEmpCount();

    Employee e2 = new Employee();
     com = e2.calcCommission(4);
    System.out.println("commision is " + com);
    e2.showEmpCount();

    Employee e3 = new Employee();
    com = e3.calcCommission(3);
    System.out.println("commision is " + com);
    e1.showEmpCount();

    //" pass mark: " + Trainee.PASSMARK + 
    System.out.println("max mark" + Trainee.MAXMARK + 
      " location " + Trainee.location +
      " company " + Trainee.companyName +
      " Emp Company " + Employee.companyName);
    
    Trainee.dispCompanyName();
    Employee.dispCompanyName();
 
    MavericksTrainee mt = new MavericksTrainee();

    **/

    // I want to compare two employees whether they are equal

    Employee e1  = new Employee(100,"geetha");
    Employee e2  = new Employee(200,"Ajay");
    Employee e3  = new Employee(100,"geetha");

    Employee e4 = e1;
    // compare the object reference
    // not the contents inside the object
    if ( e1 == e4 ){ 
      System.out.println(" e1 and e4 have same object reference");
    }

    if ( e1 == e2 ){
      System.out.println(" e1 and e2 have same object reference");
    } else {
      System.out.println(" e1 and e2 object reference are not same");
    }

    
    if ( e1.equals(e3) ){
      System.out.println(" e1 and e3 have same object content");
    } else {
      System.out.println(" e1 and e3 does not have same content");
    }

    if ( e1.equals(e2) ){
      System.out.println(" e1 and e2 have same object content");
    } else {
      System.out.println(" e1 and e2 does not have same content");
    }

    // Example using String
    System.out.println(" Exampe using String");
    String s1 = "Welcome";
    String s2 = "Welcome";
    String s3 = new String(s1);

    if ( s1 == s2 )
      System.out.println("s1 and s2 are same" );
      else
      System.out.println("s1 and s2 are not same" );


    if ( s1 == s3 )
      System.out.println("s1 and s3 are same" );
    else
      System.out.println("s1 and s3 are not same" );

    if ( s1.equals(s3) )
    System.out.println("s1 and s3 are same content" );
    else
      System.out.println("s1 and s3 are not same content" );
  }
}