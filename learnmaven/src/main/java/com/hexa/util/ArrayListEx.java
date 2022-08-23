package com.hexa.util;

import java.util.ArrayList;
import java.util.Iterator;
// mvn exec:java -D exec.mainClass=com.hexa.util.ArrayListEx
public class ArrayListEx {
    public static void main(String[] args) {
      
      // Collections  is a bag. it can hold any type of data

      String myname = "geetha";
      float mysal = 15500.40f;
      int myage = 25;
      boolean employed = true;

      ArrayList myData = new ArrayList();
      myData.add(myname);
      myData.add(mysal);
      myData.add(myage);
      myData.add(employed);

      System.out.println(myData);

      Iterator it = myData.iterator();
      while(it.hasNext()){
        System.out.println("using iterator " + it.next());
      }
      for ( Object o : myData)
        System.out.println( " using Object data type in for loop " + o );
    }

}