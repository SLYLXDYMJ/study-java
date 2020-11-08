package demo06;

import java.util.Scanner;

public class Demo06 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = 0;
    double sum = 0;

    while (true) {
      System.out.println("请输入需要累加的数据（若输入的非数字，则会输出结果）：");
      if (scanner.hasNextDouble()) {
        sum += scanner.nextDouble();
        count++;
      }
      else {
        break;
      }
    }

    System.out.println("总和为：" + sum);
    System.out.println("平均为：" + sum / count);

    scanner.close();
  }
}
