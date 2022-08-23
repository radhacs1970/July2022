package com.hexa.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {
  public static void main(String[] args) {
    
    TreeMap<Integer, Car> tmc =
      new TreeMap<Integer, Car>();
    
      tmc.put(100, new Car(2022,"Sumo",1600000l));
      tmc.put(200, new Car(2010,"Audi",2600000l));
      tmc.put(103, new Car(2008,"Benze",1300000L) );
      tmc.put( 140, new Car(2009,"Amabasador",300000L) );
      tmc.put( 105,  new Car(2018,"Celrio",300000L) );

      System.out.println(tmc);

      //Print both key and value
    System.out.println( "Keys |   Values");
    Set set2 = tmc.entrySet();
    Iterator it2 = set2.iterator();
    while (it2.hasNext())
    {
        Map.Entry me =(Map.Entry)it2.next();

        System.out.printf(me.getKey() + "  |  "  
            + me.getValue().toString() );
        System.out.println("");
    }
  }
}