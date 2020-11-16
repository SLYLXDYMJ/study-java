package demo26;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Application {
  public static void main(String[] args) {
    BigInteger num1 = new BigInteger("100215454874845454874545454");
    BigInteger num2 = new BigInteger("10021545487484515454512111454");
    BigDecimal num3 = new BigDecimal("100215454874845454874545454.8746546578756454545454");

    System.out.println(num1.add(num2));
    System.out.println(num1.subtract(num2));
    System.out.println(num1.multiply(num2));
  }
}
