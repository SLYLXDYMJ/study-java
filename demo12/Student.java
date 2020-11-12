package demo12;

public class Student extends Person {
  public Student(String name, int age) {
    // 调用父类的构造函数
    super(name, age);
  }

  public void say() {
    System.out.println("========================");
    super.say();
    System.out.println("Student say");
    System.out.println("========================");
  }
}