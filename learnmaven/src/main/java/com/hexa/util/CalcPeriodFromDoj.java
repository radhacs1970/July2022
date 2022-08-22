package com.hexa.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcPeriodFromDoj {
public static void main(String[] args) {
    LocalDate curDate = LocalDate.now();
    System.out.println(curDate);DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println( " current date is " + df.format(curDate));

    System.out.println("Enter Date of Joining... in the format dd/MM/yyyy");
    
    Scanner sc = new Scanner(System.in);
    String doj = sc.nextLine();
    
    LocalDate dojDate = LocalDate.parse(doj,df);
    // Number of days between today and date of joining.
    Period pf = Period.between(curDate, dojDate);
    System.out.println(" years " + pf.getYears() + 
                        " months " + pf.getMonths() + 
                        " days " + pf.getDays() );
}
}