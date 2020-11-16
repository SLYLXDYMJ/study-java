package demo28;

import sun.plugin2.message.Message;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class Application {
  public static void main(String[] args) {
    String password = "password";

    try {
      // 将 "内容" 转为字节数组
      // 在根据内容生成 哈希值的字节数组
      byte[] bytes = MessageDigest
          .getInstance("md5")
          .digest(password.getBytes(StandardCharsets.UTF_8));

      System.out.println("=============================");
      System.out.println(Arrays.toString(bytes));
      System.out.println("=============================");

      // 再根据 "哈希值的字节数组" 进行 base64 加密，方便传输
      String base64 = Base64.getEncoder().encodeToString(bytes);

      System.out.println("=============================");
      System.out.println(base64);
      System.out.println("=============================");

    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }

  }
}
