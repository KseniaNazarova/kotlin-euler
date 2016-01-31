fun main(args: Array<String>){
    val list = (10..1854721).asSequence().filter { toDigits(it).map { factorial(it) }.sum() == it }
    println("Sum of all numbers which are equal to the sum of the factorial of their digits is ${list.sum()}")
}

fun factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)
fun toDigits(n: Int) = Integer.toString(n).toList().map { c: Char -> Character.getNumericValue(c) }