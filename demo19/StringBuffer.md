## StringBuffer
> 用来解决 String 类型拼接时的性能问题 <br/>
> StringBuffer 是线程安全的（排队使用线程）
> 常用于多线程

## 问题由来
> String 是不可变对象，String 的对象每次改变时 <br/>
> 其实都是重新创建了一个新的 StringBuilder 对象拼接 <br/>
> 并将指针指向新的其 toString 方法生成的 String 对象 <br/>
> 这会导致浪费大量的内存空间

## 原理
> StringBuffer 内部定义了一个默认长度为 16 的 char 数组，默认长度可自定义 <br/>
> 通过 append 和 delete 方法拼接字符，操作内部的 char 数组 <br/>
> 若 append 时长度超过了原 char 数组长度，则会进行自动的 char 数组扩容
