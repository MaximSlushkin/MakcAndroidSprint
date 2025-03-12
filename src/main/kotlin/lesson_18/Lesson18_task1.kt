package org.example.lesson_18

class Order(private val orderNumber: Int) {

    fun displayOrderInfo(item: String) {
        println("Заказан товар: $item (Номер заказа: $orderNumber)")
    }

    fun displayOrderInfo(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")} (Номер заказа: ${orderNumber + 1})")
    }
}

fun main() {

    val order1 = Order(1)

    order1.displayOrderInfo("Книга")

    val items = listOf("Книга", "Ручка", "Блокнот")
    order1.displayOrderInfo(items)
}