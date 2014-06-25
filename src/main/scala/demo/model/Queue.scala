package demo.model

object Queue {
  val queue = new scala.collection.mutable.Queue[String]

  def enqueue(elems: String*) {
    queue.enqueue(elems: _*)
  }

  def dequeue = {
    if (queue.isEmpty) None else queue.dequeue()
  }

  def clear() {
    queue.clear()
  }

  def size = queue.size

  override def toString = queue.mkString("<br>")
}