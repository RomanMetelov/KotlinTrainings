/*

создание простого листа

*/


/*fun main() {
    val strings = listOf<String>("one", "two", "three")

    //это два идентичных записа, просто перегрузка оператора
    strings.get(2)
    strings[2]
}*/

//створити класс пёрсон, створити список пёрсон, если возраст больше или манешье 5 - вывести
//*******************************************************************


fun main() {
    val person1 = Person("name1", 5)
    val person2 = Person("name2", 10)
    val person3 = Person("name3", 15)
    val person4 = Person("name4", 2)
    val person5 = Person("name5", 3)

    val personList = listOf<Person>(person1, person2, person3, person4, person5)
    personList.forEach() {
        if (it.age < 5) println(it.name)
    }
}

data class Person( val name: String, val age: Int)


