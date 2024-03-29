package bankaccountapp;

import bankaccountapp.app_interfaces.IBaseRate;

public abstract class Account implements IBaseRate{
  // List common properties for checking and saving
  private String name;
  private String SSN;
  private double balance;
  protected String accountNumber;
  protected double rate;
  static int index = 10001;


  // Constructor to set base properties and initialize the account
  public Account(String name, String SSN, double initDeposit) {
    this.name = name;
    this.SSN = SSN;
    this.balance = initDeposit;

    // Set account number
    index++;
    this.accountNumber = setAccountNumber(); 

    setRate();
  }
  
  public abstract void setRate();

  // Generate 11-digit account number: 1 or 2 depends on checking/saving, last 2 digit of SSN, unique 5-digit number, random 3-digit number
  private String setAccountNumber() {
    String lastTwoOfSSN = this.SSN.substring(this.SSN.length() - 2);
    int uniqueID = index;
    int randomNumber = (int) (Math.random() * Math.pow(10, 3));
    return lastTwoOfSSN + uniqueID + randomNumber;
  }

  // List common methods
  public void showInfo() {
    System.out.println(
      "NAME: " + name + 
      "\nACCOUNT NUMBER: " + accountNumber + 
      "\nBALANCE: " + balance + 
      "\nRATE: " + rate + "%"
    );
  }

  public void compound() {
    double accruedInterest = balance * (rate/100);
    this.balance = this.balance + accruedInterest;
    System.out.println("Accrued Interest: " + accruedInterest);
  }

  public void deposit(double amount) {
    this.balance = this.balance + amount;
    printBalance();
  }

  public void withdraw(double amount) {
    if (amount <= this.balance) {
      this.balance = this.balance - amount;
    } else {
      System.out.println("Not enough in the balance for the requested withdraw amount");
    };
    printBalance();
  }

  public void transfer(String toWhere, double amount) {
    this.balance = this.balance - amount;
    System.out.println("Tranfering: $" + amount + " to " + toWhere);
    printBalance();
  }

  public void printBalance() {
    System.out.println("YOUR CURRENT BALANCE IS $" + this.balance);
  }
}
  
