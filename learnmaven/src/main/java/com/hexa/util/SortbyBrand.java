package com.hexa.util;

import java.util.Comparator;

public class SortbyBrand implements Comparator<Car>{

  @Override
  public int compare(Car cOne, Car cTwo) {
         // compare via brand
    int result = 
      cOne.getBrand().compareTo(cTwo.getBrand());
    return result;
  }

}