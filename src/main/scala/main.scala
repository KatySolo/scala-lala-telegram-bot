object main {
  def main(args: Array[String]): Unit = {
    file_manager.read().foreach(el => command_parser.perform_action(el))

  }
}
