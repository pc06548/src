import scala.collection.mutable

object PizzaProblem {

  def main(args: Array[String]) {

   val orders = mutable.PriorityQueue[Order]



    def sortOrders(order: Order): Ordered[Order] = new Ordered[Order] {
      def compare(otherOrder: Order) = order.inTime.compare(otherOrder.inTime)
    }

  }

}

case class Order(inTime: Int, processingTime: Int) extends Ordered[Order]{
  override def compare(that: Order): Int = inTime.compareTo(that.inTime)
}
