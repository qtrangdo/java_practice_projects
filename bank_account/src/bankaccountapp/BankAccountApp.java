package bankaccountapp;

public class BankAccountApp {
  public static void main(String[] args) {
    Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
    Saving savacc1 = new Saving("Nina Wilson", "483653982", 2500);
    
    chkacc1.showInfo();
    System.out.println("***************");
    savacc1.showInfo();

    savacc1.deposit(38445.23);
    savacc1.withdraw(384597027);
    savacc1.withdraw(384.50);
    savacc1.transfer("MY HOME", 100);

    // Read a CSV file when create new accounts based on that data
    // Auto generated method stub
  }
}

