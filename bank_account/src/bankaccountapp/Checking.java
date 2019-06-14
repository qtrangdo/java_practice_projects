package bankaccountapp;

public class Checking extends Account {
  // List properties spectific to checking account
  private int debitCardNumber;
  private int debitCardPIN;

  // Constructor to initialize checking account
  public Checking(String name, String SSN, double initDeposit) {
    super(name, SSN, initDeposit);
    this.accountNumber = "1" + this.accountNumber;

    setDebitCard();
  }

  @Override
  public void setRate() {
    rate = getBaseRate() * 1.15;
  }

  private void setDebitCard() {
    this.debitCardNumber = (int) (Math.random() * Math.pow(10,12));
    this.debitCardPIN = (int) (Math.random() * Math.pow(10,4));
  }

  // Methods specific to checking account
  public void showInfo() {
    System.out.println("ACCOUNT TYPE: CHECKING");
    super.showInfo();
    System.out.println("FEATURES: " + 
      "\n  Debit Card Number: " + debitCardNumber + 
      "\n  Debit Card PIN: " + debitCardPIN
    );
  }
}