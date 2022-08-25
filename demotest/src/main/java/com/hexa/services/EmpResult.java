package com.hexa.services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmpResult {

  private HashMap<String, Integer> empMarks
      = new HashMap<String,Integer>();
  private HashMap<String, String> empRes
      = new HashMap<String,String>();
 
  public void addMarks(String st, Integer it ){
    empMarks.put(st, it);
  }

  public HashMap<String, Integer> getMarks(){
    return empMarks;
  }
  public HashMap<String, String> getResult(){
    return empRes;
  }
  public void calcResult(){
    Set empSet = empMarks.entrySet();
    Iterator it2 = empSet.iterator();
    while (it2.hasNext())
    {
        Map.Entry<String, Integer> me =(Map.Entry)it2.next();

        String keyStr = me.getKey();
        Integer val =  me.getValue();
        if ( val >= 75 ){
          empRes.put( keyStr, "pass");
        } else {
          empRes.put( keyStr, "fail");
        }        
    }
  }

}