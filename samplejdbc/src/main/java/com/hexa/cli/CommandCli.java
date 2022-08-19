package com.hexa.cli;

import java.util.Scanner;

import com.hexa.factory.CustomerFactory;
import com.hexa.model.Customer;
// mvn exec:java -D exec.mainClass=com.hexa.cli.CommandCli 
public class CommandCli {

  Scanner sc = new Scanner(System.in);
  boolean inloop = true;
  
  private void mainMenu() {
    while( inloop ){
      System.out.println("Demo Customer Management System");
      System.out.println("-----------------------");
      System.out.println("1. Show all Customer");
      System.out.println("2. Insert a Customer");
      System.out.println("3. Update Wallet Balance");
      System.out.println("4. Customer Login validation");
      System.out.println("5. Customer Delete");
      System.out.println("6. Exit");
      mainMenuDetails();
    }
  }

  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int mOption = sc.nextInt();
      sc.nextLine();
      switch (mOption) {
        case 1:
          showAllCustomer();
          break;
         case 2:
          InsertACustomer();
          break;
         case 3: 
          UpdateWalletBalance();
          break;
         case 4:
          CustomerLogin();
          break; 
         case 5:
          CustomerDelete(); 
          break;
        case 6:
          inloop = false;
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose number between 1 to 6");
      }
    } catch (Exception e) {
      //e.printStackTrace();
      System.out.println("enter a valid value");
    }
   
  }
  private void showAllCustomer(){
    Customer[] cArr = CustomerFactory.fetchAllCustomers();
    
    for ( Customer cs : cArr){
      System.out.println(cs);
    }
  }
  private void InsertACustomer(){
    System.out.println( " Input Customer Details: ");

    System.out.println(" Enter unique Customer Id: ");
    String custId = sc.nextLine();

    System.out.println(" Enter Customer Name: ");
    String custName = sc.nextLine();

    System.out.println(" Enter Customer Phone: ");
    String custPhone = sc.nextLine();

    System.out.println(" Enter Customer Email: ");
    String custEmail = sc.nextLine(); // radha@gmail.com <enterkey>

    System.out.println(" Enter Customer Wallet Balance: ");
    int custWalletBal = sc.nextInt(); //9000 
    sc.nextLine(); // to eliminate the <enterKey> from the keyboard buffer

    System.out.println(" Enter Customer Login Id: (numbers) ");
    int custLoginId = sc.nextInt();
    sc.nextLine();

    System.out.println(" Enter Customer Password Id: ");
    String custPassword = sc.nextLine();


    int retval = CustomerFactory.insertCustomer(custId, custName, 
          custPhone,  custEmail, custWalletBal, 
          custLoginId, custPassword);

    if ( retval > 0 )
        System.out.println( " Successfully inserted !!! ");
    else
        System.out.println( "Ensure proper customer id and all other data");
  }

  private void UpdateWalletBalance(){
    System.out.println(" Enter the Customer Id :");
    String custId = sc.nextLine();
  
    System.out.println( " Increment your wallet to by adding the amount: ");
    int incBal = sc.nextInt();
    sc.nextLine();

    int retval = CustomerFactory.updateCustWalletBal(custId, incBal);

    if ( retval > 0){
      System.out.println( " Wallet is updated Successfully");
    } else {
      System.out.println(" Check the customer Id and ensure correct data...");
    }
  }
  private void CustomerLogin(){
    System.out.println( " Login of Customer  ");

    System.out.println("Login Id:");
    int custLoginId = sc.nextInt();
    sc.nextLine();

    System.out.println( "Password:");
    String custPassword = sc.nextLine();

    Customer cs = CustomerFactory.validateCustomerLogin(
      custLoginId, custPassword);
    if ( cs != null ){
      System.out.println( "LOGIN  SUCCESSFULL !!!!");
      System.out.println( cs );
    } else {
        System.out.println( " INVALID LOGIN.... ");
    }

  }
  private void CustomerDelete(){
    System.out.println(" Enter the Customer Id  to delete:");
    String custId = sc.nextLine();

    int retval = CustomerFactory.cusDeleteGivenId(custId );

    if ( retval > 0){
      System.out.println( " deleted row Successfully");
    } else {
      System.out.println(" Check the customer Id and ensure correct data...");
    }
  }
  public static void main(String[] args) {
    CommandCli cli = new CommandCli();
    cli.mainMenu();
  }
}