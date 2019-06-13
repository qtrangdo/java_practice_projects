package bankaccountapp;

public class Checking extends Account {
  // List properties spectific to checking account

  // Constructor to initialize checking account
  public Checking(String name) {
    super(name);
    System.out.println("NEW CHECKING ACCOUNT");
    System.out.println("NAME : " + name);
  }

  // Methods specific to checking account
}