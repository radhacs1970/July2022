package com.hexa.factory;

import com.hexa.model.Customer;
import com.hexa.persistence.CustomerDb;

public class CustomerFactory {

  public static Customer[] fetchAllCustomers(){
    return CustomerDb.fetchAllCustomersDb();
  }

  public static int insertCustomer( String custId,
  String custName,String custPhone,
  String custEmail, int custWalletBal,
  int custLoginId, String custPassword){

    if ( custWalletBal <= 0 )
      return -1;
    return CustomerDb.insertCustomerDb(custId, custName, custPhone, 
        custEmail, custWalletBal, custLoginId, custPassword);

  }

  public static int updateCustWalletBal( String custId, int incBal){
    return CustomerDb.updateCustWalletBalDb(custId, incBal);
  }

  public static int cusDeleteGivenId( String custId ){
    return CustomerDb.cusDeleteGivenIdDb(custId);
  }

  public static Customer validateCustomerLogin( 
      int custLoginId, String custPassword){
        return CustomerDb.validateCustomerLoginDb(
          custLoginId, custPassword); 
      }
}