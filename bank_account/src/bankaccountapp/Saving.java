package bankaccountapp;

public class Saving extends Account {
  // List properties spectific to saving account
  int safetyDepositBoxID;
  int safetyDepositBoxKey;

  // Constructor to initialize saving account
  public Saving(String name, String SSN, double initDeposit) {
    super(name, SSN, initDeposit);
    this.accountNumber = "2" + this.accountNumber;
    System.out.println("NEW SAVING ACCOUNT");
    System.out.println("NAME : " + name);
    System.out.println("YOUR ACCOUNT NUMBER: " + this.accountNumber);
  }

  // Methods specific to saving account
}