//другое задание http://prntscr.com/vvu3ij http://prntscr.com/vvu585 http://prntscr.com/vvu5qr
// //http://prntscr.com/vvu783
//http://prntscr.com/vvu8pa
//filter yce extension
// с нима надо быть осторожнее он возвращает новый список

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

//