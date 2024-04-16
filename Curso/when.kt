fun main(){
    var opcao = 10
    // when(opcao){
    //     1 -> println("Suco de laranja")
    //     2 -> println("Suco de Uva")
    //     3 -> println("Suco de Morango")
    //     else -> println("Nenhuma das opções")
    // }
    var mensagem = when(opcao){
        1 -> "Suco de Laranja"
        2 -> "Suco de Uva"
        3 -> "Suco de Morango"
        else -> "Nenhuma opção selecionada"
    }
    println(mensagem)
}