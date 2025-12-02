file:///C:/Users/LAB203-XX/varaporn/LAB-Functional-Programming/LAB01/src/main/scala/Main.scala
### java.lang.IndexOutOfBoundsException: -1

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 766
uri: file:///C:/Users/LAB203-XX/varaporn/LAB-Functional-Programming/LAB01/src/main/scala/Main.scala
text:
```scala
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


def ex02(): Unit =
  val f = (x:Int) => x + 1
  val g = (x:Int) => x * x

  def applyTwice(h: Int => Int, x: Int): Int = {
    h(h(x))
  }
  println(applyTwice(f,5))
  println(applyTwice(g,5))


def ex03(): Unit =
  val f = (x:Int) => x + 1
  val g = (x:Int) => x * x

  def myCompose(func1: Int => Int, func2: Int => Int): Int => Int = {
    (x:Int) => f(@@)
  }
  val f_of_g = myCompose(f, g) 
  println(f_of_g(5)) 


def ex04(): Unit =
  val builtInCompose = f.compose(g)  // เหมือน f(g(x)) -> ทำหลังไปหน้า
  val builtInAndThen = f.andThen(g)  // เหมือน g(f(x)) -> ทำหน้าไปหลัง (Natural reading)

  println(builtInCompose(5)) // (5^2) + 1 = 26
  println(builtInAndThen(5)) // (5+1)^2 = 36





```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:129)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:244)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:101)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:46)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:435)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1