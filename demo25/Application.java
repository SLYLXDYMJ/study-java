package demo25;

public class Application {
  public static void main(String[] args) {
    Person person = new Person("person-1", 21);

    try {
      Person newPerson = (Person) person.clone();
      System.out.println(person.toString());
      System.out.println(newPerson.toString());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
