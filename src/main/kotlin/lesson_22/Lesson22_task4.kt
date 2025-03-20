package org.example.lesson_22

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
)

class MainScreenViewModel {
    private var _mainScreenState = MainScreenState()
    val mainScreenState: MainScreenState get() = _mainScreenState

    fun loadData() {

        printCurrentState()

        _mainScreenState = _mainScreenState.copy(isLoading = true)
        printCurrentState()

        Thread.sleep(3000)

        val loadedData = "Данные загружены"
        _mainScreenState = _mainScreenState.copy(data = loadedData, isLoading = false)

        printCurrentState()
    }

    private fun printCurrentState() {
        println("Текущее состояние: isLoading=${_mainScreenState.isLoading}, data=${_mainScreenState.data ?: "Нет данных"}")
    }
}

fun main() {

    val viewModel = MainScreenViewModel()

    viewModel.loadData()
}