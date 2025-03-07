package org.example.lesson_15

interface Swimming {
    fun swim()
}

interface Flight {
    fun fly()
}

class CrucianCarp : Swimming {
    override fun swim() {
        println("Карась плавает в реке")
    }
}

class Seagull : Flight, Swimming {

    override fun fly() {
        println("Чайка летает в небе")
    }


    override fun swim() {
        println("Чайка держится на поверхности воды")
    }
}


class Duck : Swimming, Flight {
    override fun swim() {
        println("Утка плавает в озере")
    }

    override fun fly() {
        println("Утка взмывает в небо")
    }
}

fun main() {
    val crucianCarp = CrucianCarp()
    val seagull = Seagull()
    val duck = Duck()

    crucianCarp.swim()
    seagull.swim()
    seagull.fly()
    duck.swim()
    duck.fly()
}