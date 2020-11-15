package demo24;

public class Student extends Person {
  private int studentId;

  public Student (String name, int age, int studentId) {
    super(name, age);
    this.studentId = studentId;
  }

  public int getStudentId () {
    return studentId;
  }

  public void setStudentId (int studentId) {
    this.studentId = studentId;
  }

  @Override
  public String toString () {
    return "Student{" +
      "studentId=" + studentId +
      '}';
  }
}
