// Exercise 2: Create hello-world project
@main def hello(): Unit =
  println("Hello Varaporn")
  println(msg)

def msg = "I was compiled by Scala 3. :)"

// Exercise 3: Everything is an Expression  ทำใน  Terminal
scala> val result = if (10 > 5) "Win" else "Lose"
val result: String = Win

scala> val result = if (10 < 5) "Win" else "Lose"
val result: String = Lose

// Exercise 4: Immutability Test  ทำใน  Terminal
sbt console
scala> var a = 10
var a: Int = 10

scala> a = 20
a: Int = 20

scala> val b = 10
val b: Int = 10

scala> b = 20
-- [E052] Type Error: ----------------------------------------------------------
1 |b = 20
  |^^^^^^
  |Reassignment to val b
  |
  | longer explanation available when compiling with `-explain`
1 error found
// แค่ให้รู้ว่า  var  val  ต่างกันยังไง


// Exercise 5: Easy Side Effect.
@main def sideEffectExample(): Unit =
  var counter = 0 
  def increment(): Unit =
    counter += 1 

  println(s"Initial counter: $counter") 
  increment()
  println(s"Counter after increment: $counter")

@main def functionalExample(): Unit =
  def increment(counter: Int): Int =
    counter + 1 

  val initialCounter = 0
  val updatedCounter = increment(initialCounter)

  println(s"Initial counter: $initialCounter")
  println(s"Counter after increment: $updatedCounter")
