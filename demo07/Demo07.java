package demo07;

public class Demo07 {
  public static void main (String[] args) {
    Demo07 demo07 = new Demo07();

    System.out.println(demo07.add(10, 20));
    System.out.println(demo07.add("Hello", "World"));
    System.out.println(demo07.add(10, 20, 30, 40));
  }

  /**
   * @param a 相加的第一个字符串
   * @param b 相加的第二个字符串
   * @return 参数 a 和 参数 b 的拼接
   **/
  public String add (String a, String b) {
    return a + ' ' + b;
  }

  /**
   * @param a 相加的第一个数
   * @param b 相加的第二个数
   * @return 参数 a 和 参数 b 的总和
   **/
  public double add (double a, double b) {
    return a + b;
  }

  /**
   * @param numbers 所要相加的多个数字参数
   * @return 参数 a 和 参数 b 的拼接
   **/
  public double add (double... numbers) {
    double result = 0;

    for (double num : numbers) {
      result += num;
    }

    return result;
  }
}
