object week2 {
  println("Welcome to the Scala worksheet")
  
  
  def from(n: Int): Stream[Int] = n #:: from(n + 1)
  
  val nats = from(1)
  val m4s = from(1).map(_ * 4)
  
  m4s.take(5)


  
}