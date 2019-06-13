package bankaccountapp;

public class Saving extends Account {
  // List properties spectific to saving account
  int safetyDepositBoxID;
  int safetyDepositBoxKey;

  // Constructor to initialize saving account
  public Saving(String name, String SSN, double initDeposit) {
    super(name, SSN, initDeposit);
    System.out.println("NEW SAVING ACCOUNT");
    System.out.println("NAME : " + name);
  }

  // Methods specific to saving account
}