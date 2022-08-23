package com.hexa.util;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCar {
  public static void main(String[] args) {
    
    TreeSet<Car> tCar = new TreeSet<Car>();
    tCar.add( new Car(2022,"Sumo",1600000l) );
    tCar.add( new Car(2010,"Audi",2600000l) );
    tCar.add( new Car(2008,"Benze",1300000L) );
    tCar.add( new Car(2009,"Amabasador",300000L) );
    tCar.add( new Car(2018,"Celrio",300000L) );
    
    boolean ret = tCar.add(new Car(2009,"Amabasador",300000L));
    System.out.println(" Adding again " + ret );

    for ( Car c : tCar)
      System.out.println(c);

    Car ele = new Car(2010,"Audi",2600000l);
    SortedSet<Car> cHeadSet = tCar.headSet(ele);
    System.out.println(cHeadSet );

    SortedSet<Car> cTailSet = tCar.tailSet(ele);
    System.out.println(cTailSet);
    
  }
}