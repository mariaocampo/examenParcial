package banking.project.domain

trait Moneda {
 val value: Double
}

case class USD(value: Double) extends Moneda
case class COP(value: Double) extends Moneda
case class EUR(value: Double) extends Moneda

