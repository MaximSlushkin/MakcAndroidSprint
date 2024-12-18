package lesson_2

fun main () {

    val permanentEmployees = 50
    val salaryOfPermanent = 30000

    val interns = 20
    val salaryOfInterns = 20000

    val expensePermanent = permanentEmployees * salaryOfPermanent
    val generalExpenses = (permanentEmployees * salaryOfPermanent) + (interns * salaryOfInterns)
    val totalEmployees = permanentEmployees + interns
    val averageSalary = generalExpenses / totalEmployees

    println(expensePermanent)
    println(generalExpenses)
    println(averageSalary)
}