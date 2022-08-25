package com.hexa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    static String expPgmName;
    int expCount; 
    App ap;


    @BeforeClass
    public static void setup(){
        System.out.println(" this is static method called only once for initializing test class...");
        expPgmName = "Foundation Training";
    }

    @AfterClass
    public static void endApp(){
        System.out.println( " After class annotation method to clean static resources");
        expPgmName = null;
    }
    @Before
    public void initObject(){
        System.out.println(" initObject for each test case ");
        ap = new App();
    }

    @After
    public void tearDown(){
        System.out.println( " inside teardown executed for each test case");
        ap = null;
    }
     @Test
     public void testGetProgramName(){
         System.out.println("inside testGetProgramName");
         String tstStr = 
                App.getProgramName();
        assertEquals(expPgmName, tstStr);
     }

     @Test
     public void testGetTotalCount(){
         System.out.println( " Inside testGetTotalcount ");
         expCount = 99;
         int actCount = ap.getTotalCount();
         assertEquals(expCount, actCount);
     }

     @Test
     public void testGetTotalCount2(){
         expCount = 7;
         System.out.println( " Inside testGetTotalcount 2 ");
        
         int actCount = ap.getTotalCount();
         assertNotEquals(expCount, actCount);
     }

}
