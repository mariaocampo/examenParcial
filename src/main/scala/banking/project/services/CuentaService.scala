package banking.project.services

import banking.project.domain._
import scala.concurrent.Future

class CuentaService {
  def getCuentaByNumeroCuenta(numero: Int): Future[Option[Cuenta]] =
    Future.successful(Some(Cuenta.defaultCuenta))

  def crearCuenta(nombreCuenta: NombreCuenta, numeroCuenta: NumeroCuenta, usuario: Usuario, fechaApertura: FechaApertura,
                  fechaCierre: FechaCierre, saldo: Saldo, tipoCuenta: TipoCuenta, estado: EstadoCuenta): Future[Cuenta] =
    for{
      c <- getCuentaByNumeroCuenta(numeroCuenta.numero)
    } yield Cuenta(
      nombreCuenta,
      numeroCuenta,
      usuario,
      fechaApertura,
      fechaCierre,
      saldo,
      tipoCuenta,
      estado
    )

  def cerrarCuenta(cuenta: Cuenta): Unit = {

  }
}