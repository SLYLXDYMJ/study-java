package demo13;

public class Application {
  public static void main(String[] args) {
    Student s1 = new Student("s1", 24);
    Person s2 = new Student("s2", 24);
    Object s3 = new Student("s3", 24);

    // 调用父类方法
    System.out.println(s1.getName());
    System.out.println(s2.getName());
    // System.out.println(s3.getName());

    // 调用子类独特方法
    s1.run();
    // s2.run();
    // s3.run();
  }
}
