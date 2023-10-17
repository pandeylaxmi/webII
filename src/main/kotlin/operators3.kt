fun main() {
    val a = 4
    val b = 7

    println(a == b) // false
    println(a != b) // true

    val d1 = Dog(1, "A")
    val d2 = Dog(1, "A")

    println(d1 == d2) // requires Dog to have "equals" function to work properly
}
