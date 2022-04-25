import scala.math.BigDecimal.double2bigDecimal

val arr = (0d to 100.049d by 0.001d).toArray
var p: List[BigDecimal] = List()
for(i<- arr) p = p :+ i
// p.foreach(println)
val sliding_window = p.sliding(50,50)
sliding_window.foreach(println)