> jdk 1.8 新增特性 <br/>
> 若接口中，只有一个抽象接口 <br/>
> 则可以使用这种语法，方便的定义

```java
Arrays.sort(persons, (Person a, Person b) -> {
  return a.getAge() - b.getAge();
});
```

```java
interface Callback {
  void cb();
}

public class Application {
  public static void main(String[] args) {
    Callback cb = () -> {
      System.out.println("我运行了");
    };

    cb.cb();
  }
}
```