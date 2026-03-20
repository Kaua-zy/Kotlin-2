//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
val numeros = mutableListOf<Double>()
    for (i in 1..4) {
        print("Digite o número $i: ")
        val numero = readLine()?.toDouble()
        numeros.add(numero ?: 0.0)

    }
   val primeiro = numeros [0]
    val ultimo = numeros [3]
    var maior = numeros [0]
    for (num in numeros) {
        if (num > maior) {
            maior = num
        }
    }
    println("O primeiro número: $primeiro")
    print ("O último número: $ultimo")
    println("O maior número: $maior")
}