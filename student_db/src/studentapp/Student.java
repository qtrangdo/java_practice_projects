package studentapp;

import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentID;
  private String courses = "";
  private int tuitionBalance = 0;
  private static int costOfCourse = 600;
  private static int id = 1000;

  // Constructor: promt for student's name and year
  public Student() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter student first name: ");
    this.firstName = in.nextLine();

    System.out.println("Enter student last name: ");
    this.lastName = in.nextLine();

    System.out.println("Enter student level: \n1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior");
    this.gradeYear = in.nextInt();

    setStudentID();

    System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
  }

  // Generate ID
  private void setStudentID() {
    // increment id value everytime Student is created
    id++;

    // 5 digits: grade level + static id
    this.studentID = this.gradeYear + "" + id;
  }

  // Enroll in courses
  public void enroll() {
    // Get inside a loop, user hits Q
    do {
      System.out.print("Enter course to enroll (Q to quit): ");
      Scanner in = new Scanner(System.in);
      String course = in.nextLine();
      if (!course.equals("Q")) {
        this.courses = this.courses + "\n" + course;
        this.tuitionBalance = this.tuitionBalance + costOfCourse;
        System.out.println("ENROLLED in " + course);
      } else {
        break;
      }
    } while (1 != 0);
    System.out.println("ENROLLED COURSES: " + this.courses);
    System.out.println("TUITION BALANCE: " + this.tuitionBalance);
  }

  // View Balance

  // Pay tuition

  // Show Status of student
}