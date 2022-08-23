package com.hexa.util;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(10);
    al.add(20);
    al.add(30);
    System.out.println("length is " + al.size());
    ArrayList<Integer> a2 = new ArrayList<Integer>();
    a2.add(10);
    a2.add(20);
    a2.add(30);
    a2.add(40);
    a2.add(50);
    a2.add(60);
    for ( Integer i: al)
    System.out.println( i ); 

    Iterator<Integer> it = a2.iterator();
  
    while(it.hasNext())
      System.out.println(it.next() );

    // check for an value
    Integer iOne = 10;
    int itwo = 30;

    System.out.println("if a2 contains 10 " + a2.contains(iOne));
    System.out.println("if al contains 20 " + al.contains(itwo));

    System.out.println( " a2 contains all values of al " + 
          a2.containsAll(al) );
         
    a2.add(2,90);
    System.out.println( " after adding in index 2 " + a2 );

    System.out.println( " a2 removes all values of al " + 
          a2.removeAll(al) );

    Integer iVal = 10;
    System.out.println(al.remove(iVal));
    System.out.println(" After the removal of 10 from al " + al );

    al.clear();
    System.out.println("it is empty " + al);
    System.out.println( " IS EMPTY " + al.isEmpty());
  }

}