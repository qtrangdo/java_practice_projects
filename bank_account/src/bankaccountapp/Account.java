package bankaccountapp;

public abstract class Account implements IBaseRate {
  // List common properties for checking and saving
  String name;
  String SSN;
  String accountNumber;
  double balance;
  double rate;


  // Constructor to set base properties and initialize the account
  public Account(String name, String SSN, double initDeposit) {
    this.name = name;
    this.SSN = SSN;
    this.balance = initDeposit;
    System.out.println(name + " " + SSN + " " + balance );
  }
  
  // List common methods
}
  
