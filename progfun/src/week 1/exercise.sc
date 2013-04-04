/**
 * Created with IntelliJ IDEA.
 * User: Damian
 * Date: 02.04.13
 * Time: 13:32
 * To change this template use File | Settings | File Templates.
 */
object exercise {
  def factorial(n: Int): Int = {
      def loop(acc : Int, n : Int) : Int = {
        if (n==0) acc else loop(acc*n, n-1)
      }
    loop(1, n);

  }
  factorial(4)
}