package demo10;

public class Student extends Person {
  private String clazz;

  public Student (String name, int age, String clazz) {
    super(name, age);
    this.clazz = clazz;
  }

  public String getClazz () {
    return clazz;
  }

  public void setClazz (String clazz) {
    this.clazz = clazz;
  }
}
