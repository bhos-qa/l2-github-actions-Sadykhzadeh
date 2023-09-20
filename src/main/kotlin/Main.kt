class Calculator(val a: Int, val b: Int){
  fun add(): Int {
    return this.a + this.b
  }

  fun subtract(): Int {
    return this.a - this.b
  }

  fun multiply(): Int {
    return this.a * this.b
  }

  fun divide(): Int {
    if(this.b == 0) {
      throw IllegalArgumentException("Cannot divide by zero")
    }
    return this.a / this.b
  }
}


fun main(args: Array<String>) {
  println("Please, run the tests")
}