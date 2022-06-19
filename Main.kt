import kotlin.collections.ArrayList

fun main()

{

    val currentArray = intArrayOf(1,3,4,5,7,8,3,2).toList()
    currentArray.filter {x -> calculateFibonacciNumbers(currentArray.maxOrNull()!!).contains(x) }.forEach{(println(it))}

}


fun calculateFibonacciNumbers(term: Int): List<Int> {

    var resultOfList = ArrayList<Int>()
    var firstNumber = 0
    var secondNumber = 1

    for (i in 1..term) {
        val sum = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = sum
        resultOfList.add(firstNumber)
    }
    return resultOfList
}