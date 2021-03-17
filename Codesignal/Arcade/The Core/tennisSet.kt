/*In tennis, the winner of a set is based on how many games each player wins. 
The first player to win 6 games is declared the winner unless their opponent had already won 5 games, 
in which case the set continues until one of the players has won 7 games.

Given two integers score1 and score2, your task is to determine if it is possible for
a tennis set to be finished with a final score of score1 : score2. */

fun tennisSet(score1: Int, score2: Int): Boolean {
    if(score1==score2) return false
    if(maxOf(score1,score2)==6 &&minOf(score1, score2)<5)
        return true
    if(minOf(score1,score2)>=5 && maxOf(score1,score2)==7)
        return true
    return false
}
