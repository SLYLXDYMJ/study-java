package demo11;

public class Application {
  public static void main(String[] args) {
    Person person = new Person();

    for (int i = 0; i < 9; i++) {
      new Person();
    }

    person.say();
    person.eat();
    System.out.println(Person.getTotal());
  }
}
