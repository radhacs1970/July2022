import java.util.Scanner;

enum Sports {  
  cricket(5), football (10), basketball(15);
  int value;
  private Sports( int  value ){
    this.value = value;
  }
}
public class EnumExample {
  enum Day {
    monday, tuesday, wednesday,thursday,friday
  }
public static void main(String[] args) {
  Day today = Day.wednesday;
  System.out.println(" today is  " + today);
  System.out.println( " ordinal of today is " + today.ordinal());
  System.out.println(" today name  is  " +today.name());
   // iterate through the enum values
   for (Day d : Day.values())
    System.out.println(d);

  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter a day ");
  String myday = sc.nextLine();

  Day newday =   Day.valueOf(myday);
  System.out.println( "value of myday is " + newday);
  System.out.println( "ordinal of myday is " + Day.valueOf(myday).ordinal());

  // iterate through the enum values
for (Sports sp : Sports.values()){
    System.out.println(sp.name() + " and its ordinal is " + sp.value);
}

}
}