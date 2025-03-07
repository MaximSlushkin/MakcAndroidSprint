package org.example.lesson_16

class Order(private val orderNumber: String) {

    private var status: String = "В обработке"

    fun sendStatusRequest(newStatus: String) {
        println("Отправлена заявка менеджеру на изменение статуса заказа $orderNumber на статус: $newStatus")
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа $orderNumber изменен. Текущий статус: $status.")
    }

    fun getOrderNumber(): String {
        return orderNumber
    }

    fun getStatus(): String {
        return status
    }
}

fun main() {

    val order = Order("768905544")

    println("Номер заказа: ${order.getOrderNumber()} \nТекущий статус: ${order.getStatus()}")

    order.sendStatusRequest("Готов к выдаче")

    order.sendStatusRequest("Выдан")
}