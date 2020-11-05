## Java 三大版本
```
JavaSE -> 标准版，是 java 的核心
JavaEE -> 企业级开发，web端，服务器开发
JavaME -> 早年间移动端嵌入式开发，目前基本淘汰（手机，小家电）
```

## JDK、JRE、JVM
> JDK 包含 JRE 包含 JVM <br/>
> 所以安装环境时只安装 JDK 即可
```
JDK -> java 开发者工具
JRE -> java 运行环境
JVM -> java 虚拟机
```

## JDK
> 主流、稳定的是版本 8

### 安装流程
1. 网上找个 java jdk8 的安装包，对应自己的操作系统
2. 点击安装，记住自己的安装目录，如 E:/java/jdk1.8
3. 继续安装，若 JDK 安装完毕后提示安装 JRE 取消即可（JDK包括了 JRE 不用单独安装公共 JRE）
4. 安装完成后，设置系统环境变量 JAVA_HOME 为之前记住的目录
5. 系统环境变量 PATH 新增两项 %JAVA_HOME%/bin、%JAVA_HOME%/jre/bin
6. 在 cmd 中输入 java -version 若显示版本号则安装成功

### 卸载流程
1. 查看系统环境变量 JAVA_HOME 对应的目录，直接删除这个目录的所有文件。
2. 删除 JAVA_HOME 系统环境变量。
3. 删除 系统环境变量 PATH 中含有 %JAVA_HOME% 的条目，应该是两条。
4. 在控制面板中，搜索 java，删除其更新程序。
