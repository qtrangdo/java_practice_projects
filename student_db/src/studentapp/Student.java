package studentapp;

import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private int studentID;
  private String courses;
  private int tuitionBalance;
  private int costOfCourse = 600;

  // Constructor: promt for student's name and year
  public Student() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter student first name: ");
    this.firstName = in.nextLine();

    System.out.println("Enter student last name: ");
    this.lastName = in.nextLine();

    System.out.println("Enter student level: \n1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior");
    this.gradeYear = in.nextInt();

    System.out.println(firstName + lastName + gradeYear);
  }

  // Generate ID

  // Enroll in courses

  // View Balance

  // Pay tuition

  // Show Status of student
}