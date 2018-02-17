import scala.collection.mutable.ListBuffer
import scala.io.Source

object file_manager {
  var commands: ListBuffer[String] = ListBuffer[String]()
  def read() {
    val bufferedSource = Source.fromFile("src/main/scala/input.txt")
    for (line <- bufferedSource.getLines) {
      // perform_action(line)
      commands += line
    }

    for (line <- commands) {
      println(line)
    }
    bufferedSource.close
  }
}
