package RubickCube

import scala.collection.mutable.Queue
import scala.util.control.Breaks

class Logic {
  def main(args: Array[String]) {
    val inputArray = new Array[Character](54)
    for (j <- 0 to 53) {
      print(j + " : "); inputArray(j) = Console.readChar()
    }
    val input: RubickCube = new RubickCube(
      inputArray(0),
      inputArray(1),
      inputArray(2),
      inputArray(3),
      inputArray(4),
      inputArray(5),
      inputArray(6),
      inputArray(7),
      inputArray(8),
      inputArray(9),
      inputArray(10),
      inputArray(11),
      inputArray(12),
      inputArray(13),
      inputArray(14),
      inputArray(15),
      inputArray(16),
      inputArray(17),
      inputArray(18),
      inputArray(19),
      inputArray(20),
      inputArray(21),
      inputArray(22),
      inputArray(23),
      inputArray(24),
      inputArray(25),
      inputArray(26),
      inputArray(27),
      inputArray(28),
      inputArray(29),
      inputArray(30),
      inputArray(31),
      inputArray(32),
      inputArray(33),
      inputArray(34),
      inputArray(35),
      inputArray(36),
      inputArray(37),
      inputArray(38),
      inputArray(39),
      inputArray(40),
      inputArray(41),
      inputArray(42),
      inputArray(43),
      inputArray(44),
      inputArray(45),
      inputArray(46),
      inputArray(47),
      inputArray(48),
      inputArray(49),
      inputArray(50),
      inputArray(51),
      inputArray(52),
      inputArray(53)
    )
  }

  def main1(input: RubickCube): String = {


    val q = new Queue[TreeNode1]()
    var tempNode = new TreeNode1
    tempNode.head = null
    tempNode.value = input
    tempNode.instruction = "You did it!"
    q.enqueue(tempNode)


    var i = 0;
    val loop = new Breaks;

    if (isResult(input, tempNode,"This is already solved. Don't believe below statement")) {
      return "Result found";
    }

    loop.breakable {
      while (i <= q.length) {
        val currNode = q.get(i).get
        val curr = currNode.value

        var x = curr.LeftUp()
        if (isResult(x, currNode, "Left up")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Left up"
          q.enqueue(tempNode)
        }



        x = curr.LeftDown()
        if (isResult(x, currNode, "Left down")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Left down"
          q.enqueue(tempNode)
        }


        x = curr.RightUp()
        if (isResult(x, currNode,"Right up")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Right up"
          q.enqueue(tempNode)
        }

        x = curr.RightDown()
        if (isResult(x, currNode,"Right down")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Right Down"
          q.enqueue(tempNode)
        }

        x = curr.TopLeft()
        if (isResult(x, currNode,"Top left")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Top Left"
          q.enqueue(tempNode)
        }

        x = curr.TopRight()
        if (isResult(x, currNode,"TOP right")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Top Right"
          q.enqueue(tempNode)
        }

        x = curr.BottomLeft()
        if (isResult(x, currNode,"bottom left")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Bottom left"
          q.enqueue(tempNode)
        }

        x = curr.BottomAntiClockwiseRight()
        if (isResult(x, currNode,"bottom right")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Bottom right"
          q.enqueue(tempNode)
        }

        x = curr.FaceLeftDown()
        if (isResult(x, currNode,"face left down")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Face left down"
          q.enqueue(tempNode)
        }

        x = curr.FaceRightDown()
        if (isResult(x, currNode,"face right down")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Face right down"
          q.enqueue(tempNode)
        }

        x = curr.BackLeftDown()
        if (isResult(x, currNode,"Back left down")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Back left down"
          q.enqueue(tempNode)
        }

        x = curr.BackAntiClockwise()
        if (isResult(x, currNode,"Back Right down")) {
          loop.break;
          return "Result found";
        }
        if (!isNodePresent(x)) {
          tempNode = new TreeNode1
          tempNode.head = currNode
          tempNode.value = x
          tempNode.instruction = "Back Right down"
          q.enqueue(tempNode)
        }
        println(q.length)
        i += 1

      }
    }
    def isResult(x: RubickCube, node2: TreeNode1, msg:String): Boolean = {
      if ((x._1 == x._2 && x._2 == x._3 && x._3 == x._4 && x._4 == x._5 && x._5 == x._6 && x._6 == x._7 && x._7 == x._8 && x._8 == x._9) &&
        (x._10 == x._11 && x._11 == x._12 && x._12 == x._13 && x._13 == x._14 && x._14 == x._15 && x._15 == x._16 && x._16 == x._17 && x._17 == x._18) &&
        (x._19 == x._20 && x._20 == x._21 && x._21 == x._22 && x._22 == x._23 && x._23 == x._24 && x._24 == x._25 && x._25 == x._26 && x._26 == x._27) &&
        (x._28 == x._29 && x._29 == x._30 && x._30 == x._31 && x._31 == x._32 && x._32 == x._33 && x._33 == x._34 && x._34 == x._35 && x._35 == x._36) &&
        (x._37 == x._38 && x._38 == x._39 && x._39 == x._40 && x._40 == x._41 && x._41 == x._42 && x._42 == x._43 && x._43 == x._44 && x._44 == x._45) &&
        (x._46 == x._47 && x._47 == x._48 && x._48 == x._49 && x._49 == x._50 && x._50 == x._51 && x._51 == x._52 && x._52 == x._53 && x._53 == x._54)
      ) {

        println("Result found")
        println("Instructions are: ")
        var node1 = node2
        println(msg)
        while (node1.head != null) {
          println(node1.instruction)
          node1 = node1.head
        }
        println(node1.instruction)
        return true
      }
      return false
    }

    def isNodePresent(x: RubickCube): Boolean = {
      /*for (k <- 0 to q.length - 1) {
        if (q.get(k).get.value == x)
          return true
      }*/
      false
    }

    return "Not found"
  }

}

class TreeNode1() {
  var value: RubickCube = null
  var head: TreeNode1 = null
  var instruction: String = ""
}
