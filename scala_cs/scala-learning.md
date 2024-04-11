# scala 

Scala 是一门多范式（multi-paradigm）的编程语言，设计初衷是要集成面向对象编程和函数式编程的各种特性。

Scala 运行在 Java 虚拟机上，并兼容现有的 Java 程序。

Scala 源代码被编译成 Java 字节码，所以它可以运行于 JVM 之上，并可以调用现有的 Java 类库。


## 第一个 Scala 程序：Hello World
以下是用 Scala 编写的典型 Hello World 程序：

实例（HelloWorld.scala）
```
object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("Hello, world!")
    }
}

```


运行实例 »
将以上代码保存为 HelloWorld.scala 文件，执行以上 scala 程序（你也可以直接在线执行）：

```
$ scalac HelloWorld.scala  // 把源码编译为字节码
$ scala HelloWorld  // 把字节码放到虚拟机中解释运行
```
输出结果为：

> Hello, world!

---

<h1>入门学习大纲</h1>




