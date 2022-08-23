package com.hexa.util;

import java.util.Objects;

public class Car implements Comparable{
  private int regNo;
  private String brand;
  private Long price;

 public Car(){}

 public Car(int regNo, String brand, Long price) {
   this.regNo = regNo;
   this.brand = brand;
   this.price = price;
 }

 public int getRegNo() {
   return regNo;
 }

 public void setRegNo(int regNo) {
   this.regNo = regNo;
 }

 public String getBrand() {
   return brand;
 }

 public void setBrand(String brand) {
   this.brand = brand;
 }

 public Long getPrice() {
   return price;
 }

 public void setPrice(Long price) {
   this.price = price;
 }

 @Override
 public String toString() {
   return "Car [regNo=" + regNo + ", brand=" + brand + 
        ", price=" + price  + "]";
 }

 @Override
 public int hashCode() {
    int result = Objects.hash(regNo, brand, price);
   return result;
 }

 @Override
 public boolean equals(Object obj) {
   if (this == obj)
     return true;
   if (obj == null)
     return false;
   if (getClass() != obj.getClass())
     return false;
   Car other = (Car) obj;
   if (brand == null) {
     if (other.brand != null)
       return false;
   } else if (!brand.equals(other.brand))
     return false;
   if (price == null) {
     if (other.price != null)
       return false;
   } else if (!price.equals(other.price))
     return false;
   if (regNo != other.regNo)
     return false;
   return true;
 }

 @Override
 public int compareTo(Object o) {
    int result;
    Car c2 = (Car)o;
    result = this.regNo - c2.regNo;
    return result;
 }
 

}