package demo12;

public class Application {
  public static void main(String[] args) {
    Student student = new Student("jason", 24);

    // 调用 Person 类公开的属性方法
    System.out.println(student.country);
    student.say();
  }
}
