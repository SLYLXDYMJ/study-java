## Hello, World
1. 创建 Hello.java
2. 书写代码
```java
// 文件名和类名必须保持一致，并且首字母大写
public class Hello {
  public static void main(String[] args) {
    System.out.print("Hello World");
  };
}
```
3. 在控制台中用 java 文件生成 class 文件
```bash
javac Hello.java
```

4. 运行生成的 class 文件，注意没有 .class 后缀
```bash
java Hello
```

5. 控制台输出 Hello World 即为成功
