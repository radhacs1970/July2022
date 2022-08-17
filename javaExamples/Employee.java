import java.util.Objects;

public class Employee {
  public static String companyName; 
  public static int empCount = 0;
  public final static int MAX_EMP = 10;

  static {
    System.out.println( " inside static block");
    companyName = "Hexaware Limited";
  }
  {
    System.out.println( " inside instance block ");
    incEmpCount();
  }
  public static void dispCompanyName(){
    System.out.println(companyName );
  }
  public static void incEmpCount(){
    if ( empCount > MAX_EMP)
      System.out.println( "Maximum employees reached");
    empCount++;
  }
  public static void showEmpCount(){
    System.out.println( " Employee created are : " 
      + Employee.empCount);
  }

  int empId;
  String empName;
  final int SALARY = 20000;

  public Employee() {
  }

  public Employee(int empId, String empName) {
    this.empId = empId;
    this.empName = empName;
  }

  public final float calcCommission(int percent ){
    float val = 0.0f;
    val = SALARY * percent / 100;
    return val;
  }
  @Override
  public String toString() {
    return "Employee [ empId= " + empId + 
        ", empName= " + empName + "]" + 
        "  fina SALARY= " + SALARY ;
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(empId,empName);
    return result;
  }
// for equals to execute the hashcode of two objects should be same.
// pl note even if hashcode is same for two objects
// that does not mean both the object contents are same.

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    if (empId != other.empId)
      return false;
    if (empName == null) {
      if (other.empName != null)
        return false;
    } else if (!empName.equals(other.empName))
      return false;
    return true;
  }


}