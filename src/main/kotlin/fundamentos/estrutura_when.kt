package fundamentos

fun funWhen(){
    val x = 15
    when(x){
        5, -5 -> println("Cinco")
        4 -> println("Quatro")
        in 11 .. 15 -> println("Entre 11 e 15!")
        else -> {
            println("Tem n!")
            println("Olha que show!")
        }
    }
}
fun comecaComOi(x: Any): Boolean {
    return when(x){
        is String -> x.startsWith(prefix = "oi")
        else -> false
    }
}

fun main() {
    funWhen()

    println(comecaComOi("Tamires"))
    println(comecaComOi("oi Tamires"))
}