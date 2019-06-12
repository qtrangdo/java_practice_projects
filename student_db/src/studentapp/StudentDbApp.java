import java.util.Scanner;

import studentapp.Student;

public class StudentDbApp {
  public static void main(String[] args) {

    // Ask how many new users we want to add
    System.out.println("Enter number of students you want to enroll");
    Scanner in = new Scanner(System.in);
    int numOfStudents = in.nextInt();
    Student[] students = new Student[numOfStudents];


    // Create n number of students
    for (int n = 0; n < numOfStudents; n++) {
      students[n] = new Student();
      students[n].enroll();
      students[n].payTuition();
      System.out.println(students[n].showInfo()); 
    }
  }
}