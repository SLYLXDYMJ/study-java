package demo24;

import java.util.Arrays;

public class Application {
  public static void main (String[] args) {
    Person[] persons = new Person[]{
      new Person("person1", 85),
      new Person("person2", 45),
      new Person("person3", 100),
    };

    Student[] students = new Student[]{
      new Student("student1", 84, 8),
      new Student("student1", 55, 2),
      new Student("student1", 100, 10)
    };

    /**
     *  第一种方式
     *  直接在类定义中
     *  实现 Comparable 接口（compareTo 方法）
     **/
    Arrays.sort(persons);
    System.out.println(
      Arrays.toString(persons)
    );

    /**
     *  第二种方式
     *  自定义类无需变动，额外定义比较器类
     *  比较时传入比较器类实例，确定比较规则
     **/
    Arrays.sort(students, new StudentComparator());
    System.out.println(
      Arrays.toString(students)
    );
  }
}
