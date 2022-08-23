package com.hexa.util;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEx1 {
  public static void main(String[] args) {
    
    HashMap<Integer, String>ahm =
      new HashMap<Integer,String>();
    
    ahm.put(100,"Hundered");
    ahm.put(200,"Two hundred");
    ahm.put(12,"Twelve");
    ahm.put(15,"Fifteen");
    ahm.put(90,"Ninety");
    String oldvalue = ahm.put(90, "New Ninety");

    System.out.println(" old value " + oldvalue );
    System.out.println( ahm );

    // print using entryset
    for ( Entry<Integer, String> es : ahm.entrySet())
      System.out.println(es.getKey() + " - " + es.getValue() );
  }
}