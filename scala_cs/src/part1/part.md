Go to [ HOME ](../../scala-learning.md)
---

<h1>1.Scala 基础语法</h1>

如果你之前是一名 Java 程序员，并了解 Java 语言的基础知识，那么你能很快学会 Scala 的基础语法。

Scala 与 Java 的最大区别是：Scala 语句末尾的分号 ; 是可选的。

我们可以认为 Scala 程序是对象的集合，通过调用彼此的方法来实现消息传递。接下来我们来理解下，类，对象，方法，实例变量的概念：

+ 对象 - 对象有属性和行为。例如：一只狗的状属性有：颜色，名字，行为有：叫、跑、吃等。对象是一个类的实例。
+ 类 - 类是对象的抽象，而对象是类的具体实例。
+ 方法 - 方法描述的基本的行为，一个类可以包含多个方法。
+ 字段 - 每个对象都有它唯一的实例变量集合，即字段。对象的属性通过给字段赋值来创建。


## 基本语法
Scala 基本语法需要注意以下几点：

+ 区分大小写 -  Scala是大小写敏感的，这意味着标识Hello 和 hello在Scala中会有不同的含义。

+ 类名 - 对于所有的类名的第一个字母要大写。
如果需要使用几个单词来构成一个类的名称，每个单词的第一个字母要大写。

示例：class MyFirstScalaClass

+ 方法名称 - 所有的方法名称的第一个字母用小写。
如果若干单词被用于构成方法的名称，则每个单词的第一个字母应大写。

示例：def myMethodName()

+ 程序文件名 - 程序文件的名称应该与对象名称完全匹配(新版本不需要了，但建议保留这种习惯)。
保存文件时，应该保存它使用的对象名称（记住Scala是区分大小写），并追加".scala"为文件扩展名。 （如果文件名和对象名称不匹配，程序将无法编译）。

示例: 假设"HelloWorld"是对象的名称。那么该文件应保存为'HelloWorld.scala"

def main(args: Array[String]) - Scala程序从main()方法开始处理，这是每一个Scala程序的强制程序入口部分。

## 标识符
Scala 可以使用两种形式的标志符，字符数字和符号。

字符数字使用字母或是下划线开头，后面可以接字母或是数字，符号"$"在 Scala 中也看作为字母。然而以"$"开头的标识符为保留的 Scala 编译器产生的标志符使用，应用程序应该避免使用"$"开始的标识符，以免造成冲突。

Scala 的命名规则采用和 Java 类似的 camel 命名规则，首字符小写，比如 toString。类名的首字符还是使用大写。此外也应该避免使用以下划线结尾的标志符以避免冲突。符号标志符包含一个或多个符号，如+，:，? 等，比如:

> + ++ ::: < ?> :->

Scala 内部实现时会使用转义的标志符，比如:-> 使用 $colon$minus$greater 来表示这个符号。因此如果你需要在 Java 代码中访问:->方法，你需要使用 Scala 的内部名称 $colon$minus$greater。

混合标志符由字符数字标志符后面跟着一个或多个符号组成，比如 unary_+ 为 Scala 对+方法的内部实现时的名称。字面量标志符为使用"定义的字符串，比如 `x` `yield`。

你可以在"之间使用任何有效的 Scala 标志符，Scala 将它们解释为一个 Scala 标志符，一个典型的使用为 Thread 的 yield 方法， 在 Scala 中你不能使用 Thread.yield()是因为 yield 为 Scala 中的关键字， 你必须使用 Thread.`yield`()来使用这个方法。

## Scala 关键字

下表列出了 scala 保留关键字，我们不能使用以下关键字作为变量：

|||||
|----|----|----|----|
|abstract|case|	catch|	class|
|def|	do	|else|	extends|
|false|	final|	finally|	for|
|forSome|	if|	implicit|	import|
|lazy|	match|	new|	null|
|object|	override|	package|	private|
|protected	|return|	sealed|	super|
|this	|throw	|trait	|try|
|true|	type	|val|	var|
|while|	with|	yield|	 
|-|	:|	=	|=>|
|<-|	<:|	<%	|>:|
|#|	@	|	||

