package fundamentos

fun retornaNome(): String {
    return "Tamires Lucena"
}
fun dizOi(nome: String, idade: Int = 20){
    println("Oi ${nome} de ${idade} anos!")

}
fun main() {
    println(retornaNome())
    dizOi(retornaNome(), 29)
    dizOi(idade = 24, nome = "Pedro")
    dizOi("Daniel")
}