package Amazon

import scala.reflect.io.{Directory, File}
/*
Have not written converter logic. Want to know in more depth of the transformation requirements.
 */
object HtmlReader {
  val basicHtmlTypes = List("html","htm","jsp")
  def main(args: Array[String]) {
    val (folderPath, htmlTypes) = args.toList match{
      case folderPath::Nil => (folderPath, basicHtmlTypes)
      case folderPath :: htmlType => (folderPath,htmlType)
      case _ => throw new RuntimeException("Provide input directory to scan")
    }
    println(getFilesByType(folderPath,htmlTypes))
  }
  private def getFilesByType(folderPath:String, htmlTypes:List[String]): List[File] ={
    if (Directory(folderPath).isDirectory)
      Directory(folderPath).files.filter(x => htmlTypes.foldLeft(false)((acc, type1) => acc || x.name.endsWith(type1))).toList
    else List.empty
  }
}
