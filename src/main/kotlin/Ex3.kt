fun main() {
    print("Digite sua idade: ")
    var idade = readln().toInt()

    if(idade>=10 && idade<=14)
    {
        print("Categoria: Infantil")
    }
    else if(idade>=15 && idade<=17)
    {
        print("Categoria: Juvenil")
    }
    else if(idade>=18 && idade<=25)
    {
        print("Categoria: Adulto")
    }
    else
    {
        print("Sem categoria")
    }
}