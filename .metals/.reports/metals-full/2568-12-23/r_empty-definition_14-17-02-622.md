error id: file:///C:/Users/LAB203-XX/varaporn/Functional-Programming-2-68/LAB03/src/main/scala/Main.scala:java/time/DayOfWeek#
file:///C:/Users/LAB203-XX/varaporn/Functional-Programming-2-68/LAB03/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: java/time/DayOfWeek#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -java/time/DayOfWeek.
	 -DayOfWeek.
	 -scala/Predef.DayOfWeek.
offset: 1824
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
	println("---------------")
	println("Exercise 3: Normalize Name (Data Mutation)")
	val users = List("  somCHAI ", " maNEe  ")
	val cleanUsers = normalizeNames(users)
	println(users)      // Expected: List("  somCHAI ", " maNEe  ") (เหมือนเดิม)
	println(cleanUsers) // Expected: List("Somchai", "Manee") (ของใหม่)
	println("---------------")
	println("Exercise 4:  Time Bomb (Hidden Dependency)")
	println(getDiscountPrice(100.0, DayOfWeek.MONDAY))  // Expected: 50.0
	println(getDiscountPrice(100.0, DayOfWeek.FRIDAY))  // Expected: 100.0
	println("---------------")
}
// --------------------------------------------------------------------------------------------------------------
def addToTotal(currentTotal: Int, n: Int): Int =
  currentTotal + n
// --------------------------------------------------------------------------------------------------------------
def checkGrade(score: Int): String = {
	if (score >= 50) then "Congratulations! You passed."
	else "Sorry, you failed. Try again."
}
// --------------------------------------------------------------------------------------------------------------
def normalizeNames(names: List[String]): List[String] =
	names.map( name => name.trim.toLowerCase.capitalize )
// --------------------------------------------------------------------------------------------------------------
import java.time.DayOfWeek
def getDiscountPrice(price: Double, day: DayOfWeek): Double =
	if day == DayO@@fWeek.MONDAY then price * 0.5
	else price

  




```


#### Short summary: 

empty definition using pc, found symbol in pc: java/time/DayOfWeek#