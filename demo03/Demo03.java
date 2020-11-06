package demo03;

public class Demo03 {
  // main + tab 就会自动生成 main 函数
  public static void main(String[] args) {
    // sout + tab 会生成 System.out.println();
    System.out.println();

    // print 多次调用不会换行
    System.out.print(1);
    System.out.print(2);
    System.out.print(3);
    System.out.print(4);
    // => 1234

    System.out.println();

    // println 多次调用会换行
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    // => 1\n2\n3\n4
  }
}
