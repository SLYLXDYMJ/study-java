package demo35;

import java.io.*;
import java.util.Date;

public class Application {
  public static void main (String[] args) {
    File file = new File("./demo35/tmp/txt.txt");

    // jdk 1.7 新特性，放在 try 中定义，会自动调用 close 方法
    // 需要类实现 Closeable 接口
    try (
      // 创建字节写入缓冲流
      BufferedOutputStream out = new BufferedOutputStream(
        new FileOutputStream(file)
      );
      // 创建字节读取缓冲流
      BufferedInputStream in = new BufferedInputStream(
        new FileInputStream(file)
      );
    ) {
      // 使用缓冲流写入
      out.write(("小桥流水哗啦啦：" + new Date().getTime()).getBytes());

      // 手动刷新写入
      out.flush();

      // 使用缓冲流读取
      byte[] payload = new byte[1024];
      int len = -1;
      StringBuilder result = new StringBuilder();

      while ((len = in.read(payload)) != -1) {
        result.append(new String(payload, 0, len));
      }

      System.out.println(result);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
