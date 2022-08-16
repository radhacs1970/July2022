// learning about primitive datatypes
public class DataTypes {
  static String companyName="Hexaware Limited"; // static variable
  final static float PI = 3.14f; // static final variable

  public static void main(String[] args) {
    int ivar; // local variables.
    float fvar;
    double dvar;
    char cvar;
    String svar;

    ivar = 100;
    fvar = 10.5f;
    dvar = 10.55;
    cvar = 'J';
    svar = "Java Programming";

    System.out.println(" Integer value :" + ivar);
    System.out.println(" float value :" + fvar);
    System.out.println(" Double value :" + dvar);
    System.out.println(" char value :" + cvar);
    System.out.println(" String value :" + svar);

    // static variable can be changed
    // classname.variable
    DataTypes.companyName = " The Hexaware International";
    System.out.println(DataTypes.companyName);
    System.out.println(DataTypes.PI);

    

  }

}