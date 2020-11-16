package demo30;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Application {
  public static void main(String[] args) {
    final String TMP_PATH_1 = "./demo30/tmp1";
    final String TMP_PATH_2 = "./demo30/tmp2";

    File tmpDir1 = new File(TMP_PATH_1);
    File tmpDir2 = new File(TMP_PATH_2);
    String[] fileNames = {"a.txt", "b.jpg", "c.png", "d.xlsx"};

    // 创建 tmp1 和 tmp2 目录
    if (tmpDir1.exists() == false) {
      tmpDir1.mkdir();
    }
    if (tmpDir2.exists() == false) {
      tmpDir2.mkdir();
    }

    // 循环创建测试文件
    try {
      for (String fileName : fileNames) {
        File file = new File(TMP_PATH_1 + '/' + fileName);
        boolean createSuccess = false;

        if (file.exists() == false) {
          createSuccess = file.createNewFile();
        }

        System.out.println("=====================");
        System.out.println(
            fileName + "生成情况：" + createSuccess
        );
        System.out.println("=====================");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    // 测试 File 实例
    File file = new File(TMP_PATH_1 + '/' + fileNames[0]);

    System.out.println("================================");
    System.out.println("tmp 目录下的文件和文件夹名字");
    System.out.println(Arrays.toString(tmpDir1.list()));
    System.out.println("================================");

    System.out.println("================================");
    System.out.println("tmp 目录下筛选出来的文件或文件夹 File 对象");
    System.out.println(Arrays.toString(tmpDir1.list((File tmpDir, String pathname) -> {
      return pathname.endsWith(".png");
    })));
    System.out.println("================================");

    System.out.println("================================");
    System.out.println("获取文件或文件夹名字");
    System.out.println(file.getName());
    System.out.println("================================");

    System.out.println("================================");
    System.out.println("判断 File 是否为目录");
    System.out.println(
        tmpDir1.isDirectory()
    );
    System.out.println("================================");

    System.out.println("================================");
    System.out.println("判断 File 是否为文件");
    System.out.println(
        file.isFile()
    );
    System.out.println("================================");

    System.out.println("================================");
    System.out.println("删除文件或者文件夹（文件夹如果存在文件则无法删除）");
    System.out.println(
        new File(TMP_PATH_2 + "/e.txt")
            .delete()
    );
    System.out.println("================================");

    System.out.println("================================");
    System.out.println("修改文件或者文件夹名字，移动文件或文件夹名家");
    System.out.println(
        file.renameTo(
            new File(TMP_PATH_2 + "/e.txt")
        )
    );
    System.out.println("================================");
  }
}
