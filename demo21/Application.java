package demo21;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Application {
  public static void main (String[] args) {
    Locale zh = new Locale("zh", "CN");
    Locale en = new Locale("en", "US");

    ResourceBundle resourceBundle = ResourceBundle.getBundle("demo21.info", en);

    Scanner scanner = new Scanner(System.in);

    System.out.println(resourceBundle.getString("hello"));

    System.out.println(resourceBundle.getString("input.username"));
    String username = scanner.next();

    System.out.println(resourceBundle.getString("input.password"));
    String password = scanner.next();

    // success
    if (username.equals("root") && password.equals("root")) {
      System.out.println(resourceBundle.getString("login.success"));
    }

    // fail
    else {
      System.out.println(resourceBundle.getString("login.fail"));
    }
  }
}
