package SnakeLadder.service

import SnakeLadder.domain.{Ladder, Snake, Board}

trait GamePlay {
  def move(board: Board, steps:Int):Option[Int]
}


class BasicGamePlay() extends GamePlay{
  override def move(board: Board, steps:Int): Option[Int] = {
    if(steps < board.matrix.size) {
      board.matrix(steps) match {
        case (s: Snake) => Some(s.end)
        case (l: Ladder) => Some(l.end)
        case _ => Some(steps)
      }
    }else if(steps < board.matrix.size)
      Some(steps)
    else None
  }
}