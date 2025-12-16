error id: file:///C:/Users/LAB203-XX/Documents/GitHub/Functional-Programming-2-68/LAB02/src/main/scala/Main.scala:scala/package.List#
file:///C:/Users/LAB203-XX/Documents/GitHub/Functional-Programming-2-68/LAB02/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: scala/package.List#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -List#
	 -scala/Predef.List#
offset: 826
uri: file:///C:/Users/LAB203-XX/Documents/GitHub/Functional-Programming-2-68/LAB02/src/main/scala/Main.scala
text:
```scala
@main def main() : Unit =  {
	println("---------------")
	println("Exercise 1-0")
	println(processOne(List(1,2,3)))
	println("\nExercise 1-1")
	// processCollection(List(1,2,3))
	println("\nExercise 1-2")
	// processCollection2(List(1,2,3))
	println("\nExercise 1-3")
	// processCollection3(List(1,2,3))
	println("\n---------------")
	println("Exercise 2 : Factorial")
	println(factorial(5))
	println("---------------")
	println("Exercise 3 : Fibonacci")
	println(fib(6))
	println("---------------")
	println("Exercise 4: Tower of Hanoi Puzzle")
	hanoi(3, 'L', 'M', 'R')
	println("---------------")
	println("Exercise 5: @tailrec")
	println(factorial2(5))
	println("---------------")
}
// --------------------------------------------------------------------------------
def processOne[A](collection: L@@ist[A]): List[A] = 
	collection match
		case _ :: t => t
		case Nil => throw new Exception("EmptyList")

def processCollection[A](collection: List[A]): Unit =
	while collection.nonEmpty do
			println(processOne(collection))

def processCollection2[A](collection: List[A]): Unit =
	var remaining = collection
		while remaining.nonEmpty do
				println(remaining)
				remaining = processOne(remaining)

def processCollection3[A](collection: List[A]): Unit =
		println(collection)
		if collection.nonEmpty then processCollection3(processOne(collection))
// --------------------------------------------------------------------------------
def factorial(n: Int): Int = 
	if n == 0 then 1 else n * factorial(n-1)
// --------------------------------------------------------------------------------
def fib(n: Int): Int = 
	if n <= 1 then n
	else fib(n-1) + fib(n-2)
// --------------------------------------------------------------------------------
def hanoi[A](n: Int, from: A, middle: A, to: A): Unit = 
  if (n > 0) then
    // 1. ย้ายจาน n-1 ใบ จากเสาต้นทาง (from) ไปพักไว้ที่เสากลาง (middle)
    hanoi(n-1, from, to, middle) 
    // 2. ย้ายจานใบใหญ่ที่สุด (ใบที่ n) จากต้นทาง (from) ไปปลายทาง (to)
    println(s"$from -> $to")
    // 3. ย้ายจาน n-1 ใบ ที่พักอยู่เสากลาง (middle) ตามไปที่ปลายทาง (to)
    hanoi(n-1, middle, from, to)
// --------------------------------------------------------------------------------
def factorial2(n: Int, acc: Int = 1): Int = 
  if (n <= 1) acc
  else factorial2(n - 1, acc * n) // Tail Call



```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/package.List#