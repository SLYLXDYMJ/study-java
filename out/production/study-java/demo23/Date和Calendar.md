## Date
> 用来定义时间的工具类 <br/>
> 目前没有什么方法可以使用了 <br/>
> 实例化时不传参代表当前时间，传参就代表指定时间(参数是毫秒)
```java
new Date();
new Date(1605364338996);

// 格式化时间显示
System.out.println(
  new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
    .format(new Date())
);
```

## Calendar
> 是抽象类
> 其子类有 GregorianCalendar，用来读取特定时间的信息（年月日时分秒等）
```java
// 读取指定时间的的年月日时分秒等信息
GregorianCalendar calendar = new GregorianCalendar();
calendar.setTime(new Date());
System.out.println(calendar.get(Calendar.YEAR));
System.out.println(calendar.get(Calendar.MONTH));
System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
System.out.println(calendar.get(Calendar.MINUTE));
System.out.println(calendar.get(Calendar.SECOND));
```