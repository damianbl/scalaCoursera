object Session {
  def listLength(list: List[_]): Int =
    if (list == Nil) 0
    else 1 + listLength(list.tail)

  def abs(x: Double) = if (x < 0) -x else x
}