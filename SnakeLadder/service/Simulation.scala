package SnakeLadder.service

import SnakeLadder.domain._


object Simulation {

  def main(args: Array[String]) {

    val s1 = Snake(4)
    val l1 = Ladder(9)
    val l2 = Ladder(8)
    val blankStep = BlankStep()

    val matrix: Array[Step] = Array(blankStep, l2, l1, blankStep, blankStep, blankStep, s1, blankStep, blankStep)

    val gamePlay = new BasicGamePlay()

    val board = Board(matrix, gamePlay)

    val player1 = new Player(1)

    player1.play(board)
  }

}
