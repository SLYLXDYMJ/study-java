package demo18;

class Person {
  private String name;
  private int age;

  public Person (String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class Application {
  public static void main (String[] args) {
    // 最常用的定义方式，将实例保存在 "内存常量池 " 中
    // 再次以相同的方式、相同的值定义时，会指向已有的 "内存常量池" 地址
    String s1 = "value";
    String s2 = "value";

    // 使用了 new 关键词，会在栈中强行生成一个新的实例对象
    // 不会去 "内存常量池" 中匹配
    String s3 = new String("value");

    // 这里比较的是内存地址，而不是具体的值
    System.out.println(s1 == s2);
    // => true
    System.out.println(s1 == s3);
    // => false

    // 通过 equals 实例方法比较值
    System.out.println(s1.equals(s3));
    System.out.println(s2.equals(s3));
    System.out.println(s3.equals(s1));
    // => true
  }
}
