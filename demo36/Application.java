package demo36;

import java.io.*;

public class Application {
  public static void main (String[] args) {
    File file = new File("./demo36/tmp/txt.txt");
    try (
      // 一层包一层....
      PrintWriter printWriter = new PrintWriter(
        new BufferedOutputStream(
          new FileOutputStream(file)
        )
      );
    ) {
      printWriter.println("小桥流水哗啦啦啦啦拉拉~~~~");
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
