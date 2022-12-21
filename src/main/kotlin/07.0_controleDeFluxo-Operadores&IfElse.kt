/* Operadores de comparação, igualdade e lógicos->
    if (a > b) {} maior
    if (a < b) {} menor
    if (a >= b) {} maior igual
    if (a <= b) {} menor igual
    if (a == b) {} igual
    if (a != b) {} diferente
    if (!valor) {} negação
    if (a || b) {} disjunção (ou)
-> prioridade para:
    () -> ! -> && -> ||
-> operador intervalo:
    if (n >= 1 && n <= 50) {} -> if (n in 1..50) {}
*/
fun main() {
    /*
    existem passos a serem planejados e seguidos para se programar.
    Se houver desvios nesse caminho, faz-se necessário um controle de fluxo
    Os controladores de fluxo são boleanos e são executados na condição verdadeira.
     */

    //if ->
    val num = 10
    if (num > 20) {
        println("Número maior que 20")
    }

    //if/eslse ->
    fun maiorDeIdade(idade: Int) {
        if (idade >= 18) {
            println("Maior de idade") //tbm é possível aninhar "if"'s
        } else { //tbm é possível fazer "else if" antes de else
            println("Menor de idade")
        }
    }
    maiorDeIdade(20)
    maiorDeIdade(18)
    maiorDeIdade(15)

    //outra forma possível com if/else ->
    fun saudacao(dia: Boolean): String {
        return if (dia) {
            "Bom dia"
        } else {
            "Boa noite"
        }
    }
}