package fundamentos

fun printaFor(){
    for(numero in 1 .. 10){
        print(numero)
    }
    print(" ")

    for(numero in 10 downTo 1){
        print(numero)
    }
    print(" ")

    for(numero in 2 .. 10 step 2){
        print(numero)
    }
    print(" ")
}

fun printaWhile(){
    var x = 1
    while(x <= 10) {
        print(x)
        x++
    }

    print(" ")

    var y = 1
    do {
        print(y)
        y++
    } while(y <= 10)
}
fun main(){
    printaFor()
    printaWhile()
}