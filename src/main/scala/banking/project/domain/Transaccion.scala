package banking.project.domain

case class Transaccion(valor: Saldo, cuentaDebita: Cuenta, cuentaCredito: Cuenta, moneda: Moneda)

object Transaccion {
}
