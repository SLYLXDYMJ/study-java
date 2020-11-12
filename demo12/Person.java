package demo12;

public class Person {
  public String country = "中国";
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void say() {
    System.out.println("Person say");
  }
}
