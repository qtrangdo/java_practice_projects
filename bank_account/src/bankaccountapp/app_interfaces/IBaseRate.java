package bankaccountapp.app_interfaces;

public interface IBaseRate {
  // Method that return a base rate
  default double getBaseRate() { return 2.5; }
}