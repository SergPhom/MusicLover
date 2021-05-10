package ru.netology

fun musicLoverDiscount(
    amount: Double, previousAmount: Double,
    isRegularCustomer: Boolean
): Double {
    val firstDiscount = when (previousAmount) {
        in 0.0..1000.99 -> amount
        in 1001.0..10000.0 -> amount - 100.00
        else -> (amount - (0.05 * amount))
    }

    return if (isRegularCustomer) {
        firstDiscount - (firstDiscount * 0.01)
    } else {
        firstDiscount
    }
}
fun main() {
    val purchaseAmount = 1200.50
    val previousAmount = 12000.50
    val regularity = true
    val discount = musicLoverDiscount(purchaseAmount, previousAmount, regularity)
    val output = String.format("Покупка - $purchaseAmount руб.," +
            " после применения скидки - %.2f руб.", discount)
    println(output)
}