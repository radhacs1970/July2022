package com.hexa.util;

// mvn exec:java -D exec.mainClass=com.hexa.util.AutoboxUnboxEx

public class AutoboxUnboxEx {
  public static void main(String[] args) {
    
    int val = 7;

    // example auto boxing.
    Integer iObj = val;
    Integer iObjtwo = new Integer(val);
    Integer iObjthree = 8;
    Integer iObjfour = new Integer(7);
    System.out.print( " Autoboxing examples: ");
    System.out.print( iObj  + "  " + iObjtwo + "  " +
        iObjthree + "  " + iObjfour);
    System.out.println();

    // unboxing
    int k = iObj;
    int l = iObjtwo.intValue();
    String m = iObjthree.toString();
    System.out.println( " unboxing example: " + k + "  " + l + "  " + m );


  }
}