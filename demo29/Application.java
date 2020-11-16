package demo29;

import java.util.Arrays;

interface Callback {
  void cb();

  default void defaultCb() {
    System.out.println("我是默认的回调函数");
  }

  static void staticCb() {
    System.out.println("我是静态的回调函数");
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}

public class Application {
  public static void main(String[] args) {
    Person[] persons = new Person[]{
        new Person("person-1", 60),
        new Person("person-2", 40),
        new Person("person-3", 100),
    };

    Arrays.sort(persons, (Person a, Person b) -> {
      return a.getAge() - b.getAge();
    });

    System.out.println(Arrays.toString(persons));

    Callback cb = () -> {
      System.out.println("我运行了");
    };

    cb.cb();
    cb.defaultCb();
    Callback.staticCb();
  }
}
