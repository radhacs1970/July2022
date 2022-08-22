package com.hexa.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx{

  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);

    // from db you can get the Date as String 
    // rs.getString database datatype is dateTime you can get it as String
    // You can convert to local date or localDate time or Date in the 
    // following manner.
    String str = "2020-10-10 00:00:00"; //rs.getString("Booking_date");
    DateTimeFormatter formatter = 
      DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
    LocalDate ld1 = LocalDateTime.parse(str, formatter).toLocalDate();

    System.out.println("J8 from string : " + ld1);

    LocalTime lt = LocalTime.of(14,10,10);
    System.out.println(" Local time is " + lt);


    DateTimeFormatter f2 = 
      DateTimeFormatter.ofPattern("G dd/MMM/yyyy hh:mm:ss a"); 
    System.out.println( " Output the date and time in new format");
    System.out.println(ldt.format(f2));
    

    
  }
}