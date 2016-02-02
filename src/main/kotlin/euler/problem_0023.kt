package euler.probem0023

fun problem0023(): Int{
    val limit = 28123
    val abArray = (12..limit).filter { getDivisors(it).sum() > it }
    val sum = Array(limit + 1, {i -> false})
    abArray.indices.map{ i -> abArray.subList(i, abArray.lastIndex + 1).map { if (abArray[i] + it <= limit) sum[abArray[i] + it] = true}}
    val result = sum.indices.filter { sum[it] == false}.sum()
    println ("Problem 23: Sum of all the positive integers which cannot be written as the sum of two abundant numbers is $result")
    return result
}

fun getDivisors(n: Int) = (1..n / 2).asSequence().filter { n % it == 0 }.toArrayList()