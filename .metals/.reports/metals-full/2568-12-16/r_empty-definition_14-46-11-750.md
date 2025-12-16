error id: file:///C:/Users/LAB203-XX/Documents/GitHub/Functional-Programming-2-68/LAB02/src/main/scala/Main.scala:scala/package.List.
file:///C:/Users/LAB203-XX/Documents/GitHub/Functional-Programming-2-68/LAB02/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: scala/package.List.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -List.
	 -List#
	 -List().
	 -scala/Predef.List.
	 -scala/Predef.List#
	 -scala/Predef.List().
offset: 1294
uri: file:///C:/Users/LAB203-XX/Documents/GitHub/Functional-Programming-2-68/LAB02/src/main/scala/Main.scala
text:
```scala
import scala.annotation.tailrec

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
	println(factorial3(5))
	// println(factorial4(5))
	println("---------------")
	println("Exercise 6: @tailrec - 2")
	// println(last(List(1,2,3)))
	println(last2(List(1,2,3)))
	println("---------------")
	println("Exercise 7: Recursion on Multiple/Nested Lists")
	println(append(List(1,2,3),4))
	println(flatten(List(List(1,2,3))))
	println("---------------")
	println("Exercise 8: Recursion on Sublists Other Than the Tail")
	println("PASS THIS EXERCISE")
	println("---------------")
	println("---------------")
	println("Exercise 9: Sorting")
	println(insertSort(@@List(3,5,2,6,1,4)))
	println("---------------")
}
// --------------------------------------------------------------------------------------------------------------
def processOne[A](collection: List[A]): List[A] = 
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
// --------------------------------------------------------------------------------------------------------------
def factorial(n: Int): Int = 
	if n == 0 then 1 else n * factorial(n-1)
// --------------------------------------------------------------------------------------------------------------
def fib(n: Int): Int = 
	if n <= 1 then n
	else fib(n-1) + fib(n-2)
// --------------------------------------------------------------------------------------------------------------
def hanoi[A](n: Int, from: A, middle: A, to: A): Unit = 
	if (n > 0) then
		// 1. ย้ายจาน n-1 ใบ จากเสาต้นทาง (from) ไปพักไว้ที่เสากลาง (middle)
		hanoi(n-1, from, to, middle) 
		// 2. ย้ายจานใบใหญ่ที่สุด (ใบที่ n) จากต้นทาง (from) ไปปลายทาง (to)
		println(s"$from -> $to")
		// 3. ย้ายจาน n-1 ใบ ที่พักอยู่เสากลาง (middle) ตามไปที่ปลายทาง (to)
		hanoi(n-1, middle, from, to)
// --------------------------------------------------------------------------------------------------------------
def factorial2(n: Int, acc: Int = 1): Int = 
	if (n <= 1) acc
	else factorial2(n - 1, acc * n) // Tail Call

@tailrec
def factorial3(n: Int, acc: Int = 1): Int = {
	if (n <= 1) acc
	else factorial3(n - 1, acc * n)
}

// @tailrec
// def factorial4(n: Int): Int = {
//   if (n <= 1) 1
//   else n * factorial4(n - 1) // ไม่ใช่ tail call เพราะมี *n หลังจาก recursive call
// }

// --------------------------------------------------------------------------------------------------------------
// DON'T DO THIS!
def last[A](list: List[A]): A = list match
	 case Nil         => throw new Exception("last(empty)")
	 case _ :: tail   => last(tail)
//DO THIS
@tailrec
def last2[A](list: List[A]): A = list match
	 case Nil          => throw new Exception("last(empty)")
	 case head :: tail => if tail.isEmpty then head else last2(tail)
// --------------------------------------------------------------------------------------------------------------
def concat[A](list1: List[A], list2: List[A]): List[A] = list1 match
	 case Nil            => list2
	 case head1 :: tail1 => head1 :: concat(tail1, list2)

def append[A](list: List[A], value: A): List[A] = 
	concat(list,List(value))

def flatten[A](list: List[List[A]]): List[A] = list match
	 case Nil          => Nil
	 case head :: tail => concat(head, flatten(tail))
// --------------------------------------------------------------------------------------------------------------


// --------------------------------------------------------------------------------------------------------------
def insertInSorted(x: Int, sorted: List[Int]): List[Int] = sorted match
   case Nil           => List(x)
   case min :: others =>
      if x < min then x :: sorted else min :: insertInSorted(x, others)

def insertSort(list: List[Int]): List[Int] = list match
   case Nil    => list
   case h :: t => insertInSorted(h, insertSort(t))    



```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/package.List.