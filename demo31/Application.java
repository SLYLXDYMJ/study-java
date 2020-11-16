package demo31;

import java.io.*;

public class Application {
  public static void main (String[] args) {
    String TMP_DIR_PATH = "./demo31/tmp";
    String TMP_FILE_PATH = TMP_DIR_PATH + "/test.txt";

    File tmpDir = new File(TMP_DIR_PATH);
    File tmpFile = new File(TMP_FILE_PATH);

    // 确保 tmp 文件夹的存在
    if (tmpDir.exists() == false) {
      tmpDir.mkdir();
    }

    // 确保 tmp 文件的存在
    if (tmpFile.exists() == false) {
      try {
        tmpFile.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    // 往文件中写入内容
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(tmpFile);
      String str = "小桥流水哗啦啦~~";

      System.out.println("============================");
      System.out.println("写入完毕");
      fileOutputStream.write(str.getBytes());
      System.out.println("============================");

      fileOutputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // 读取内容
    try {
      FileInputStream fileInputStream = new FileInputStream(tmpFile);

      // 每次读取的大小
      byte[] bytes = new byte[1024];

      // 每次读取到的大小
      // 如果没有读取到就会返回 -1
      int len = -1;

      // 结果
      StringBuilder result = new StringBuilder();

      // 循环读取
      do {
        len = fileInputStream.read(bytes);
        result.append(new String(bytes));
      } while (len != -1);

      System.out.println("======================");
      System.out.println("读取完毕");
      System.out.println(result);
      System.out.println("======================");

      fileInputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
