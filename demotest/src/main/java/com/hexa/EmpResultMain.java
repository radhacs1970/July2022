package com.hexa;

import java.util.HashMap;
import java.util.Map.Entry;

import com.hexa.services.EmpResult;

// mvn exec:java -D exec.mainClass=com.hexa.EmpResultMain
public class EmpResultMain {
  public static void main(String[] args) {
    EmpResult er = new EmpResult();

    er.addMarks("Anu", 88);
    er.addMarks("Varun", 69);
    er.addMarks("Thomas", 76);

    er.calcResult();

    HashMap<String, String> res = 
        er.getResult();

    for ( Entry<String, String> es : res.entrySet())
      System.out.println(es.getKey() + " - " + es.getValue() );
  }
}