
public final class Trainee  extends Employee{
  final int PASSMARK = 75;
  static String location = "Chennai";
  public static String companyName; 
  static final int MAXMARK = 100;
  private String tech;

  static {
    System.out.println(" inside static block of trainee");
    companyName = " Hexawarsity Learning International";
  }
  public static void dispCompanyName(){
    System.out.println(companyName );
  }
/*
  public  float calcCommission(int percent ){
    float val = 0.0f;
    val = SALARY * (percent-1) / 100;
    return val;
  }
  */
}