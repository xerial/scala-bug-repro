class MyIterator extends Iterator[Int] {
   private var i = 0
   def hasNext: Boolean = {
      val flag = i < 2
      i += 1
      flag
   }
   def next:Int = i
}

object Example {
  def main(args:Array[String]): Unit = {
    val s = new MyIterator().toIndexedSeq
    println(s.mkString(", ")) // Expected 1,2, but 2.13.0-pre-59975bb produces 2 
  }
}
