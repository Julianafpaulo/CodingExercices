/*Given integers a and b, determine whether the following pseudocode results in an infinite loop */
fun isInfiniteProcess(a: Int, b: Int): Boolean {
    if(a==b)
        return false
        
     if(a==0||b==0||a>b)
        return true
        
    return !((b-a)%2==0)
    
}
