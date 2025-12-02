import exercise.*

@main def main() : Unit =  {
  println("---------------")
  println("Exercise 1")
  ex01()    // How to use function from another folder
  println("---------------")
  println("Exercise 2")
  ex02()
  println("---------------")
  println("Exercise 3")
  ex03()
  println("---------------")
  println("Exercise 4")
  ex04()
  println("---------------")
}
// --------------------------------------------------------------------------------
def ex02(): Unit =
  val f = (x:Int) => x + 1
  val g = (x:Int) => x * x

  def applyTwice(h: Int => Int, x: Int): Int = {
    h(h(x))
  }
  println(applyTwice(f,5))
  println(applyTwice(g,5))
// --------------------------------------------------------------------------------
def ex03(): Unit =
  val f = (x:Int) => x + 1
  val g = (x:Int) => x * x

  def myCompose(func1: Int => Int, func2: Int => Int): Int => Int = {
    (x:Int) => func1(func2(x))
  }
  val f_of_g = myCompose(f, g)
  println(f_of_g(5)) 
// --------------------------------------------------------------------------------
def ex04(): Unit =
  val f = (x:Int) => x + 1
  val g = (x:Int) => x * x
  val builtInCompose = f.compose(g)
  val builtInAndThen = f.andThen(g)
  
  println(builtInCompose(5)) // (5^2) + 1 = 26
  println(builtInAndThen(5)) // (5+1)^2 = 36
// --------------------------------------------------------------------------------




