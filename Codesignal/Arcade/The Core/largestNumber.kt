//Given an integer n, return the largest number that contains exactly n digits.

fun largestNumber(n: Int): Int {
    var a = ""
    for(i in 1 ..n){
        a = a + "9"
    }
    
    return a.toInt()
}
