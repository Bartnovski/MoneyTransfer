const val COMMISSION = 0.0075

fun main() {
    val amount = 100_00U
    val result : Double = COMMISSION * amount.toDouble()
    print("Комиссия составит: ")
    println(if (result.toUInt() < 35_00U) "3500коп." else "${result.toUInt()}коп.")
}