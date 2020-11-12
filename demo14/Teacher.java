package demo14;

public class Teacher extends Person {
  public Teacher(String name, int age) {
    super(name, age);
  }

  public void lecture() {
    System.out.println(this.getName() + "在讲课");
  }
}
