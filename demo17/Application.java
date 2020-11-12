package demo17;

public class Application {
  public static void main(String[] args) {
    try {
      start();
    } catch (Exception e) {
      System.out.println("程序出现了错误");
    }
  }

  public static void start() throws Exception {
    throw new Exception();
  }
}
