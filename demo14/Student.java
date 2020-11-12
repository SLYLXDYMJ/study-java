package demo14;

public class Student extends Person {
  public Student(String name, int age) {
    super(name, age);
  }

  public void run() {
    System.out.println(this.getName() + "在跑步");
  }
}
