// Desenvolva um programa que solicite um dia e
// mês e informe se a data é válida.
// Ignore anos bissextos
// O mês deve ser lido com inteiros (1 a 12) mas a
// resposta deve ser por extenso. Exemplo:
    // “2 de janeiro é uma data válida”
// Utilizar template strings


fun main(){
    var mes = 1
    var dia = 30

    val diasPorMes = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val nomeMes = arrayOf("jan", "fev", "mar", "abril", "maio", "jun", "jul", "ago", "set", "out", "nov", "dez")

    if(dia in 1..diasPorMes[mes-1] && mes in 1..12){
        println("Dia $dia e mes $mes ${nomeMes[mes-1]} é válido!")
    }
}