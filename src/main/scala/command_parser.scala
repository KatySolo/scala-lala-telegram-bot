import java.util.Date

object command_parser {
  var index = 0

  case class Poll(name: String, anonymous: Boolean, is_afterstop: Boolean, start: Date, end: Date, id: Int)

  def create_poll_function(action: Array[String]): Unit = {
    lazy val name = action(1)
    val new_poll = Poll(action(1), action(2).toBoolean, action(3).toBoolean, new Date(action(4)), new Date(action(5)), get_id())
    // TODO: узнать колличество параметров и обрабатывать
    // TODO: сплитить многострочные команды ы
    print(new_poll.start)
  }

  def get_id(): Int = {
    index += 1
    index
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

  def perform_action(action: String): Unit = {
    val commands = action.split("/")
    val command = commands(0)
    println(command)
    command match {
      case "/create_poll" => create_poll_function(commands)
      case "/list" => list_function()
      case "/delete_poll" => delete_poll_function(commands(1))
      case "/start_poll" => start_poll_function(commands(1))
      case "/stop_poll" => stop_pol_function(commands(1))
      case "/result" => result_function(commands(1))
      case _ => println("Unknown command")
    }
  }

}
