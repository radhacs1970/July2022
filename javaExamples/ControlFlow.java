import java.util.Scanner;

public class ControlFlow {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   /*
    System.out.println(" Enter three integers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if ( a> b && a > c){
      System.out.println(" a is greater");
    } else if ( b > a && b > c){
      System.out.println( "b is greater");
    } else {
      System.out.println("c is greater");
    }
    */

    int daynum =0; // local variables are not initalized
    String weekday = "noday";

    System.out.println(" Enter number between 1-7 to represent weekday");
    daynum = sc.nextInt();
    //in order to clear buffer 
    sc.nextLine();
    System.out.println("Enter day is words ( eg Monday");
    weekday = sc.nextLine();
   


    switch ( daynum ){
      case 1:
        System.out.println(" 1 is sunday");
        break;
      case 2:
        System.out.println(" 2 is monday");
        break;
      case 3:
        System.out.println(" 3 is tuesday");
        // break is not written
        //example for falling through
      case 4:
        System.out.println(" 4 is wednesday");
        break;
      case 5:
      case 6:
      case 7:
        System.out.println(" entered case either 5, 6, 7");
        break;
      default:
        System.out.println(" entered default");
        break;
    }
    switch( weekday.toLowerCase() ){
      case "monday":
        System.out.println(" first day of the week.");
        break;
      case "wednesday":
        System.out.println(" third day of the week.");
        break;
      case "saturday":
      case "sunday":
        System.out.println(" weekend days !!");
        break;
    }

  }

}