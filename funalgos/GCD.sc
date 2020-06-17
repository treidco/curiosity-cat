
def sort(y: (Int, Int)): (Int, Int) = if(y._1 > y._2) y else {(y._2, y._1)}

def calculate(x: (Int, Int)): Int = {
    val sorted = sort(x)

    def check(a: Int, b: Int): Int = {
         b match {
            case 0 => a
            case _ => check(b, a%b)
        }
    }
    check(sorted._1, sorted._2)
}

assert(sort((12, 56)) == (56, 12))
assert(calculate((12, 56)) == 4)
assert(calculate((1071, 462)) == 21)
