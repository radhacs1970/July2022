package com.hexa.util;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> hs = new HashSet<Integer>();
    hs.add(null);
    System.out.println( " Enter numbers, to exit press 999: ");
    while( true ){
      
      int k = sc.nextInt();
      sc.nextLine();
      if( k == 999 )
        break;
      boolean isAdded = hs.add(k);
      System.out.println( " value is added boolean : " + isAdded);
  }

  System.out.println( hs );

  boolean ret;
  HashSet<Car> ahc = new HashSet<Car>();
  ret  = ahc.add(new Car(2022,"Sumo",1600000l));  
  ret  = ahc.add(new Car(2010,"Audi",2600000l));
  ahc.add(new Car(2008,"Benze",1300000L));
  ahc.add(new Car(2009,"Amabasador",300000L));
  ahc.add(new Car(2018,"Celrio",300000L));

  Car cOne =  new Car(2010,"Audi",2600000l);
  ret  = ahc.add(cOne);
  System.out.println( " Adding again " + ret   );

  ret = ahc.contains(cOne);
  System.out.println( " contains returns : " + ret );


}
}