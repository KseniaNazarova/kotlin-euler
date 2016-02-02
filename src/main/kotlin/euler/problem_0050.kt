package euler.probem0050

fun problem0050(): Int{
    val limit = 1000000
    val primeList = (0..limit).filter { isPrime(it) }

    var counter = 0; var maxCounter = 0; var primeSum = 0
    for (i in primeList.indices) {
        counter = 0
        var sum = 0
        for (j in primeList.subList(i, primeList.lastIndex)) {
            if (sum + j >= limit)
                break
            sum += j
            counter++
            if (counter > maxCounter && isPrime(sum)) {
                primeSum = sum
                maxCounter = counter
            }
        }
    }
    println("Problem 50: $primeSum can be written as the sum of the most consecutive primes")
    return primeSum
}

fun isPrime(n: Int) = n > 1 && (2..Math.sqrt(n.toDouble()).toInt()).find { n % it == 0 } == null
