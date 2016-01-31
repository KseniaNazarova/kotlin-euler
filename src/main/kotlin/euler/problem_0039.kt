fun main(args: Array<String>){
    val perimeters = (2..1000).filter { it % 2 == 0 }
    val solutions = perimeters.map { p -> (2..p/(2 + Math.sqrt(2.0)).toInt() + 1).filter { (p * (p - 2 * it)) % (2 * (p - it)) == 0  }.size }
    println("Number of solutions is maximum for ${perimeters[solutions.indexOf(solutions.max())]}")
}