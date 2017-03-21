/**
  * Created by pei20063 on 9-7-2016.
  */
object ScalaApp extends App {
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
  }
  println(matchTest(10))
}
