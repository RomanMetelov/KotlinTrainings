fun main() {
    //given
    val listOfNumbers = listOf(1, 2, 3)

    //when
    val sum = listOfNumbers.reduce { a, b -> a + b }

}