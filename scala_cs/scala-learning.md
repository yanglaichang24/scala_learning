# scala 

Scala 是一门多范式（multi-paradigm）的编程语言，设计初衷是要集成面向对象编程和函数式编程的各种特性。

Scala 运行在 Java 虚拟机上，并兼容现有的 Java 程序。

Scala 源代码被编译成 Java 字节码，所以它可以运行于 JVM 之上，并可以调用现有的 Java 类库。


## 第一个 Scala 程序：

Hello World

交互式编程

交互式编程不需要创建脚本文件，可以通过以下命令调用：
```
$ scala
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_31).
Type in expressions to have them evaluated.
Type :help for more information.

scala> 1 + 1
res0: Int = 2

scala> println("Hello World!")
Hello World!

scala> 
```

脚本形式

我们也可以通过创建一个 HelloWorld.scala 的文件来执行代码，HelloWorld.scala 代码如下所示：

HelloWorld.scala 文件代码：
```

object HelloWorld {
   /* 这是我的第一个 Scala 程序
    * 以下程序将输出'Hello World!'
    */
   def main(args: Array[String]) = {
      println("Hello, world!") // 输出 Hello World
   }
}
```
接下来我们使用 scalac 命令编译它：
```
$ scalac HelloWorld.scala 
$ ls
HelloWorld$.class    HelloWorld.scala
HelloWorld.class    
```
编译后我们可以看到目录下生成了 HelloWorld.class 文件，该文件可以在Java Virtual Machine (JVM)上运行。

编译后，我们可以使用以下命令来执行程序：
```
$ scala HelloWorld
Hello, world!
```


---

<h1>入门学习大纲</h1>

+ [基本语法/数据类型/变量/常量/访问权限](src/part1/part.md)
+ [运算符](src/part2/part.md)


