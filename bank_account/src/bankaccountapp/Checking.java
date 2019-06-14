package bankaccountapp;

public class Checking extends Account {
  // List properties spectific to checking account
  int debitCardNumber;
  int debitCardPIN;

  // Constructor to initialize checking account
  public Checking(String name, String SSN, double initDeposit) {
    super(name, SSN, initDeposit);
    this.accountNumber = "1" + this.accountNumber;

    setDebitCard();
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