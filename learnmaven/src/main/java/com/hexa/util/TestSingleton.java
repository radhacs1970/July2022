package com.hexa.util;

public class TestSingleton {
public static void main(String[] args) {
  SingletonConfig sc = 
      SingletonConfig.getSingletonConfig();

  System.out.println(sc.getUrl());

  SingletonConfig sctwo = 
    SingletonConfig.getSingletonConfig();

    System.out.println(sctwo.getUrl());

  System.out.println(" same object references " + sc + "  " + sctwo );
  
  Object obj = sc;
  System.out.println(obj instanceof SingletonConfig);//true  

  System.out.println(obj instanceof Car);//false 
  // shape->rectangle->rectangle2d, implement interface freehand
  // shape s = new rectangle2d();
  // sysout( s instanceof rectangle2d);
  // sysout( s instanceof rectangle);
  // sysout( s instanceof shape ) ;
  // sysout( s  instance of freehand );
}
}