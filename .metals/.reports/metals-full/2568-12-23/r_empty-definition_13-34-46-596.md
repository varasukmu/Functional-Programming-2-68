error id: file:///C:/Users/LAB203-XX/varaporn/Functional-Programming-2-68/LAB03/src/main/scala/Main.scala:scala/Predef.String#
file:///C:/Users/LAB203-XX/varaporn/Functional-Programming-2-68/LAB03/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: scala/Predef.String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -String#
	 -scala/Predef.String#
offset: 581
uri: file:///C:/Users/LAB203-XX/varaporn/Functional-Programming-2-68/LAB03/src/main/scala/Main.scala
text:
```scala
@main def main() : Unit =  {
	println("---------------")
	println("Exercise 1: Global Counter (State Mutation)")
	val start = 0
	val step1 = addToTotal(start, 5)
	val step2 = addToTotal(step1, 10)
	println(step2) 
	println("---------------")
	println("Exercise 2: Check Grade (Mixing Logic & I/O)")
	val result = checkGrade(75)
	println(result)

	
}
// --------------------------------------------------------------------------------------------------------------
def addToTotal(currentTotal: Int, n: Int): Int =
  currentTotal + n

def checkGrade(score: Int): St@@ring = {
	if (score >= 50) return 
}
  




```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Predef.String#