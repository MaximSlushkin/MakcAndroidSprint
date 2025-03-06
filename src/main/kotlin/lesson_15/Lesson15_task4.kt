package org.example.lesson_15

interface ToolSearch {
    fun searchAccessories()
}

open class AllMusicalTools(
    val name: String,
    val stock: Int,
)

class Instruments(name: String, stock: Int) : AllMusicalTools(name, stock), ToolSearch {
    override fun searchAccessories() {
        println("Выполняется поиск наличия инструмента: $name")
        println("Остаток на складе инструмента: $name - $stock шт.")
        println("Выполняется поиск комплектующих для инструмента: $name")
    }
}

class Accessory(name: String, stock: Int) : AllMusicalTools(name, stock) {
    fun searchAccessories() {
        println("Остаток на складе: $name - $stock шт.")
    }
}

fun main() {

    val guitar = Instruments("Гитара", 6)
    val stringSet = Accessory("Набор струн для гитары", 23)

    guitar.searchAccessories()
    stringSet.searchAccessories()
}