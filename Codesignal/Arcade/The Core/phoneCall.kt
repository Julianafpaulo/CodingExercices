/*Some phone usage rate may be described as follows:

first minute of a call costs min1 cents,
each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
each minute after 10th costs min11 cents.
You have s cents on your account before the call. What is the duration of the
longest call (in minutes rounded down to the nearest integer) you can have? */

fun phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
   
   if(s<min1){
       return 0
   }
   if((s/min1 == 1)){
       return 1
   }else{
       val x = s-min1
       if(x/min2_10< 9){
        return  x/min2_10 + 1
       }else{
           val y = x - (min2_10* 9)
            return y/min11 + 10
        }
   }
}