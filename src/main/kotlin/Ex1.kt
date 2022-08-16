fun main(){
    print("Digite um numero:")
    var num1 = readln().toInt()
    print("Digite um numero:")
    var num2 = readln().toInt()
    print("Digite um numero:")
    var num3 = readln().toInt()
    val numMaior:Int
    if(num1 > num2 && num1 > num3){
        print("Numero maior digitado: $num1")
    }
    else if(num2 > num1 && num2 > num3){
        print("Numero maior digitado: $num2")
    }
    else if(num3 > num1 && num3 > num2){
        print("Numero maior digitado: $num3")
    }
    else{
        print("Há dois numeros ou mais cujo valor mais alto são iguais")
    }
}