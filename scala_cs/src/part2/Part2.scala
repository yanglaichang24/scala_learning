package part2

object Part2 {

  def main(args: Array[String]): Unit = {
    var a = 10;
    var b = 20;
    var c = 25;
    var d = 25;
    //算数
    println("a + b = " + (a + b));
    println("a - b = " + (a - b));
    println("a * b = " + (a * b));
    println("b / a = " + (b / a));
    println("b % a = " + (b % a));
    println("c % a = " + (c % a));

    // 关系
    println("a == b = " + (a == b));
    println("a != b = " + (a != b));
    println("a > b = " + (a > b));
    println("a < b = " + (a < b));
    println("b >= a = " + (b >= a));
    println("b <= a = " + (b <= a));


    var f = true;
    var e = false;
    println("f && e = " + (f && e));
    println("f || e = " + (f || e));
    println("!(f && e) = " + !(f && e));


    /* 60 = 0011 1100 */
     a = 60;
    /* 13 = 0000 1101 */
     b = 13;

     c = 0;

     c = a & b; /* 12 = 0000 1100 */
     println("a & b = " + c);

     c = a | b; /* 61 = 0011 1101 */
     println("a | b = " + c);

     c = a ^ b; /* 49 = 0011 0001 */
     println("a ^ b = " + c);

     c = ~a; /* -61 = 1100 0011 */
     println("~a = " + c);

    c = a << 2; /* 240 = 1111 0000 */
    println("a << 2 = " + c);

    c = a >> 2; /* 15 = 1111 */
    println("a >> 2  = " + c);

    c = a >>> 2; /* 15 = 0000 1111 */
    println("a >>> 2 = " + c);


  }

}
