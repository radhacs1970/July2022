package com.hexa.myException;

import java.util.Scanner;

class AgeException extends Exception {
  String agEx;

  AgeException(String st) {
    super(st);
    this.agEx = st;
  }
}

public class ExceptionEx3 {
  Scanner sc = new Scanner(System.in);

  void checkVoterAge() throws AgeException {
    try {
      System.out.println(" Enter age of the voter");
      int age = sc.nextInt();
      if (age < 18) {
        AgeException ag = new AgeException("Voter is less than 18");
        try {
          throw (ag);
        } catch (AgeException e) {
          System.out.println( " inner try catch");
           throw e; 
        }
      }
      System.out.println( 
        " this is the line after the user inputed age " +
        "if the age is greater than 18 this line will be printed...");

    } catch (Exception e) {
      System.out.println( " outer try catch... caught here");
      throw e;
    }
  }

  public static void main(String[] args) /*throws AgeException*/ {
    ExceptionEx3 e3 = new ExceptionEx3();
     
      try {
      e3.checkVoterAge();
    } catch (AgeException e) {
       System.out.println( "Handled in main method " + e.getMessage() );
    }
    

  }

}