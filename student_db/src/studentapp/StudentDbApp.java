import studentapp.Student;

public class StudentDbApp {
  public static void main(String[] args) {
    Student st1 = new Student();
    st1.enroll();
    st1.payTuition();
    System.out.println(st1.showInfo()); 
    // Ask how many new users we want to add


    // Create n number of students
  }
}