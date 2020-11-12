package demo07;

import java.util.Arrays;

public class Demo07 {
  public static void main(String[] args) {
    // 普通传参
    System.out.println(add(1, 2));

    // 重载：
    //   定义多个相同名称，但是参数个数和参数类型不同的方法
    //   调用时会根据传入的参数个数和类型自动匹配对应的方法体
    System.out.println(add(1, 2));
    System.out.println(add(1.11, 2.22));
    System.out.println(add("1", "2"));

    // 动态参数:
    //   用来接收相同类型但是不定个数的参数
    //   注意 "动态参数" 的位置一定在形参的最后
    System.out.println(add(1.11, 2.22, 3.33, 4.44));

    // 命令行传参：
    //   在 java 项目启动时，可指定启动参数(java XXX param1 param2)
    //   在 main 方法中可以接收到，是字符串类型的数组(String[] args)
    System.out.println(Arrays.toString(args));
  }

  /**
   * @param a 相加的第一个数
   * @param b 相加的第二个数
   * @return 参数 a 和 参数 b 的总和
   **/
  public static double add(double a, double b) {
    return a + b;
  }

  /**
   * @param numbers 所要相加的多个数字参数
   * @return 所有参数的总和
   **/
  public static double add(double... numbers) {
    double result = 0;

    for (double num : numbers) {
      result += num;
    }

    return result;
  }

  /**
   * @param a 相加的第一个字符串
   * @param b 相加的第二个字符串
   * @return 参数 a 和 参数 b 的拼接
   **/
  public static String add(String a, String b) {
    return a + ' ' + b;
  }
}
