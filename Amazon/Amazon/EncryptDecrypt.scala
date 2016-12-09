package Amazon.Amazon

import scala.reflect.io.File
/*

There are multiple validations can be put like adding check if rows don't contain 2nd or 5th char, file does not exists etc.
I have not implemented them.
File input path is assumed. It can be taken as input.

 */
object EncryptDecrypt {
  val inputFile = File("/Users/pcm1468/PC/src/sample.csv")
  val encryptedFile = File("/Users/pcm1468/PC/src/sample.csv")
  val decryptedFile = File("/Users/pcm1468/PC/src/sample.csv")
  def main(args: Array[String]) {
    val reader = File(inputFile).bufferedReader()
    var line = reader.readLine()
    while(line != null) {
      println(getEncryptedString(line, encryption))
      println(getEncryptedString(line, decryption))
      line = reader.readLine()
    }
  }
  private def getEncryptedString(str:String, fn:(String => String)):String ={
    str.split(",").toList match{
      case first::second::third::forth::fifth::rest => str.replace(second,fn(second)).replace(fifth,fn(fifth))
      case _ => ""
    }
  }
  private def encryption(input:String): String ={
    input.reverse
  }
  private def decryption(input:String): String ={
    input.reverse
  }
}
