package fundamentos

fun parOuImpar(numero: Int): String {
    val resto = numero % 2
    return if(resto == 0) "Par"
    else "Impar"
}

fun main(){
    println(parOuImpar(1))
    println(parOuImpar(2))
}