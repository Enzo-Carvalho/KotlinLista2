fun main() {
    print("Digite um numero:")
    var num1 = readln().toInt()
    print("Digite um numero:")
    var num2 = readln().toInt()
    print("Digite um numero:")
    var num3 = readln().toInt()

    if(num2 in num1..num3){
        print("$num1, $num2 e $num3")
    }
    else if(num1 in num2..num3){
        print("$num2, $num1 e $num3")
    }
    else if(num3 in num2..num1){
        print("$num2, $num3 e $num1")
    }
    else if(num2 in num3..num1){
        print("$num3, $num2 e $num1")
    }
    else if(num3 in num1..num2){
        print("$num1, $num3 e $num2")
    }
    else{
        print("$num3, $num1 e $num2")
    }
}