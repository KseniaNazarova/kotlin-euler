package euler.probem0034

fun problem0034(): Int{
    // Для любого n-значного факториона d справеливо: 10^(n - 1) <= d <= 9!n (9! = 362880)
    // При n = 8: 10^7 > 9!*8 = 2903040. Следовательно максимальное значение n = 7, а факторион должен быть меньше 9!*7 = 2540160
    // -> 1999999 - 7-значное число < 9!*7, для которого сумма факториалов цифр будет максимальной = 2177281 (не является факторионом)
    // -> 1999998 - следущее число, для которого сумма факториалов цифр будет максимальной = 1854721 (ист. https://en.wikipedia.org/wiki/Factorion)

    val result = (10..1854721).asSequence().filter { toDigits(it).map { factorial(it) }.sum() == it }.sum()
    println("Problem 34: Sum of all numbers which are equal to the sum of the factorial of their digits is $result")
    return result
}

fun factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)
fun toDigits(n: Int) = Integer.toString(n).toList().map { c: Char -> Character.getNumericValue(c) }