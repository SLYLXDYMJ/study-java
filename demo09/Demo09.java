package demo09;

import java.util.Arrays;

public class Demo09 {
  public static void main (String[] args) {
    System.out.println("====================================");

    // 定义 + 赋值
    double[] numbers1 = new double[]{1, 2, 3};

    // 定义
    double[] numbers2 = new double[3];

    // 赋值
    numbers2[0] = 1;
    numbers2[1] = 2;
    numbers2[2] = 3;

    System.out.println(Arrays.toString(numbers1));
    System.out.println(Arrays.toString(numbers2));

    System.out.println("====================================");

    double[] list1 = new double[]{4, 78, 9, 1, 2, 45, 788, 6, 1};

    // 克隆数组
    double[] list2 = Arrays.copyOf(list1, list1.length);

    // 填充数组
    Arrays.fill(list1, 5.0);

    // 升序排序数组
    Arrays.sort(list2);

    System.out.println(Arrays.toString(list1));
    System.out.println(Arrays.toString(list2));
    System.out.println(Arrays.binarySearch(list2, 78.0));

    System.out.println("====================================");
  }
}
