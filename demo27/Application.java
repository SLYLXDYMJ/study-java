package demo27;

import java.text.DecimalFormat;

public class Application {
  public static void main(String[] args) {
    System.out.println(new DecimalFormat("0.00").format(10.165));
    // => 10.16
    System.out.println(new DecimalFormat("0%").format(1));
    // => 200%
    System.out.println(new DecimalFormat("0.00").format(10));
    // => 10.00
  }
}
