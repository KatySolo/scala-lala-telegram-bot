import scala.collection.mutable.ListBuffer
import scala.io.Source


object file_manager {
//  var commands: ListBuffer[String] = ListBuffer[String]()
  def read(): Iterator[String] = {
    Source.fromFile("src/main/scala/input.txt").getLines
  }
}

