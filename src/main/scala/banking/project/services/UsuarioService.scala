package banking.project.services

import banking.project.domain.{NombrePropietario, Usuario}
import scala.concurrent.Future

class UsuarioService {
  def getUserByFirstName(nombre: String): Future[Option[Usuario]] =
    Future.successful(Some(Usuario.defaultUsuario))
  def getUserById(id: Int): Future[Option[Usuario]] =
    Future.successful(Some(Usuario.defaultUsuario))

  def createUser(nombre: String, apellido: String, id: Int, direccion: String, tipoPersona: String ): Future[Usuario] =
    for{
      n <- getUserByFirstName(nombre)
      i <- getUserById(id)
    } yield Usuario(
      id,
      NombrePropietario(nombre, apellido),
      tipoPersona,
      direccion
    )
}
