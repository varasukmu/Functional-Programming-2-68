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
	if day == DayOfWeek.MONDAY then price * 0.5
	else price

  



