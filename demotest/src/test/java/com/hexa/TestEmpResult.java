package com.hexa;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map.Entry;

import com.hexa.services.EmpResult;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestEmpResult {


  EmpResult er;
  @Before
  public void setup(){
    er = new EmpResult();
    er.addMarks("geetha", 40);
    er.addMarks("anitha", 69);
    er.addMarks("latha", 76);
  }

  @After
  public void tearDown(){
    er = null;
  }

  @Test
  public void testCalcResult(){
    er.calcResult();

    HashMap<String, Integer> marksAct =
        er.getMarks();
    HashMap<String, String> resAct = 
            er.getResult();

            // validating the output resAct...
    for ( Entry<String, Integer> es : marksAct.entrySet()){
      String name = es.getKey();
      Integer marks = es.getValue();
      String passOrFail = resAct.get(name);

        if ( marks >= 75 ){
          assertEquals("pass" , passOrFail);
        } else {
          assertEquals("fail" , passOrFail);
        }

        System.out.println( " Name : " + name + " Marks: " + marks + 
           " Result: " + passOrFail);
    } 
  }
}