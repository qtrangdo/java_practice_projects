package bankaccountapp;

public abstract class Account {
  // List common properties for checking and saving
  String name;
  String SSN;
  String accountNumber;
  double balance;
  double rate;
  static int index = 10001;


  // Constructor to set base properties and initialize the account
  public Account(String name, String SSN, double initDeposit) {
    this.name = name;
    this.SSN = SSN;
    this.balance = initDeposit;
    System.out.println(name + " " + SSN + " " + balance );

    // Set account number
    index++;
    System.out.println(setAccountNumber()); 
  }
  
  // Generate 11-digit account number: 1 or 2 depends on checking/saving, last 2 digit of SSN, unique 5-digit number, random 3-digit number
  private String setAccountNumber() {
    String lastTwoOfSSN = this.SSN.substring(this.SSN.length() - 2);
    int uniqueID = index;
    int randomNumber = (int) (Math.random() * Math.pow(10, 3));
    return lastTwoOfSSN + uniqueID + randomNumber;
  }
  // List common methods
}
  
