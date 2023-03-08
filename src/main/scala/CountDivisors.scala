import scala.io.StdIn.readLine

object CountDivisors extends App {

  // Function to count the number of integers between two numbers that are divisible by third number i.e Divisor
  def countDivisibleNumbers(firstNumber: Int, secondNumber: Int, divisor: Int): Int = {

    if (divisor == 0) {
      throw new IllegalArgumentException("The Divisor cannot be zero.")
    } else {
      (firstNumber to secondNumber).count(_ % divisor == 0)
    }
  }

  try {
    val firstNumber = readLine("Enter First Number: ").toInt
    val secondNumber = readLine("Enter Second Number: ").toInt
    val divisor = readLine("Enter the Divisor: ").toInt

    val count = countDivisibleNumbers(firstNumber, secondNumber, divisor)

    println(s"There are $count numbers between $firstNumber and $secondNumber (inclusive) that are divisible by $divisor.")
  } catch {

    case _: NumberFormatException => println("Invalid input. Please enter integers only.")
    case e: IllegalArgumentException => println(e.getMessage)
  }
}