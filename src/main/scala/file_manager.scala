import scala.collection.mutable.ListBuffer
import scala.io.Source

object file_manager {
  var commands: ListBuffer[String] = ListBuffer[String]()
  def read() {
    val bufferedSource = Source.fromFile("src/main/scala/input.txt")
    for (line <- bufferedSource.getLines) {
      perform_action(line.split(" "))
//      commands += line
    }

    for (line <- commands) {
      println(line)
    }
    bufferedSource.close
  }

  def create_poll_function(action: Array[String]): Unit = {
    val id = action(1)

  }

  def list_function(): Unit = {

  }


  def delete_poll_function(str: String): Unit = {

  }


  def start_poll_function(str: String): Unit = {

  }

  def stop_pol_function(str: String): Unit = {

  }

  def result_function(str: String): Unit = {

  }

  def perform_action(action : Array[String]): Unit = {
    val command = action(0).substring(1)
    println(command)
    command match {
      case "create_poll" => create_poll_function(action)
      case "list" => list_function()
      case "delete_poll" => delete_poll_function(action(1))
      case "start_poll" => start_poll_function(action(1))
      case "stop_poll" => stop_pol_function(action(1))
      case "result" => result_function(action(1))
      case _ => println("Unknown command")
    }
  }
}

