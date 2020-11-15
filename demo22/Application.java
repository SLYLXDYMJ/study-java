package demo22;

import java.util.Random;

public class Application {
  public static void main (String[] args) {
    // Math 中其他的函数这里就不写了...
    // 用到时候的查手册吧
    System.out.println(Math.floor(1.5));
    System.out.println(Math.round(1.5));

    /**
     *  随机数都是伪随机数
     *  默认是已生成时的时间戳当做 "种子"
     *  根据一些固定的算法生成的
     *  "种子" 可以手动指定
     *  相同种子相同次数生成的随机数是一样的
     *
     *  ！！！要想真随机，就需要更复杂关联的种子！！！
     **/
    System.out.println(new Random(10086).nextDouble());
    System.out.println(new Random(10086).nextInt(10));

    // 输出 0 ~ 1 的 double 类型的伪随机数
    // 其实调用的是 Random 实例的 nextDouble 方法
    // 种子是调用时的时间戳
    System.out.println(Math.random());
  }
}
