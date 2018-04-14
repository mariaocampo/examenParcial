package banking.project.domain

case class NombreCuenta(nombre: String)
case class TipoCuenta(id: Int, tipo: String)
case class NumeroCuenta(numero: Int)
case class FechaApertura(fecha: String)
case class FechaCierre(fecha: String)
case class Saldo(valor: Double)
case class EstadoCuenta(estado: String)

case class Cuenta(nombreCuenta: NombreCuenta, numeroCuenta: NumeroCuenta, usuario: Usuario, fechaApertura: FechaApertura,
                  fechaCierre: FechaCierre, saldo: Saldo, tipoCuenta: TipoCuenta, estado: EstadoCuenta)

object Cuenta {
  def defaultCuenta = new Cuenta(
    NombreCuenta("banking"),
    NumeroCuenta(445526),
    Usuario(15874963, NombrePropietario("Maria", "Ocampo"), "natural", "Parque"),
    FechaApertura("2018/04/14"),
    FechaCierre(""),
    Saldo(20000),
    TipoCuenta(1,"ahorros"),
    EstadoCuenta("activa"),
  )
}
