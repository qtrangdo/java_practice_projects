package bankaccountapp;

public class Saving extends Account {
  // List properties spectific to saving account

  // Constructor to initialize saving account
  public Saving(String name) {
    super(name);
    System.out.println("NEW SAVING ACCOUNT");
    System.out.println("NAME : " + name);
  }

  // Methods specific to saving account
}