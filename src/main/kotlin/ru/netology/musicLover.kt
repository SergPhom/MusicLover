package ru.netology

fun musicLoverDiscount(amount: Double, previousAmount: Double,
                       isRegularCustomer: Boolean): Double{
    val firstDiscount = if(previousAmount > 1001.00 && previousAmount < 10000.0){
        amount - 100.00
    }else if(previousAmount > 10001.00){
        amount - (0.05 * amount)
    }else{
        amount
    }
    val finalAmount = if(isRegularCustomer){
        firstDiscount - (firstDiscount * 0.01)
    }else{
        firstDiscount
    }

    return finalAmount
}
fun main() {
    println(String.format("Покупка - 1200.50 руб, после применения скидки - %.2f ",
        musicLoverDiscount(1200.50, 12000.50, true)))
    println(String.format("Покупка - 200.00 руб, после применения скидки - %.2f ",
        musicLoverDiscount(200.00, 7501.60, false)))
}