import kotlin.math.pow
import kotlin.math.sqrt
fun main(){
    print("Digite um numero: ")
    var num = readln().toDouble()

    if(num%2 == 0.0){
        print("Numero digitado: $num \nRaiz Quadrada: ${Math.sqrt(num)}")
    }
    else{
        print("Numero digitado: $num \nPotencia: ${num.pow(2)} ")
    }
}