package bankaccountapp;

public class Saving extends Account {
  // List properties spectific to saving account
  int safetyDepositBoxID;
  int safetyDepositBoxKey;

  // Constructor to initialize saving account
  public Saving(String name, String SSN, double initDeposit) {
    super(name, SSN, initDeposit);
    this.accountNumber = "2" + this.accountNumber;
  }

  // Methods specific to saving account
  public void showInfo() {
    super.showInfo();
    System.out.println("ACCOUNT TYPE: SAVING");
  }
}