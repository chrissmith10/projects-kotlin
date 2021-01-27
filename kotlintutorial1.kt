// tutorial from youtube -> Kotlin Crash Course

package com.example.todolist1

/////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////
fun main() {
    println("Hello World")
    var x: Int = 3
    println("The value of x is $x")
    x = 4
    println("The value of x is now $x")
    val x = 5L // L for long
    println("The value of x is $x")
    val x = 3.33f
    println("The value of x is $x")
    val wholeNumber = 6
    println(wholeNumber)
    val bigNumber = 3L
    println(bigNumber)
    val preciseDecimal = 7.77
    println(preciseDecimal)
    val decimal = 8.1
    println(decimal)
    val iLoveVegetables = false
    println(iLoveVegetables)
    val iLovePizza = true
    println(iLovePizza)
    val iAmALetter = 'a'
    println(iAmALetter)

    // Arithmetic Operators
    val x = 3 * 4
    println("The value of x is $x") // can use + -
    val x = 7f / 6f
    println("The value of x is $x") // f so a float can print out
    val x = 10 % 2
    println("The value of x is $x") // does 10 / 2 and saves the remainder in x

    // Logical & Comparison Operators
    val amIAnAdult = true
    val amIAProgrammer = true
    val amIAnAdultProgrammer = amIAnAdult && amIAProgrammer // also ||  ==  !=  !
    println(amIAnAdultProgrammer)

    // Strings
    val string_1 = "Kotlin is the best programming language"
    println(string_1) // try .toUpperCase()

    // If Conditions
    val x = 1 + 2
    if (x == 2) {
        println("x is 2")
    } else if (x == 3) {
        println("x is 3")
    } else {
        println("x is not 2 or 3")
    }
    val y = if (x == 2) 2 else 3

    // Null values
    val x: Int? = null
    val userInput = readLine()
    val number1 = readLine() ?: "0"
    val number2 = readLine() ?: "0"
    val result = number1.toInt() + number2.toInt()
    println(result)

    // Lists
    val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex")
    println(shoppingList[0])
    val shopList = mutableListOf("Apples", "Chicken", "Kale")
    shopList.add("Snicker Doodles")
    println(shopList)

    // While-Loop
    var counter = 0
    while (counter < shoppingList.size) {
        println(shoppingList[counter])
        counter++
    }

    // For-Loop
    for (shoppingItem in shoppingList) {
        println(shoppingItem)
    }

    for (i in 1..100) {
        println(i)
    }

    // When-Expression
    val x = 3
    when (x) {
        in 1..2 -> println("x is between 1 and 2")
        in 3..10 -> println("x is between 3 and 10")
        else -> {
            println("x is not in the range of 1 to 10")
        }
    }

    // Functions -- see code after main()
    print10Numbers()
    val x = isEven(number = 5)
    println(x)

    val y = 3
    println(y.isOdd())

    // Classes,Inheritance, Abstract Classes
    val dog = Animal(name: "Dog")
    val dog = Dog()
    dog.bark()
    val cat = Cat()
    cat.meow()

    // Anonymous CLasses
    val bear = object : Animal(name: "Black bear") {
        override fun makeSound() {
            println("Roar!!!")
        }
    }

    // Try & Catch or Exceptions
    val number = readLine() ?: "0"
    val parsedNumber = try {
        number.toInt()
    } catch(e: Exception) {
        0
    }
    println(parsedNumber)

    // Lambda Functions -- see code after main()
    val list = listOf("Kotlin", "is", "fun")
    val count = list.customCount { currentString ->
        currentString.length >= 3
    }
    println(count)


}
//////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////

    // Functions
fun print10Numbers() {
    for(i in 1..10) {
        println(i)
    }
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun Int.isOdd(): Boolean {
    return this % 2 == 1
}


    // Lambda Functions
fun <T> List<T>.customCount(function: (T) -> Boolean): Int { // T allows for any 'type', could be Int, String
    var counter = 0
    for(string in this) {
        if(function(string)) {
            counter++
        }
    }
    return counter

}