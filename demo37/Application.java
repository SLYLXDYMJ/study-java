package demo37;

import java.io.*;

class Person implements Serializable {
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
    Person person = new Person("jason", 23);
    File file = new File("./demo37/person.obj");

    try {
      System.out.println("=================================");
      System.out.println("序列化对象，并写入文件中");
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(
        new FileOutputStream(file)
      );
      objectOutputStream.writeObject(person);
      objectOutputStream.close();
      System.out.println("=================================");

      System.out.println("=================================");
      System.out.println("反序列化对象读取出来");
      ObjectInputStream objectInputStream = new ObjectInputStream(
        new FileInputStream(file)
      );
      System.out.println(objectInputStream.readObject());
      objectInputStream.close();
      System.out.println("=================================");
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
