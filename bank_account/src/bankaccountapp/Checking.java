package bankaccountapp;

public class Checking extends Account {
  // List properties spectific to checking account
  int debitCardNumber;
  int debitCardPIN;

  // Constructor to initialize checking account
  public Checking(String name, String SSN, double initDeposit) {
    super(name, SSN, initDeposit);
    System.out.println("NEW CHECKING ACCOUNT");
    System.out.println("NAME : " + name);
  }

  // Methods specific to checking account
}