package SnakeLadder.domain

sealed trait Step

case class Snake(end:Int) extends Step
case class Ladder(end:Int) extends Step
case class BlankStep() extends Step
