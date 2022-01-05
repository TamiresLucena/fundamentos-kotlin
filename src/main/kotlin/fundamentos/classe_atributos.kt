package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {
}

class Dono(var nome: String, var idade: Int) {
}

fun main(){
    var carro = Carro("Azul", 2021, Dono("tamires", 29))
    println(carro.cor)
    carro.cor = "Amarelo"
}