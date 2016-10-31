object Run {
  	def main(args: Array[String]) {
  	  val  e:EmptySet = new EmptySet();
  	  println(e.contains(1));
  	  println();
  	  
  	  val n1:NonEmptySet = new NonEmptySet(1,e,e);
  	  println(n1.contains(1));
  	  println(n1.contains(2));
  	  println();
  	  
  	  val n2:NonEmptySet = new NonEmptySet(2,n1,n1);
  	  println(n2.contains(1));
  	  println(n2.contains(2));
  	  println(n2.contains(3));
  	  println();
  	  
  	  val n3:NonEmptySet = new NonEmptySet(3,n1,n2);
  	  println(n3.contains(3));
  	  
  	}
}
