package com.hexa.util;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {
public static void main(String[] args) {
  TreeSet<String> myFruits = new TreeSet<String>(); 
      myFruits.add("Banana");
      myFruits.add("Apple");
      myFruits.add("Orange");
      myFruits.add("Grape");
      myFruits.add("Mango");
      myFruits.add("StrawBerry");
      myFruits.add("Pomogrenate");
      // myFruits.add(null);// null pointer exception while execution.
      
      // creating iterator
    Iterator<String> iterator;
    iterator = myFruits.iterator();

    //Displaying the tree set data
    System.out.println("Tree set data: ");     
    while (iterator.hasNext()) {
       System.out.println(iterator.next() + " ");
    }


    SortedSet<String>  myfruitHS = 
        (SortedSet<String>) myFruits.headSet("Mango");
    System.out.println("headSet " + myfruitHS );

    SortedSet<String>  myfruitTS = 
        (SortedSet<String>) myFruits.tailSet("Mango");
    System.out.println("tailset " + myfruitTS );

    NavigableSet<String>  ns = myFruits.descendingSet();
    System.out.println( "descending Set " + ns );
}
}