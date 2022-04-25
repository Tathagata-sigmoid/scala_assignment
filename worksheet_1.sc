
val l = List(
  (2021, "Sam", "India", 23, 2300, 3),
  (2021, "Ram", "India", 23, 300, 30),
  (2021, "Mano", "India", 23, 300, 13),
  (2020,	"Samir",	"India",	25,	1840,	28),
(2007,	"Sachin"	,"India",	25	,2450	,32),
(2005,	"Rahul",	"India",	25,	1843,	20),
(2016,	"Sourav",	"India",	29,	297,	22),
(2009,	"Virat",	"India",	23,	1789,	42),
(2019	,"Ram",	"India",	27	,2608	,11),
(2001,	"Chahal",	"India",	23,	2757	,46),
(2019	,"Jasprit",	"India",	30,	1957,	44),
(2001	,"Manoj",	"India",	27,	2990,	37)
)

l.foreach(println)

val max_run_scorer = l.maxBy(_._5)
println("Details of player with highest run scored")
println(max_run_scorer)
println("Details of top 5 players by run scored")
l.sortBy(_._5)(Ordering[Int].reverse).take(5).foreach(println)
println("Details of top 5 players by wicket taken")
l.sortBy(_._6)(Ordering[Int].reverse).take(5).foreach(println)
