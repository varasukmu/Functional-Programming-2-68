error id: file:///C:/Users/LAB203-XX/varaporn/Functional-Programming-2-68/LAB03/src/main/scala/Main.scala:`<none>`.
file:///C:/Users/LAB203-XX/varaporn/Functional-Programming-2-68/LAB03/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -println.
	 -println#
	 -println().
	 -scala/Predef.println.
	 -scala/Predef.println#
	 -scala/Predef.println().
offset: 152
uri: file:///C:/Users/LAB203-XX/varaporn/Functional-Programming-2-68/LAB03/src/main/scala/Main.scala
text:
```scala
import scala.annotation.tailrec

@main def main() : Unit =  {
	println("---------------")
	println("Exercise 1: Global Counter (State Mutation)")
	@@println("Current total: " + addToTotal())
	println("\n---------------")
	
}
// --------------------------------------------------------------------------------------------------------------
def addToTotal(currentTotal: Int, n: Int): Int = 
  currentTotal + n
  println("Current total: " + currentTotal)

   




```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.