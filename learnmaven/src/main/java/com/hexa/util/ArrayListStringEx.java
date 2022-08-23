package com.hexa.util;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStringEx {
  public static void main(String[] args) {
    ArrayList<String> arS = new ArrayList<String>(5);

    arS.add("green");
    arS.add("blue");
    arS.add("yellow");
    arS.add("black");
    arS.add("orange");
    arS.add("white");
    System.out.println(arS);

    Collections.sort( arS );
    System.out.println( "Sorted collection  " + arS );

    Collections.reverse( arS );
    System.out.println( "Reverse Sorted collection  " + arS );

    arS.remove("orange");
    arS.add("cyan");
    System.out.println(arS);

    arS.remove(0);
    System.out.println(arS);
  }
}