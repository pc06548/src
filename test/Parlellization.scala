package test

import scala.collection.parallel.immutable.ParHashSet

object Parlellization {
  def main (args: Array[String]){

    val phs = new ParHashSet[Int]()
    phs+1
    phs+2
    phs+3
    phs+4
  }
}
