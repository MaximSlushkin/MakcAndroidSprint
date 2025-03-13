package org.example.lesson_19

enum class ProductCategory(val displayName: String) {
    CLOTHES("Одежда"),
    OFFICE_SUPPLIES("Канцелярские товары"),
    DIFFERENTS("Разное");

    fun getCategoryName(): String {
        return displayName
    }
}

data class Product(val id: Int, val name: String, val category: ProductCategory) {

    fun displayInfo() {
        println("ID: $id, Название: $name, Категория: ${category.getCategoryName()}")
    }
}

fun main() {

    val product1 = Product(1, "Футболка", ProductCategory.CLOTHES)
    val product2 = Product(2, "Тетрадь", ProductCategory.OFFICE_SUPPLIES)
    val product3 = Product(3, "Кружка", ProductCategory.DIFFERENTS)

    product1.displayInfo()
    product2.displayInfo()
    product3.displayInfo()
}