import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestCases extends AnyFlatSpec with Matchers {

  // Test the countDivisibleNumbers function with valid input
  "countDivisibleNumbers" should "return the correct count of divisible numbers" in {
    CountDivisors.countDivisibleNumbers(0, 10, 2) shouldEqual 6
    CountDivisors.countDivisibleNumbers(10, 20, 3) shouldEqual 3
    CountDivisors.countDivisibleNumbers(-5, 5, 1) shouldEqual 11
  }

  // Test the countDivisibleNumbers function with invalid input (divisor = 0)
  it should "throw an IllegalArgumentException when divisor is zero" in {
    an[IllegalArgumentException] should be thrownBy {
      CountDivisors.countDivisibleNumbers(0, 10, 0)
    }
  }

  // Test the countDivisibleNumbers function with invalid input (firstNumber > secondNumber)
  it should "return zero when firstNumber is greater than secondNumber" in {
    CountDivisors.countDivisibleNumbers(10, 0, 2) shouldEqual 0
  }
}