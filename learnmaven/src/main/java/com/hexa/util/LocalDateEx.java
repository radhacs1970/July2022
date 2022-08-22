package com.hexa.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

// mvn exec:java -D exec.mainClass=com.hexa.util.LocalDateEx

public class LocalDateEx {
  public static void main(String[] args) {
    
    LocalDate curDate = LocalDate.now();
    System.out.println(curDate);
    DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println( " current date is " + df.format(curDate));

    System.out.println("Enter Date of Joining... in the format dd/MM/yyyy");
    
    Scanner sc = new Scanner(System.in);
    String doj = sc.nextLine();
    
    LocalDate dojDate = LocalDate.parse(doj,df);

    System.out.println(" Date of Joining is : " + dojDate.toString());

    System.out.println(" Day of Joining is : " + dojDate.getDayOfMonth());
    System.out.println(" Month of Joining is : " + dojDate.getMonth());
    System.out.println(" Year of Joining is : " + dojDate.getYear());

    // You are confirmed after 6 months
    LocalDate confirmD = dojDate.plusMonths(6);
    System.out.println(" Date of Confirmation is : " + confirmD.toString());
   
  }

}