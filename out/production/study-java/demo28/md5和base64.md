## MD5
> 消息摘要算法 <br/>
> 主要用于校验内容是否正确，内容是否被非法修改 <br/>
> 通常用于验证密码，验证文件内容等场景 <br/>
> 该算法不可逆，无法通过算法后的 128 位二进制还原内容

## 来源
> java.security.MessageDigest

```java
// 将 "内容" 转为字节数组
// 在根据内容生成 哈希值的字节数组
byte[] bytes = MessageDigest
  .getInstance("md5")
  .digest(password.getBytes(StandardCharsets.UTF_8));
```

## base64
> 是常用的编码方式 <br/>
> 将内容编码方便存储传输等 <br/>
> 可以解码

## 来源
> java.util.Base64

```java
// 再根据 "哈希值的字节数组" 进行 base64 加密，方便传输
String base64 = Base64.getEncoder().encodeToString(bytes);
```