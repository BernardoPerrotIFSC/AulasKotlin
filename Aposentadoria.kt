fun main() {
    var idade = 60
    var anos_trabalhados = 23
    var sexo = "feminino"
    
    if(sexo.equals("masculino")){
        if(idade>=65){
            if(anos_trabalhados>=30){
                println("Pode se aposentar!")
            }
        }else{
            println("Não pode!")
        }
    }else if(sexo.equals("feminino")){
        if(idade>=60){
            if(anos_trabalhados>=25){
                println("Pode se aposentar!")
            }
        }else{
            println("Não pode!")
        }
    }  
}
