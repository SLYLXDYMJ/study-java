package demo11;

public class Person {
  // 人口总数
  private static int total = 0;

  public Person() {
    total++;
  }

  public static int getTotal() {
    return Person.total;
  }

  public void say() {
    System.out.println("说话");
  }

  public void eat() {
    System.out.println("吃饭");
  }
}
