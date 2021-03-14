/*Given a divisor and a bound, find the largest integer N such that:
N is divisible by divisor.
N is less than or equal to bound.
N is greater than 0.
It is guaranteed that such a number exists. */

fun maxMultiple(divisor: Int, bound: Int): Int {
    var n = bound
    while(n != 1){
        if (n%divisor == 0){
            return n
        }else{
            n = n-1
        }
    }
    return -1
}