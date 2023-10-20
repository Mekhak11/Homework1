import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    problem1()
    problem2()
    problem3()
    problem4()
    problem5()
    problem6()
    problem7()
    problem8()
    problem9()
    problem10()
}


fun problem1() {
    val arrayString = arrayOf("aca", "sacac", "acasc");
    for (i in arrayString) {
        println(i)
    }
    val listString = listOf<String>("sca","sakh","asc");
    for (i in listString) {
        println(i)
    }
}

fun problem2() {
    var str = "Hello"
    println(str)
    str += " world"
    println(str)
    str = str.substring(1,3)
    println(str)
    str = str.toUpperCase()
    println(str)
    str = str.toLowerCase()
    println(str)
}

fun problem3() {
    val myMap = mapOf(
        "name" to "Mekhak",
        "age" to 20,
        "surnme" to "Ghapantsyan"
    )

    for ((key, value) in myMap) {
        println("$key $value")
    }
}

fun problem4() {
    println( detectNumber(2))
    println(detectNumber(-2))
    println(detectNumber(0))
}

fun detectNumber(num: Int): String {
     if (num > 0) {
         return "positive"
    } else if (num < 0) {
         return  "negative"
    } else {
         return  "Zero"
    }
}

fun problem5() {
    print("Enter your name: ")
    val name = readLine()
    print("Enter your age: ")
    val ageString = readLine()
    val age = ageString?.toIntOrNull()

    if (age != null) {
        println("\nHello, $name!, You are $age years old")
    }
}

fun problem6() {
    println(checkDivision(8,4))
    println(checkDivision(1,0))
}

fun checkDivision(num1: Int, num2: Int): String {
     try {
        val result = num1 / num2
         return  "Result of $num1 / $num2 is: $result"
    } catch (e: ArithmeticException) {
         return "Error: Division by zero is not allowed."
    }
}

fun problem7() {
    val currentDateTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val formatedDate = currentDateTime.format(formatter)
    println(formatedDate)
}

fun  problem8() {
    val person = Person("Mekhak", 20)
    println("Person's name: ${person.name}")
    println("Person's age: ${person.age}")
}

fun problem9() {
    val person = Person("Mekhak", 20)
    println(person.getLifeStage())
}


class Person(val name: String, val age: Int)  {
    fun getLifeStage(): String {
        return when {
            age < 13 -> "Child"
            age in 13..17 -> "Teenager"
            age in 18..63 -> "Adult"
            else -> "Senior"
        }
    }
}

fun problem10() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)
}
