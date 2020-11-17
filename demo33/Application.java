package demo33;

import java.io.*;

public class Application {
  public static void main (String[] args) {
    final String FILE_ORIGIN_PATH = "./demo33/tmp/test.jpg";
    final String FILE_COPY_PATH = "./demo33/tmp/test_copy.jpg";

    System.out.println(
      copyFile(FILE_ORIGIN_PATH, FILE_COPY_PATH)
    );
  }

  public static boolean copyFile (String src, String target) {
    boolean result = false;

    File srcFile = new File(src);
    File targetFile = new File(target);

    FileInputStream inputStream = null;
    FileOutputStream outputStream = null;

    try {
      inputStream = new FileInputStream(srcFile);
      outputStream = new FileOutputStream(targetFile);

      byte[] payload = new byte[1024];
      int readLen = -1;

      while ((readLen = inputStream.read(payload)) != -1) {
        outputStream.write(payload, 0, readLen);
      }

      result = true;
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    finally {
      try {
        if (inputStream != null) {
          inputStream.close();
        }
        if (outputStream != null) {
          outputStream.close();
        }
      }
      catch (IOException e) {
        e.printStackTrace();
      }
    }

    return result;
  }
}
