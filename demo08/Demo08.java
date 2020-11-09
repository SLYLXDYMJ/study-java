package demo08;

import java.util.Scanner;

public class Demo08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] formula = new String[0];

    while (true) {
      System.out.println("请输入计算内容，最后已 \"=\" 号结束");
      System.out.println("现有公式：" + getFormula(formula));

      if (scanner.hasNextLine()) {
        String content = scanner.nextLine();

        // java 的数组长度不能改变
        String[] _formula = new String[formula.length + 1];

        // clone 值
        for (int i = 0; i < formula.length; i++) {
          _formula[i] = formula[i];
        }

        // 最新值
        _formula[_formula.length - 1] = content;

        // 引用改变
        formula = _formula;

        // 若未等号，则跳出公式部分
        if (content.equals("=")) {
          break;
        }
      }
    }

    System.out.println("结果：" + calc(formula));
  }

  public static String getFormula(String[] formula) {
    String result = "";

    for (int i = 0; i < formula.length; i++) {
      result += formula[i];
    }

    return result;
  }

  public static double calc(String[] formula) {
    double result = Double.parseDouble(formula[0]);

    // 排除最后一个，因为最后一个是 "=" 无计算意义
    for (int i = 0; i < formula.length - 1; i++) {
      /**
       *  1 3 5 7 9 ... 是操作符
       **/
      if (i % 2 == 1 && !formula[i].equals("=")) {
        double num = Double.parseDouble(formula[i + 1]);
        switch (formula[i]) {
          case "+": {
            result += num;
            break;
          }
          case "-": {
            result -= num;
            break;
          }
          case "*": {
            result *= num;
            break;
          }
          case "/": {
            result /= num;
            break;
          }
        }
      }
    }

    return result;
  }

  public static String errorMessage() {
    return "非法输入，将会忽略本次输入";
  }
}
