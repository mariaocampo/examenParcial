package banking.project.services
import banking.project.domain._

class TransaccionService {

  def RealizarTransaccion(saldo: Double, cuentaDebita: Cuenta, cuentaCredito: Cuenta, moneda: Moneda): Unit = {
    if (cuentaDebita.saldo.valor <= saldo && cuentaDebita.estado.equals("activa") && cuentaCredito.estado.equals("activa")){
      cuentaCredito.saldo.valor += convertirPesos(moneda, {})
      cuentaDebita.saldo.valor -= saldo
    }
  }

  def convertirPesos(m: Moneda, trms: List[(Moneda, Double)], trmValue:(Double, List[(Moneda, Double)]) => Double): Double = m
  match{
    case usd @ USD(v) => trmValue(v,trms)
    case cop @ COP(v) => trmValue(v,trms)
  }

  def trmValue(v: Double, trms: List[(Moneda, Double)]): Double = {
    v * trms.find {
      case(USD(v), trm) => true
    }.get._2
  }
}
