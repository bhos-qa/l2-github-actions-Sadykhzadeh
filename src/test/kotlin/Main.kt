import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.DisplayName

class CalculatorTest {

  private val calculator = Calculator(1, 2)

  @Test
  @DisplayName("Test add method")
  fun testAdd() {
    assertEquals(3, calculator.add())
  }

  @Test
  @DisplayName("Test subtract method")
  fun testSubtract() {
    assertEquals(-1, calculator.subtract())
  }

  @Test
  @DisplayName("Test multiply method")
  fun testMultiply() {
    assertEquals(2, calculator.multiply())
  }

  @Test
  @DisplayName("Test divide method")
  fun testDivide() {
    assertEquals(0, calculator.divide())
  }

  @Test
  @DisplayName("Test divide by zero")
  fun testDivideByZero() {
    val calculatorZeroErr = Calculator(1, 0)
    assertThrows(IllegalArgumentException::class.java) {
      calculatorZeroErr.divide()
    }
  }
}
