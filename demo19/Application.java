package demo19;

public class Application {
  public static void main (String[] args) {
    /**
     *  StringBuffer 用来解决 String 类型拼接时的性能问题
     *  String 类型变量每一次相加（拼接）时，都会产生无用的 String 实例，占用内存
     *  例子如下：
     **/

    /**
     *  此时产生了三个内存变量，例子如下
     *    fileName   => 0x00001
     *    fileAt     => 0x00002
     *    fileSuffix => 0x00003
     **/
    String fileName = "文件名";
    String fileAt = "154878845487";
    String fileSuffix = ".jpg";

    /**
     *  此时产生了六个对象，其中产生了两个无用对象，例子如下
     *    fileName                          => 0x00001
     *    fileAt                            => 0x00002
     *    fileSuffix                        => 0x00003
     *    fileName + fileAt                 => 0x00004
     *    (fileName + fileAt) + fileSuffix  => 0x00005
     *    fileFullName                      => 0x00006
     **/
    String fileFullName = fileName + fileAt + fileSuffix;

    /**
     *  使用 StringBuffer 优化内存
     *    append 方法用来拼接
     *    delete 方法用来删除
     *    toString 方法用来将结果转为 String 类型并返回
     **/
    System.out.println(
      new StringBuffer(32)
        .append(fileName)
        .append("-")
        .append(fileAt)
        .append(fileSuffix)
        .toString()
    );
  }
}
