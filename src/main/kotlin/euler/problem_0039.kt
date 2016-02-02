package euler.probem0039

fun problem0039(): Int{
    // Формулы Евклида для пифагоровой тройки: a = 2mn, b = m^2-n^2, c = m^2+n^2
    // -> p = 2mn + 2m^2 -> p - четное

    val perimeters = (2..1000).filter { it % 2 == 0 }
    val solutions = perimeters.map { p -> (2..p/(2 + Math.sqrt(2.0)).toInt() + 1).filter { (p * (p - 2 * it)) % (2 * (p - it)) == 0  }.size }
    var result = perimeters[solutions.indexOf(solutions.max())]
    println("Problem 39: Number of solutions is maximum for $result")
    return result
}