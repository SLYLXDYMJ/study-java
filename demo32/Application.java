package demo32;

import java.io.*;

public class Application {
  public static void main (String[] args) {
    String TMP_DIR_PATH = "./demo32/tmp";
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
      FileWriter fileWriter = new FileWriter(tmpFile);
      String str = "小桥流水哗啦啦~~";

      System.out.println("============================");
      System.out.println("写入完毕");
      fileWriter.write(str);
      System.out.println("============================");

      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // 读取内容
    try {
      FileReader fileReader = new FileReader(tmpFile);

      // 每次读取的大小，单位是字节
      char[] bytes = new char[1024];

      // 每次读取到的大小
      // 如果没有读取到就会返回 -1
      int len = -1;

      // 结果
      StringBuilder result = new StringBuilder();

      // 循环读取
      while ((len = fileReader.read(bytes)) != -1) {
        result.append(new String(bytes, 0, len));
      }

      System.out.println("======================");
      System.out.println("读取完毕");
      System.out.println(result);
      System.out.println("======================");

      fileReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
