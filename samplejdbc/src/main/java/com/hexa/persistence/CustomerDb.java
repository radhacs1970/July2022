package com.hexa.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.hexa.model.Customer;

public class CustomerDb {
  static String mydbName = "july2022";
  static String url =
    "jdbc:mysql://localhost:3306/" + 
      mydbName + 
    "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
  static String userName = "root";
  static String password = "Password123";

  public static Customer[] fetchAllCustomersDb(){
      Customer[] cusArr=null;

      //create Arraylist;
      ArrayList<Customer> cusArrList = new ArrayList<Customer>();
      
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
         
          Customer cs = new Customer(custId,custName,
            custPhone,custEmail,custWalletBal,custLoginId,custPassword);         
          cusArrList.add(cs); // adding each row data to arraylist.           
        }
        int totalsize = cusArrList.size();
        cusArr = new Customer[totalsize]; // created the fixed array
        // copy from arraylist to array
        cusArr = cusArrList.toArray(cusArr);

        rs.close();
        stmt.close();
        conn.close();
  
        } catch (Exception e) {
         
        e.printStackTrace();
      } 
      return cusArr;
  }
  public static int insertCustomerDb( String custId,
    String custName,String custPhone,
    String custEmail, int custWalletBal,
    int custLoginId, String custPassword){
      int retval=0;
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
      
        Connection conn = 
          DriverManager.getConnection(url, userName, password);

        String sqlstr = " Insert into Customer( Cus_id, Cus_name, " +
        " Cus_phone, Cus_Email, Cus_walletbal, Cus_Login_id, Cus_Password) "+
          "values(?,?,?,?,?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sqlstr);
        ps.setString(1,custId);
        ps.setString(2,custName);
        ps.setString(3,custPhone);
        ps.setString(4,custEmail);
        ps.setInt(5,custWalletBal);
        ps.setInt(6, custLoginId);
        ps.setString(7, custPassword);

        retval = ps.executeUpdate();
        System.out.println( retval + " is inserted");

      }catch (Exception e) {
        e.printStackTrace();
      } 
      return retval;
    }

//Update Customer set cust_walletBal = cust_walletBal + 3000 
// where cust_id = 1;
  public static int updateCustWalletBalDb( String custId, int incBal){
      int retval = 0;
      try{
  
        Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
        Connection con = DriverManager.getConnection(  
            url,userName, password); // Get the Connection

//  Update Customer set cus_walletBal = cus_walletBal + 3000 
    // where cus_id = 1;
        String sqlStr = 
          " Update Customer " + 
            " set cus_walletBal = cus_walletBal + ? " +
            " where cus_id = ?" ;
        PreparedStatement ps = con.prepareStatement(sqlStr);
        ps.setInt(1, incBal);
        ps.setString(2,custId);
        retval = ps.executeUpdate();     
    
      }catch (Exception e) {
        e.printStackTrace();
      } 
      return retval;
    }
  public static int cusDeleteGivenIdDb(String custId){
    int retval = 0;
    try{

        Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
        Connection con = DriverManager.getConnection(  
            url,userName, password); // Get the Connection

      // delete from Customer where cus_id = 'C0001'

      String sqlstr = " delete from Customer where cus_id = ?";

      PreparedStatement ps = con.prepareStatement(sqlstr);
      ps.setString(1, custId);
      retval = ps.executeUpdate();


      }catch (Exception e) {
        e.printStackTrace();
      }      
    return retval;
  }
    public static Customer validateCustomerLoginDb( 
      int custLoginId, String custPassword){
      Customer cs = null;
      try{
  
        Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
        Connection con=DriverManager.getConnection(  
            url,userName, password); // Get the Connection
        // select * from customer where Cus_Login_id = ? and Cus_Password = ? 
      String sqlstr = "select * from customer where Cus_Login_id = ? and Cus_Password = ? ";
      PreparedStatement ps = con.prepareStatement(sqlstr);
      ps.setInt(1, custLoginId);
      ps.setString(2, custPassword);
      ResultSet rs = ps.executeQuery();
      if( rs.next()){
          String custId = rs.getString("Cus_id");
          String custName = rs.getString("Cus_name");;
          String custPhone = rs.getString("Cus_phone");
          String custEmail = rs.getString("Cus_Email");
          int custWalletBal = rs.getInt("Cus_walletbal");
          int custLoginIdnew = rs.getInt("Cus_Login_id");
          String custPasswordnew = rs.getString("Cus_Password");
         
          cs = new Customer(custId,custName,
            custPhone,custEmail,custWalletBal,
              custLoginIdnew,custPasswordnew); 
      }
      }catch(Exception e){
        System.out.println( e.getMessage());
      }     
      return cs;
    }
}