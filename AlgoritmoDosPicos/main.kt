class Condicao(
    val nome:String, 
    val vento_min:Int, 
    val vento_max:Int, 
    val tam_swellmin:Double, 
    val tam_swellmax:Double,
    val dir_swellmin:Int,
    val dir_swellmax:Int,
    val tainha:String){
        fun picoNorte(vento:Int, swell:Double, direcao:Int){
            if (vento <= this.vento_min || vento >= this.vento_max){
                if (swell >= this.tam_swellmin && swell <= this.tam_swellmax){
                    if (direcao >= this.dir_swellmin && direcao <= this.dir_swellmax){
                        println(this.nome)
                    }
                }
            }
        }
        fun picoSul(vento:Int, swell:Double, direcao:Int){
            if (vento >= this.vento_min && vento <= this.vento_max){
                if (swell >= this.tam_swellmin && swell <= this.tam_swellmax){
                    if (direcao >= this.dir_swellmin && direcao <= this.dir_swellmax){
                        println(this.nome)
                    }
                }
            }
        }
    }


fun main(){

    var vento = 10
    var swell = 1.5
    var direcao = 130

    val picosNorte = listOf(Condicao("Guarda do Embaú", 50, 270, 1.1, 2.8, 80, 180, "fechado"),
    Condicao("Silveira Norte",50, 247, 1.1, 2.3, 70, 140, "fechado"),
    Condicao("Ferrugem", 67, 247, 1.1, 1.9, 80, 190, "aberto"),
    Condicao("Ibiraquera", 45, 240, 1.0, 2.5, 60, 180, "bandeira"),
    Condicao("Vila",67, 240, 1.1, 3.0, 112, 200, "bandeira"),
    Condicao("Itapiruba Norte",67, 315, 1.0, 1.8, 67, 200, "bandeira")
    

    )
    val picosSul = listOf(Condicao("Gamboa",180, 290, 1.4, 2.5, 90, 135, "fechado"),
    Condicao("Garopabinha", 180, 290, 1.1, 1.7, 70, 120, "fechado"),
    Condicao("Tayson", 65, 360, 1.1, 2.0, 70, 135, "bandeira"),
    Condicao("Silveira Sul", 65, 360, 1.6, 4.0, 80, 190, "bandeira"),
    Condicao("Barrinha", 160, 290, 1.1, 1.7, 70, 190, "fechado"),
    Condicao("Barra Norte", 180, 380, 1.1, 1.7, 80, 180, "fechado"),
    Condicao("Barra SUl", 257, 280, 1.1, 1.8, 70, 190, "fechado"),
    Condicao("Ouvidor", 180, 290, 1.1, 1.6, 80, 157, "fechado"),
    Condicao("Vermelha",180, 280, 1.3, 2.0, 80, 157, "fechado"),
    Condicao("Rosa Norte", 75, 135, 1.0, 2.0, 75, 185, "aberto"),
    Condicao("Rosa Sul",135, 270, 1.0, 4.5, 55, 200, "bandeira"),
    Condicao("luz", 120, 270, 1.0, 1.8, 65, 180, "fechado"),
    Condicao("Ribanceira", 160, 270, 1.0, 3.0, 70, 190, "bandeira"),
    Condicao("Praia d'água", 180, 270, 1.1, 1.7, 90, 185, "aberto"),
    Condicao("Portinho",135, 270, 1.1, 2.5, 67, 135, "aberto"),
    Condicao("Itapiruba Sul",157, 270, 1.2, 2.0, 90, 135, "fechado"),
    Condicao("Gi Sul",190, 270, 1.5, 2.2, 70, 130, "aberto"),
    Condicao("Gi Norte", 10, 290, 1.0, 1.5, 70, 180, "aberto"),



    



    )

    var ravena = Condicao("Ravena",150, 270, 1.6, 2.2, 90, 185, "aberto")
    var ponta = Condicao("Ponta",170, 270, 1.3, 1.6, 90, 185, "aberto")
    //FarolDeSantaMarta
    var tereza = Condicao("Tereza",157, 270, 1.3, 2.5, 90, 190, "aberto")
    var ipua = Condicao("Ipuã", 67, 270, 1.1, 2.8, 90, 190, "aberto")
    var galheta = Condicao("Galheta", 67, 270, 1.1, 2.8, 90, 190, "aberto")
    var cardoso = Condicao("Cardoso", 67, 245, 1.1, 5.0, 90, 190, "aberto")
    var cigana = Condicao("Cigana", 67, 270, 1.1, 2.3, 100, 200, "aberto")

    for (pico in picosNorte){
        pico.picoNorte(vento,swell,direcao)
    }
    for(pico in picosSul){
        pico.picoSul(vento,swell,direcao)
    }
}