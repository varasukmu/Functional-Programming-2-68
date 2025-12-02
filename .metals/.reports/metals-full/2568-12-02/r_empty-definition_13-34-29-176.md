error id: file:///C:/Users/LAB203-XX/varaporn/LAB-Functional-Programming/LAB01/src/main/scala/Main.scala:
file:///C:/Users/LAB203-XX/varaporn/LAB-Functional-Programming/LAB01/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 392
uri: file:///C:/Users/LAB203-XX/varaporn/LAB-Functional-Programming/LAB01/src/main/scala/Main.scala
text:
```scala
@main def ex1(): Unit =
  val f = (x:Int) => x + 1
  val g = (x:Int) => x + 1


def msg = "I was compiled by Scala 3. :)"

sbt console
// Exercise 1: สร้างฟังก์ชันพื้นฐาน

scala>                                    
val f: Int => Int = Lambda$6631/0x0000016cd7128c00@45e0a0f6

scala> val g = (x:Int) => x * x
val g: Int => Int = Lambda$6649/0x0000016cd7134400@29531f18

scala> @@println(f(5))
6

scala> println(g(5))
25

// Exercise 2: Higher-Order Functions


```


#### Short summary: 

empty definition using pc, found symbol in pc: 