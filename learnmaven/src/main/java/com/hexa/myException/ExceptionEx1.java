package com.hexa.myException;

import java.util.Scanner;

// mvn exec:java -D exec.mainClass=com.hexa.myException.ExceptionEx1
public class ExceptionEx1 {
  public static void main(String[] args) {
    int[] iArr = null;
    Scanner sc = new Scanner(System.in);

    try {
      iArr = new int[] {22,23,24};
      iArr[0] = 10;
      
      int a = 10;
      System.out.println(" enter a value: ");
      int b = sc.nextInt();
      int k = a/b;

      System.out.println(" output is " + k );
      System.out.println( "accessing the 10th location" + iArr[9]);
    } catch ( NullPointerException | ArrayIndexOutOfBoundsException e){
      System.out.println( " Accessing the null object " 
          +  e.getMessage() );
    }   
    catch( ArithmeticException a ){
      System.out.println(" Catching the division exception \n " 
          + a.getMessage() );
    } catch( Exception e){
      System.out.println("All other exceptions " + 
                e.getMessage());
    } finally  {
      System.out.println( " finally will always be executed....");
    }
    System.out.println(" end of main method this is outside try and catch ");
  }
}