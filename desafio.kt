enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nomeUsuario: String)
	
data class ConteudoEducacional(val nome: String, var duracao: Int, val nivel: List<Nivel>)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>)
    
val inscritos = mutableListOf<Usuario>()
    
fun matricular(usuario: Usuario) {
    inscritos.add(usuario)           
    }

fun main() {
        
    val usuario = Usuario("Ricardo Gomes")
    val conteudoeducacional = ConteudoEducacional("SQL", 5, listOf(Nivel.INTERMEDIARIO))
    val formacao = Formacao("Python",listOf(conteudoeducacional))
    
    
    matricular(usuario)
    

    println(usuario.nomeUsuario)
    println(conteudoeducacional)
    println(formacao)
    
}