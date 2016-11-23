

http://docs.scala-lang.org/tutorials/tour/currying

```scala
object CurryTest extends App {
  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)
  def modN(n: Int)(x: Int) = ((x % n) == 0)
  val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
  println(filter(nums, modN(2)))
  println(filter(nums, modN(3)))
}
```



```scala
object Curry extends App {
  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) {
      println("else-if>" + xs.head + ",tail=" + xs.tail + ",p=" + p)
      xs.head :: filter(xs.tail, p)
    }
    else {
      println("else>" + xs.head + ",tail=" + xs.tail + ",p=" + p)
      filter(xs.tail, p)
    }
  def modN(n: Int)(x: Int) = {
      println("n=" + n + ",x=" + x + " || ")
      ((x % n) == 0)
    }
  val nums = List(1, 2, 3, 4, 5, 6)
 
  println(filter(nums, modN(2)))
  println(filter(nums, modN(3)))
}
```
If you run the all the print, you will see below.

```
n=2,x=1 || 
else>1,tail=List(2, 3, 4, 5, 6),p=<function1>
n=2,x=2 || 
else-if>2,tail=List(3, 4, 5, 6),p=<function1>
n=2,x=3 || 
else>3,tail=List(4, 5, 6),p=<function1>
n=2,x=4 || 
else-if>4,tail=List(5, 6),p=<function1>
n=2,x=5 || 
else>5,tail=List(6),p=<function1>
n=2,x=6 || 
else-if>6,tail=List(),p=<function1>
List(2, 4, 6)
n=3,x=1 || 
else>1,tail=List(2, 3, 4, 5, 6),p=<function1>
n=3,x=2 || 
else>2,tail=List(3, 4, 5, 6),p=<function1>
n=3,x=3 || 
else-if>3,tail=List(4, 5, 6),p=<function1>
n=3,x=4 || 
else>4,tail=List(5, 6),p=<function1>
n=3,x=5 || 
else>5,tail=List(6),p=<function1>
n=3,x=6 || 
else-if>6,tail=List(),p=<function1>
List(3, 6)

```