## Scala 注释
Scala 类似 Java 支持单行和多行注释。多行注释可以嵌套，但必须正确嵌套，一个注释开始符号对应一个结束符号。注释在 Scala 编译中会被忽略，实例如下：
```
object HelloWorld {
   /* 这是一个 Scala 程序
    * 这是一行注释
    * 这里演示了多行注释
    */
   def main(args: Array[String]) {
      // 输出 Hello World
      // 这是一个单行注释
      println("Hello, world!") 
   }
}
```

## 空行和空格
一行中只有空格或者带有注释，Scala 会认为其是空行，会忽略它。标记可以被空格或者注释来分割。

## 换行符
Scala是面向行的语言，语句可以用分号（;）结束或换行符。Scala 程序里,语句末尾的分号通常是可选的。如果你愿意可以输入一个,但若一行里仅 有一个语句也可不写。另一方面,如果一行里写多个语句那么分号是需要的。例如

> val s = "菜鸟教程"; println(s)

##  Scala 包
### 定义包
Scala 使用 package 关键字定义包，在Scala将代码定义到某个包中有两种方式：

第一种方法和 Java 一样，在文件的头定义包名，这种方法就后续所有代码都放在该包中。 比如：
```
package com.runoob
class HelloWorld
```

第二种方法有些类似 C#，如：
```
package com.runoob {
  class HelloWorld 
}
```
第二种方法，可以在一个文件中定义多个包。

### 引用
Scala 使用 import 关键字引用包。
```
import java.awt.Color  // 引入Color
 
import java.awt._  // 引入包内所有成员
 
def handler(evt: event.ActionEvent) { // java.awt.event.ActionEvent
  ...  // 因为引入了java.awt，所以可以省去前面的部分
}
```
import语句可以出现在任何地方，而不是只能在文件顶部。import的效果从开始延伸到语句块的结束。这可以大幅减少名称冲突的可能性。

如果想要引入包中的几个成员，可以使用selector（选取器）：
```
import java.awt.{Color, Font}
 
// 重命名成员
import java.util.{HashMap => JavaHashMap}
 
// 隐藏成员
import java.util.{HashMap => _, _} // 引入了util包的所有成员，但是HashMap被隐藏了
```
注意：默认情况下，Scala 总会引入 java.lang._ 、 scala._ 和 Predef._，这里也能解释，为什么以scala开头的包，在使用时都是省去scala.的。

<h1>2.数据类型</h1>

Scala 与 Java有着相同的数据类型，下表列出了 Scala 支持的数据类型：

|数据类型|描述|
|---|---|	
|Byte|8位有符号补码整数。数值区间为 -128 到 127|
|Short|	16位有符号补码整数。数值区间为 -32768 到 32767|
|Int|32位有符号补码整数。数值区间为 -2147483648 到 2147483647|
|Long|64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807|
|Float|32 位, IEEE 754 标准的单精度浮点数|
|Double|64 位 IEEE 754 标准的双精度浮点数|
|Char|16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF|
|String|字符序列|
|Boolean|true或false|
|Unit|表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。|
|Null|null 或空引用|
|Nothing|Nothing类型在Scala的类层级的最底端；它是任何其他类型的子类型。|
|Any|Any是所有其他类的超类|
|AnyRef|AnyRef类是Scala里所有引用类(reference class)的基类|

上表中列出的数据类型都是对象，也就是说scala没有java中的原生类型。在scala是可以对数字等基础类型调用方法的。

## Scala 基础字面量
Scala 非常简单且直观。接下来我们会详细介绍 Scala 字面量。

### 整型字面量
整型字面量用于 Int 类型，如果表示 Long，可以在数字后面添加 L 或者小写 l 作为后缀。：

```
0
035
21 
0xFFFFFFFF 
0777L
```

### 浮点型字面量
如果浮点数后面有f或者F后缀时，表示这是一个Float类型，否则就是一个Double类型的。实例如下：
```
0.0 
1e30f 
3.14159f 
1.0e100
.1

```

### 布尔型字面量

布尔型字面量有 true 和 false。

### 符号字面量

