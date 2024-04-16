abstract class Pessoa(val nome:String){}

class Aluno(nome:String, val num_matricula:Int):Pessoa(nome){ }

class Professor(nome:String, var especialidade:Int):Pessoa(nome){}

class Disciplina(var nome:String, var carga_horaria:Int ){
    lateinit var professor:Professor
    var alunos = mutableListOf<Aluno>()
    init{
        if(this.carga_horaria<=0 || this.carga_horaria>200){
            throw IllegalArgumentException("Carga horária precisa ser positiva maior que 200")
        }
    }
    fun addAluno(aluno:Aluno){
        this.alunos.add(aluno)
    }
    fun listarAlunos(){
        for (aluno in this.alunos){
            println(aluno.nome)
        }
    }
}

fun main(){
    var professor = Professor("Edjandir", 10)
    var disciplina = Disciplina("Matemática", 200)
    var aluno = Aluno("Bernardo", 123)
    var aluno2 = Aluno("Igor", 124)
    var aluno3 = Aluno("Caio", 234)

    disciplina.addAluno(aluno)
    disciplina.addAluno(aluno2)
    disciplina.addAluno(aluno3)
    disciplina.listarAlunos()
}