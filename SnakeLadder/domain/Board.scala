package SnakeLadder.domain

import SnakeLadder.service.GamePlay

case class Board(matrix: Array[Step], gamePlay: GamePlay){
  def move(step: Int) = {
    gamePlay.move(this, step)
  }
}
