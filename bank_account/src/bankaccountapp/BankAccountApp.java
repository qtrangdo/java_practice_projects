package bankaccountapp;

public class BankAccountApp {
  public static void main(String[] args) {
    Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
    Saving savacc1 = new Saving("Nina Wilson", "483653982", 2500);
    
    chkacc1.showInfo();
    System.out.println("***************");
    savacc1.showInfo();

    // Read a CSV file when create new accounts based on that data
    // Auto generated method stub
  }
}