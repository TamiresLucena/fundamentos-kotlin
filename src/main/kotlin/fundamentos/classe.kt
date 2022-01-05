package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Nome: ${nome}"
    }
}

fun main(){
    var tamires = Pessoa("Tamires", 29)
    println(tamires)
}