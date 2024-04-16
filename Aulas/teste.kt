/*fazer um programa que valide ou invalide datas sem ano, considerando o nome dos meses */
fun main() {
    val dia = 30
    val mes = 1
    
    val diaPorMes = arrayOf(31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31)
    val nomeMes = arrayOf("Janeiro", "Fevereiro", "Marlo", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro")
    
    if(dia in 1..diaPorMes[mes-1] && mes in 1..12){
        println("Dia $dia e mes ${nomeMes[mes-1]} é válido!")
    }else{
        println("Dia $dia e mes $mes não é válido!")
    }
}