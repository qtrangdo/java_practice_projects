package emailapp;

import java.util.Scanner;

public class Email {
  private String firstname;
  private String lastname;
  private String password;
  private int defaultPasswordLength = 8;
  private String department;
  private int mailBoxCapacity = 500;
  private String email;
  private String alternateEmail;
  private String companySuffix = "company.com";

  //constructor for first name and last name
  public Email (String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
    // System.out.println("EMAIL CREATED : " + this.firstname + "." + this.lastname );

    // Call a method asking for department
    this.department = setDepartment();
    // System.out.println("Department: " + this.department);

    //Call a method that rerun the generated password
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("password: " + this.password);

    // Combine elements to creat email
    this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
    // System.out.println("Your email is: " + this.email);

  }

  // Ask for the department
  private String setDepartment() {
    System.out.print("DEPARTMENT CODES: \n1 for Sales\n2 for Developement \n3 for Accounting \n4 for None\nEnter code:");
    Scanner in = new Scanner(System.in);
    int deptChoice = in.nextInt();
    if (deptChoice == 1) { return "sales"; }
    else if (deptChoice == 2) { return "dev"; }
    else if (deptChoice == 3) { return "acc"; }
    else return "";
  }

  // Generate random password
  private String randomPassword(int length) {
    String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }

  // Set mailbox capacity
  public void setMailboxCapacity(int capacity) {
    this.mailBoxCapacity = capacity;
  }

  // Set the alternate email
  public void setAlternateEmail(String email) {
    this.alternateEmail = email;
  }

  // Change the password
  public void changePassword(String password) {
    this.password = password;
  }

  // Getters
  public int getMailboxCapacity() { return this.mailBoxCapacity; }
  public String getAlternateEmail() { return this.alternateEmail; }
  public String getPassword() { return this.password; }

  public String showInfo() {
    return "DISPLAY NAME: " + this.firstname + " " + this.lastname + "\n" +
            "COMPANY EMAIL: " + this.email + "\n" +
            "MAILBOX CAPACITY: " + this.mailBoxCapacity;
  }
}