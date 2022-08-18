package com.hexa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// mvn exec:java -Dexec.mainClass=com.hexa.Custselectdb 
public class Custselectdb {

  static String mydbName = "july2022";
  static String url =
    "jdbc:mysql://localhost:3306/" + 
      mydbName + 
    "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
  static String userName = "root";
  static String password = "Password123";

  public static void main(String[] args) {
    // ensure that mysql dependency is done in POM xml
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    
      Connection conn = 
        DriverManager.getConnection(url, userName, password);

      Statement stmt = conn.createStatement();
      String sqlstr = "Select * from customer";
      ResultSet rs = stmt.executeQuery(sqlstr);
      while ( rs.next()){
        String custId = rs.getString("Cus_id");
        String custName = rs.getString("Cus_name");;
        String custPhone = rs.getString("Cus_phone");
        String custEmail = rs.getString("Cus_Email");
        int custWalletBal = rs.getInt("Cus_walletbal");
        int custLoginId = rs.getInt("Cus_Login_id");
        String custPassword = rs.getString("Cus_Password");

        String output = 
            "Customer [custId= " + custId + 
              ", Cust_name= " + custName + 
            ", custPhone = " + custPhone + 
            ", custEmail= " + custEmail + 
            ", custWalletBal= " + custWalletBal +
            ", custLoginId= " + custLoginId + 
            ", custPassword= " + custPassword
            + "]";
        System.out.println( output );
      }
      rs.close();
      stmt.close();
      conn.close();

      } catch (Exception e) {
       
      e.printStackTrace();
    }  


  }
}