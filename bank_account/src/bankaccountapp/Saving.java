package bankaccountapp;

public class Saving extends Account {
  // List properties spectific to saving account
  private int safetyDepositBoxID;
  private int safetyDepositBoxKey;

  // Constructor to initialize saving account
  public Saving(String name, String SSN, double initDeposit) {
    super(name, SSN, initDeposit);
    this.accountNumber = "2" + this.accountNumber;

    setSafetyDepositBox();
  }

  @Override
  public void setRate() {
    rate = getBaseRate() - 0.25;
  }

  private void setSafetyDepositBox() {
    this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
    this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
  }

  // Methods specific to saving account
  public void showInfo() {
    System.out.println("ACCOUNT TYPE: SAVING");
    super.showInfo();
    System.out.println("FEATURES: " + 
      "\n  Safety Deposit Box ID: " + safetyDepositBoxID + 
      "\n  Safety Deposit Box Key: " + safetyDepositBoxKey
    );
  }

}