package demo34;

import java.io.*;

public class Application {
  public static void main (String[] args) {
    File file = new File("./demo34/txt.txt");

    try {
      // 字节输出输出流
      FileInputStream inputStream = new FileInputStream(file);
      FileOutputStream outputStream = new FileOutputStream(file);

      // 转为字节流
      InputStreamReader reader = new InputStreamReader(inputStream);
      OutputStreamWriter writer = new OutputStreamWriter(outputStream);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
