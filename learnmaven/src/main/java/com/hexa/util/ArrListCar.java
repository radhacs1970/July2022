package com.hexa.util;

import java.util.ArrayList;
import java.util.Collections;

//// mvn exec:java -D exec.mainClass=com.hexa.util.ArrListCar

public class ArrListCar {
  public static void main(String[] args) {
    
    Car cOne = new Car(2000,"Alto",100000L);
    ArrayList<Car> cArr = new ArrayList<Car>();
    cArr.add(new Car(2022,"Ford",150000L));
    cArr.add(new Car(2000,"Alto",100000L));
    cArr.add(new Car(2010,"Indica",350000L));

    for ( Car c: cArr)
      System.out.println(c);

      // check if cOne is in cArr

      System.out.println(cArr.contains(cOne));
    System.out.println("Sort by Regno");
    Collections.sort( cArr);
    for ( Car c: cArr)
      System.out.println(c);

    Collections.sort(cArr, new SortbyBrand() );
    System.out.println("Sort by brand");
    for ( Car c: cArr)
      System.out.println(c);
  }
}