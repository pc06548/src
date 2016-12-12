package SnakeLadder.domain


import scala.util.Random

class Player(currentPosition:Int) {

  def play(board: Board): Option[Player] = {
    val movement = Random.nextInt(6)+1
    val position = board.move(currentPosition + movement)
    position match {
      case Some(a:Int) => Some(new Player(a))
      case None => None
    }
  }

}