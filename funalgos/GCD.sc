
//Find the GCD using Euclidian algorithm (using division)
def gcd(x: Int, y: Int): Int = {
    val sorted = List(x, y).sorted

    def calculate(a: Int, b: Int): Int = if(b == 0) a else calculate(b, a%b)
    
    calculate(sorted(0), sorted(1))
}

assert(gcd(12, 56) == 4)
assert(gcd(1071, 462) == 21)
