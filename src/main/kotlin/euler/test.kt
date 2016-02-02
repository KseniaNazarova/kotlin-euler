import euler.probem0023.*
import euler.probem0030.problem0030
import euler.probem0039.problem0039
import euler.probem0034.*
import euler.probem0050.*
import org.junit.Assert
import org.junit.Test

class TestProblems {
    @Test fun testPrime() {
        Assert.assertFalse(isPrime(23456))
        Assert.assertTrue(isPrime(180001))
    }
    @Test fun testFactorial() {
        Assert.assertEquals(362880, factorial(9))
    }
    @Test fun testToDigits() {
        Assert.assertEquals(listOf(3, 4, 5, 6, 7, 0), toDigits(345670))
    }
    @Test fun testDivisors() {
        Assert.assertEquals(listOf(1, 2, 3, 6, 7, 14, 21), getDivisors(42))
        Assert.assertEquals(listOf(1), getDivisors(180001))
    }
    @Test fun testProblem23() {
        Assert.assertEquals(4179871, problem0023())
    }
    @Test fun testProblem30() {
        Assert.assertEquals(443839, problem0030())
    }
    @Test fun testProblem34() {
        Assert.assertEquals(40730, problem0034())
    }
    @Test fun testProblem39() {
        Assert.assertEquals(840, problem0039())
    }
    @Test fun testProblem50() {
        Assert.assertEquals(997651, problem0050())
    }
}