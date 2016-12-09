package RubickCube

object LogicTest {
  def main(args: Array[String]) {
    val input: RubickCube = new RubickCube(
      'r', 'r', 'r',
      'r', 'r', 'r',
      'r', 'r', 'r',

      'g', 'g', 'g',
      'g', 'g', 'g',
      'g', 'g', 'g',

      'o', 'o', 'o',
      'o', 'o', 'o',
      'o', 'o', 'o',

      'y', 'y', 'y',
      'y', 'y', 'y',
      'y', 'y', 'y',

      'w', 'w', 'w',
      'w', 'w', 'w',
      'w', 'w', 'w',

      'b', 'b', 'b',
      'b', 'b', 'b',
      'b', 'b', 'b'
    )
   //  assert((new Logic).main1(input)=="Result found")


    val input2: RubickCube = new RubickCube(
      'b', 'r', 'r',
      'b', 'r', 'r',
      'b', 'r', 'r',

      'g', 'g', 'g',
      'g', 'g', 'g',
      'g', 'g', 'g',

      'o', 'o', 'w',
      'o', 'o', 'w',
      'o', 'o', 'w',

      'y', 'y', 'y',
      'y', 'y', 'y',
      'y', 'y', 'y',

      'r', 'w', 'w',
      'r', 'w', 'w',
      'r', 'w', 'w',

      'o', 'b', 'b',
      'o', 'b', 'b',
      'o', 'b', 'b'
    )
   // (new Logic).main1(input2)

    val input3: RubickCube = new RubickCube(
      'b', 'r', 'r',
      'b', 'r', 'r',
      'b', 'r', 'r',

      'g', 'g', 'b',
      'g', 'g', 'b',
      'g', 'g', 'o',

      'o', 'o', 'o',
      'o', 'o', 'o',
      'w', 'w', 'w',

      'w', 'y', 'y',
      'w', 'y', 'y',
      'r', 'y', 'y',

      'r', 'w', 'w',
      'r', 'w', 'w',
      'g', 'g', 'g',

      'o', 'b', 'b',
      'o', 'b', 'b',
      'y', 'y', 'y'
    )
  //  (new Logic).main1(input3)

    val input4: RubickCube = new RubickCube(
      'b', 'r', 'g',
      'r', 'o', 'g',
      'b', 'b', 'o',

      'r', 'o', 'y',
      'y', 'b', 'g',
      'g', 'y', 'y',

      'b', 'b', 'o',
      'o', 'r', 'r',
      'b', 'b', 'g',

      'g', 'g', 'r',
      'g', 'g', 'y',
      'r', 'y', 'o',

      'w', 'w', 'w',
      'w', 'y', 'w',
      'w', 'w', 'r',

      'w', 'r', 'y',
      'b', 'y', 'o',
      'y', 'o', 'o'
    )
    (new Logic).main1(input4)
  }
}