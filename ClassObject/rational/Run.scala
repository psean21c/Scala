object Run {
  def main(args: Array[String]) {
    var i = 1
    var x = new Rational(0, 1)
    while (i <= 10) {
      x += new Rational(1, i)
      i += 1
    }
    println( x.numer + "/" + x.denom)
  }
}
