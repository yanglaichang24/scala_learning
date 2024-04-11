package part1

class DemoScalaClazz {

  // 方法
  def say() : Unit = {
     println("class ---ay .....")
    // 调用函数
    DemoScalaClazz.say()
  }


}

// object 相当于单例的类且初始化对象，直接可以使用
// 里面的方法也成函数，直接可以调用，类中的称为方法，必须实例化才能使用

object DemoScalaClazz {

  // 主函数
  def main(args: Array[String]): Unit = {
    //实例化类
    val clazz  = new DemoScalaClazz();
    //调用类的方法
    clazz.say();

    // 调用java 方法
    val demoClazz = new DemoClazz()
    demoClazz.say()

    //函数。类似静态方法，直接调用
    say()

    DemoScalaClazz.say()
  }

  //函数
  def say() : Unit = {
    println(" object  say .....")
  }





}


