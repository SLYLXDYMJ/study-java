# JavaDoc

## 注释文档
```java
package demo05;

/**
 * @author jason
 * @version 0.0.1
 * @since 1.8
 **/
public class Demo05 {
  public static void main (String[] args) {
    System.out.println("Demo05 执行了 main 方法");
  }

  /**
   * @param num 将要返回的数值
   * @return 传入的 num 参数
   **/
  public Integer getNum (Integer num) {
    return num;
  }
}
```

## 生成
1. 在模块中写好注释文档
2. 在 idea 菜单栏中 Tools -> generateJavaDoc
3. 在 Generate JavaDoc Scope 中选择需要生成的文件范围
4. 在 Output directory 中选择输出目录
5. 在 Other command line arguments 中指定文字字符集 UTF-8，如下
```
-encoding UTF-8 -charset UTF-8
```
6. 点击 ok 即可生成，在指定的目录中会生成文档文件
7. 将 index.html 在游览器打开即可查看文档