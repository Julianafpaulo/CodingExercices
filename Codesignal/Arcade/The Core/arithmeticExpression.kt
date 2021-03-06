/*Consider an arithmetic expression of the form a#b=c. 
Check whether it is possible to replace # with one of the four signs: +, -, * or / 
to obtain a correct expression.*/

fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {
    return (a*b==c||(a/b==c&&a%b==0)||a-b==c||a+b==c)
}
