/*You are given a two-digit integer n. Return the sum of its digits.*/
fun addTwoDigits(n: Int): Int {
    val n1: Int = n%10
    val n2: Int = n/10
    
    return n1+n2
}
