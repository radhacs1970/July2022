package com.hexa.model;

public class Customer {
  private String cusId;
  private String cusName;
  private String cusPhone;
  private String cusEmail;
  private int cusWalletbal;
  private int cusLoginId;
  private String cusPassword;

  public Customer(){

  }

  public Customer(String cusId, String cusName, String cusPhone, 
      String cusEmail, int cusWalletbal, int cusLoginId,
      String cusPassword) {
    this.cusId = cusId;
    this.cusName = cusName;
    this.cusPhone = cusPhone;
    this.cusEmail = cusEmail;
    this.cusWalletbal = cusWalletbal;
    this.cusLoginId = cusLoginId;
    this.cusPassword = cusPassword;
  }

  public String getCusId() {
    return cusId;
  }

  public void setCusId(String cusId) {
    this.cusId = cusId;
  }

  public String getCusName() {
    return cusName;
  }

  public void setCusName(String cusName) {
    this.cusName = cusName;
  }

  public String getCusPhone() {
    return cusPhone;
  }

  public void setCusPhone(String cusPhone) {
    this.cusPhone = cusPhone;
  }

  public String getCusEmail() {
    return cusEmail;
  }

  public void setCusEmail(String cusEmail) {
    this.cusEmail = cusEmail;
  }

  public int getCusWalletbal() {
    return cusWalletbal;
  }

  public void setCusWalletbal(int cusWalletbal) {
    this.cusWalletbal = cusWalletbal;
  }

  public int getCusLoginId() {
    return cusLoginId;
  }

  public void setCusLoginId(int cusLoginId) {
    this.cusLoginId = cusLoginId;
  }

  public String getCusPassword() {
    return cusPassword;
  }

  public void setCusPassword(String cusPassword) {
    this.cusPassword = cusPassword;
  }

  @Override
  public String toString() {
    return "Customer [ " +  "cusId= " + cusId +  
        ", cusName=" + cusName +
        ", cusPhone=" + cusPhone + 
        ", cusEmail=" + cusEmail +
         ", cusWalletbal=" + cusWalletbal + 
         ", cus Logi Id=" + cusLoginId + 
         ", cusPassword=" + cusPassword +
         "]";
  }

  
}