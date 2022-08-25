package com.hexa;

/**
 * Hello world!
 *
 */

 //mvn exec:java -D exec.mainClass=com.hexa.App
public class App 
{
    static String pgmName = "Foundation Training";
    int count = 99;

    public static String getProgramName(){
        return pgmName;
    }

    public int getTotalCount(){
        return count;
    }
    public static void main( String[] args )
    {
         System.out.println( getProgramName() );
         App ap = new App();
         
         System.out.println( ap.getTotalCount() ) ;
    }
}
