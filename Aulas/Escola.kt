class Pessoa(val nome:String){
    var cpf:String
}
class Aluno(nome:String, val num_matricula:Int): Pessoa(nome){}

class Professor(nome:String, val especialidade:String):Pessoa(nome){}

class Disciplina(val nome:String, ch:Int){
    var prof:Professorval alunos = mutableListOf<Aluno>()

    var ch=ch
    set(value){
        if(value in 1..200){
            field = value
        }else{
            throw IllegalArgumentException("CH precisa ser positiva e menor que 200")
        }
    }
    init{
        this.ch = ch
    }

    fun addAluno(a:Aluno){
        this.alunos.add(a)
    }
    fun listarAlunos(){
        println("/n** Lista de alunos: **")
        for(e in this.alunos){
            println(e.nome)
        }
    }
}
fun main(){
    try{
        val d1 = Disciplina("BD", 200)
        val a1 = Aluno("Joaquina", 123)
        val a2 = Aluno("Adalberto", 234)
        val a3 = Aluno("Gerônimo", 345)
        
        d1.addALuno(a1)
        d1.addALuno(a2)
        d1.addALuno(a3)
        
        d1.listarAlunos()
    }
    catch(e:Exception){
        println(e.message)
    }
}
