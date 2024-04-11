package part1

object Part1 {

  def main(args: Array[String]): Unit = {
    // 声明变量 常量
    var a = 2
    a = 3

    //常量// 不可修改
    val PI = 3.1415

    //常用数据类型
    // Byte
    var b :Byte = 3

    // char
    var c :Char = 'd'

    //
    var d :String = "string"

    //uint 没有类型，类似java void
    var e = {}

    //Nothing 判断是否产生异常
    def myfun() = throw new IllegalArgumentException

    //null
    var f = null


    // 字符串的操作
    val g = "woocnlmal;ilerljdpdofj"
    println(g)

    println(g.length)

    val i = g.concat("dd")

    println(i + "ccccc")

    // 格式化
    val floatVal = 3.14
    val intVal = 1
    val stringVal = "ddd"

    printf("%.3f,%d,%s ",floatVal,intVal,stringVal)

    //其他方法
    val h = g.endsWith("xx")
    val j = g.equals("xxx")
    val k = g.compareTo("ttt")
    val l = g.split("xxx")
    var m = g.matches("[0-9]+")


    // 字符串插值
    println(s"这是${g}")
    println(s"这是${stringVal}")

    //正则匹配




  }


}