符号字面量被写成： '<标识符> ，这里 <标识符> 可以是任何字母或数字的标识（注意：不能以数字开头）。这种字面量被映射成预定义类scala.Symbol的实例。

如： 符号字面量 'x 是表达式 scala.Symbol("x") 的简写，符号字面量定义如下：
```
package scala
final case class Symbol private (name: String) {
   override def toString: String = "'" + name
}
```
### 字符字面量
在 Scala 字符变量使用单引号 ' 来定义，如下：
```
'a' 
'\u0041'
'\n'
'\t'
```

其中 \ 表示转义字符，其后可以跟 u0041 数字或者 \r\n 等固定的转义字符。

### 字符串字面量
在 Scala 字符串字面量使用双引号 " 来定义，如下：
```
"Hello,\nWorld!"
"菜鸟教程官网：www.runoob.com"
```
多行字符串的表示方法
多行字符串用三个双引号来表示分隔符，格式为：""" ... """。

实例如下：
```
val foo = """菜鸟教程
www.runoob.com
www.w3cschool.cc
www.runnoob.com
```
以上三个地址都能访问"""

### Null 值
空值是 scala.Null 类型。

Scala.Null和scala.Nothing是用统一的方式处理Scala面向对象类型系统的某些"边界情况"的特殊类型。

Null类是null引用对象的类型，它是每个引用类（继承自AnyRef的类）的子类。Null不兼容值类型。

### Scala 转义字符
下表列出了常见的转义字符：

|转义字符|Unicode|描述|
|---|---|---|
|\b	|\u0008|	退格(BS) ，将当前位置移到前一列|
|\t	|\u0009	|水平制表(HT) （跳到下一个TAB位置）|
|\n	|\u000a	|换行(LF) ，将当前位置移到下一行开头|
|\f	|\u000c	|换页(FF)，将当前位置移到下页开头|
|\r	|\u000d	|回车(CR) ，将当前位置移到本行开头|
|\"	|\u0022	|代表一个双引号(")字符|
|\'	|\u0027	|代表一个单引号（'）字符|
|\\|	\u005c|	代表一个反斜线字符 '\'|

0 到 255 间的 Unicode 字符可以用一个八进制转义序列来表示，即反斜线‟\‟后跟 最多三个八进制。

在字符或字符串中，反斜线和后面的字符序列不能构成一个合法的转义序列将会导致 编译错误。

以下实例演示了一些转义字符的使用：

实例
```
object Test {
   def main(args: Array[String]) {
      println("Hello\tWorld\n\n" );
   }
}

```
执行以上代码输出结果如下所示：
```
$ scalac Test.scala
$ scala Test
Hello    World
```
<h1>3.变量/常量</h1>

变量是一种使用方便的占位符，用于引用计算机内存地址，变量创建后会占用一定的内存空间。

基于变量的数据类型，操作系统会进行内存分配并且决定什么将被储存在保留内存中。因此，通过给变量分配不同的数据类型，你可以在这些变量中存储整数，小数或者字母。

## 变量声明
在学习如何声明变量与常量之前，我们先来了解一些变量与常量。

+ 一、变量： 在程序运行过程中其值可能发生改变的量叫做变量。如：时间，年龄。
+ 二、常量 在程序运行过程中其值不会发生变化的量叫做常量。如：数值 3，字符'A'。

在 Scala 中，使用关键词 "var" 声明变量，使用关键词 "val" 声明常量。

声明变量实例如下：
```
var myVar : String = "Foo"
var myVar : String = "Too"
```
以上定义了变量 myVar，我们可以修改它。

声明常量实例如下：
```
val myVal : String = "Foo"
```
以上定义了常量 myVal，它是不能修改的。如果程序尝试修改常量 myVal 的值，程序将会在编译时报错。

### 变量类型声明
变量的类型在变量名之后等号之前声明。定义变量的类型的语法格式如下：

> var VariableName : DataType [=  Initial Value]

或

> val VariableName : DataType [=  Initial Value]

## 变量类型引用
在 Scala 中声明变量和常量不一定要指明数据类型，在没有指明数据类型的情况下，其数据类型是通过变量或常量的初始值推断出来的。

所以，如果在没有指明数据类型的情况下声明变量或常量必须要给出其初始值，否则将会报错。
```
var myVar = 10;
val myVal = "Hello, Scala!";
```
以上实例中，myVar 会被推断为 Int 类型，myVal 会被推断为 String 类型。

### Scala 多个变量声明
Scala 支持多个变量的声明：
```
val xmax, ymax = 100  // xmax, ymax都声明为100
```
如果方法返回值是元组，我们可以使用 val 来声明一个元组：
```
scala> val pa = (40,"Foo")
pa: (Int, String) = (40,Foo)
```

<h1>4.访问修饰符</h1>

Scala 访问修饰符基本和Java的一样，分别有：private，protected，public。

如果没有指定访问修饰符，默认情况下，Scala 对象的访问级别都是 public。

Scala 中的 private 限定符，比 Java 更严格，在嵌套类情况下，外层类甚至不能访问被嵌套类的私有成员。

## 私有(Private)成员
用 private 关键字修饰，带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。

实例
```
class Outer{
    class Inner{
        private def f(){
            println("f")
        }
        class InnerMost{
            f() // 正确
        }
    }
    (new Inner).f() //错误
}
```

(new Inner).f( ) 访问不合法是因为 f 在 Inner 中被声明为 private，而访问不在类 Inner 之内。

但在 InnerMost 里访问 f 就没有问题的，因为这个访问包含在 Inner 类之内。

Java 中允许这两种访问，因为它允许外部类访问内部类的私有成员。

### 保护(Protected)成员
在 scala 中，对保护（Protected）成员的访问比 java 更严格一些。因为它只允许保护成员在定义了该成员的的类的子类中被访问。而在java中，用 protected关键字修饰的成员，除了定义了该成员的类的子类可以访问，同一个包里的其他类也可以进行访问。

实例
```
package p {
    class Super {
        protected def f() {println("f")}
    }
    class Sub extends Super {
        f()
    }
    class Other {
        (new Super).f() //错误
    }
}
```
上例中，Sub 类对 f 的访问没有问题，因为 f 在 Super 中被声明为 protected，而 Sub 是 Super 的子类。相反，Other 对 f 的访问不被允许，因为 other 没有继承自 Super。而后者在 java 里同样被认可，因为 Other 与 Sub 在同一包里。

### 公共(Public)成员

Scala 中，如果没有指定任何的修饰符，则默认为 public。这样的成员在任何地方都可以被访问。

实例
```
class Outer {
   class Inner {
      def f() { println("f") }
      class InnerMost {
         f() // 正确
      }
   }
   (new Inner).f() // 正确因为 f() 是 public
}
```
## 作用域保护

Scala中，访问修饰符可以通过使用限定词强调。格式为:
```
private[x] 

或 

protected[x]
```
这里的x指代某个所属的包、类或单例对象。如果写成private[x],读作"这个成员除了对[…]中的类或[…]中的包中的类及它们的伴生对像可见外，对其它所有类都是private。

这种技巧在横跨了若干包的大型项目中非常有用，它允许你定义一些在你项目的若干子包中可见但对于项目外部的客户却始终不可见的东西。

实例
```
package bobsrockets{
    package navigation{
        private[bobsrockets] class Navigator{
         protected[navigation] def useStarChart(){}
         class LegOfJourney{
             private[Navigator] val distance = 100
             }
            private[this] var speed = 200
            }
        }
        package launch{
        import navigation._
        object Vehicle{
        private[launch] val guide = new Navigator
        }
    }
}
```
上述例子中，类 Navigator 被标记为 private[bobsrockets] 就是说这个类对包含在 bobsrockets 包里的所有的类和对象可见。

比如说，从 Vehicle 对象里对 Navigator 的访问是被允许的，因为对象 Vehicle 包含在包 launch 中，而 launch 包在 bobsrockets 中，相反，所有在包 bobsrockets 之外的代码都不能访问类 Navigator。

PRE >> [ HOME ](../../scala-learning.md)
NEXT >> [运算符](../part2/part.md)