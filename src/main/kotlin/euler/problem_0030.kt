package euler.probem0030

fun problem0030(): Int{
    val limit = Math.pow(9.0, 5.0).toInt() * 5
    val result = (10..limit).asSequence().filter { toDigits(it).map { Math.pow(it.toDouble(), 5.0).toInt() }.sum() == it }.sum()
    println("Problem 30: Sum of all the numbers that can be written as the sum of fifth powers of their digits is $result")
    return result
}

fun toDigits(n: Int) = Integer.toString(n).toList().map { c: Char -> Character.getNumericValue(c) }