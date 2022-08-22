package com.hexa.myException;

public class ExceptionEx2 {

  static void methodWithtryFinally() throws ArithmeticException {
    try{
      int k = 9/0;
      System.out.println( " print k !!!! " + k );
    }finally {
      System.out.println( "Always executed... finally");
    }
  }
  static void methodWithtryCatch(){
    try{
      int k = 9/0;
      System.out.println( " print k !!!! " + k );
    }catch ( Exception e ) {
      System.out.println( "Exception handled. ");
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
   
    methodWithtryCatch();
    try {
    methodWithtryFinally();
    } catch ( ArithmeticException a){
      System.out.println( a.getMessage());
    }
  }
}