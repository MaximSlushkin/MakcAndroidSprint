package org.example.lesson_18

open class Order(val orderNumber: Int) {
    open fun displayOrderInfo() {
        println("Информация о заказе: номер $orderNumber.")
    }
}

class SingleItemOrder(orderNumber: Int, private val item: String) : Order(orderNumber) {
    override fun displayOrderInfo() {
        println("Заказан товар: $item (номер заказа: $orderNumber)")
    }
}

class MultipleItemsOrder(orderNumber: Int, private val items: List<String>) : Order(orderNumber) {
    override fun displayOrderInfo() {
        println("Заказаны следующие товары: ${items.joinToString(", ")} (номер заказа: $orderNumber)")
    }
}

fun main() {

    val singleItemOrder = SingleItemOrder(1, "Книга")

    val multipleItemsOrder = MultipleItemsOrder(2, listOf("Книга", "Ручка", "Блокнот"))

    singleItemOrder.displayOrderInfo()
    multipleItemsOrder.displayOrderInfo()
}