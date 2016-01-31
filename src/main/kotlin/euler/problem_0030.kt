fun main(args: Array<String>){
    val limit = Math.pow(9.0, 5.0).toInt() * 5
    val list = (10..limit).asSequence().filter { toDigits(it).map { Math.pow(it.toDouble(), 5.0).toInt() }.sum() == it }
    print("Sum of all the numbers that can be written as the sum of fifth powers of their digits is ${list.sum()}")
}

fun toDigits(n: Int) = Integer.toString(n).toList().map { c: Char -> Character.getNumericValue(c) }