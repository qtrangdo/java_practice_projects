package bankaccountapp;

public class Checking extends Account {
  // List properties spectific to checking account
  int debitCardNumber;
  int debitCardPIN;

  // Constructor to initialize checking account
  public Checking(String name, String SSN, double initDeposit) {
    super(name, SSN, initDeposit);
    this.accountNumber = "1" + this.accountNumber;
    System.out.println("NEW CHECKING ACCOUNT");
    System.out.println("NAME : " + name);
    System.out.println("YOUR ACCOUNT NUMBER: " + this.accountNumber);
  }

  // Methods specific to checking account
}