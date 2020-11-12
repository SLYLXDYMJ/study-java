package demo14;


public class Application {
  public static void main(String[] args) {
    Student s1 = new Student("s1", 24);
    Person s2 = new Student("s2", 24);

    Teacher t1 = new Teacher("t1", 24);
    Person t2 = new Teacher("t2", 24);

    // 检查是否为一个祖先类的实例
    System.out.println(s1 instanceof Person);
    System.out.println(s1 instanceof Student);
    System.out.println(s1 instanceof Object);
    // => true

    // System.out.println(student instanceof Teacher);
    // => 编译器报错

    // 类型转换
    s1.run();
    ((Student) s2).run();

    Teacher _t2 = (Teacher) t2;
    t1.lecture();
    _t2.lecture();
  }
}
