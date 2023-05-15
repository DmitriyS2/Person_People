fun main(args: Array<String>) {
    val likes = 51
    val endOfWord = if (likes==0) "никому не понравилось"
    else if (likes==1 || (likes%10==1 && likes%100!=11)) "понравилось $likes человеку"
    else "понравилось $likes людям"
    println("Ваше сообщение $endOfWord")
}