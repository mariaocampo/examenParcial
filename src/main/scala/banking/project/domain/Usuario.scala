package banking.project.domain

case class NombrePropietario(nombre:String, apellido:String)
case class Usuario(id: Int, nombrePropietario: NombrePropietario, tipo: String, direccion: String)

object Usuario {
  def defaultUsuario = new Usuario(
    15874963,
    NombrePropietario("Maria", "Ocampo"),
    "natural",
    "Parque"
  )
}
