package demo20;

public class Application {
  public static void main (String[] args) {
    String fileName = "文件名";
    String fileAt = "154878845487";
    String fileSuffix = ".jpg";

    System.out.println(
      new StringBuilder(50)
        .append(fileName)
        .append("-")
        .append(fileAt)
        .append(fileSuffix)
        .toString()
    );
  }
}
