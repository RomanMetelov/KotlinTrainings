//просто конспектирую код, без смысла

//определение функцию sum типа Int с двумя параметрами типа Int, которая возвращает сумму
fun sum(a: Int, b:int): Int {
    return a + b
}

//опеределение локальных переменных
val a: Int = 1
val b = 1
val c: Int
c = 1

var x = 5
x += 1

//необязательные поля
val email: String?
val email2: String? = null
val email3: String? = ""

//классы
class ItemManager(val categoryId: String, val dbConnection: String) {
    var email = ""
    //...
}

var manager: ItemManager = ItemManager("cat_id", "db://connection")

//наследование
open class Item(val id: String, val name: String = "unknown__name") {
    open fun getIdOfItem(): String {
        return id
    }
}

class ItemWithCategory(id: String, name: String, val categoryId: String: String) : Item(id, name) {
    override fun getIdOfItem(): String {
        return id + name
    }
}

//условия
val number = 2
if (number < 10) {
    println("number is less than 10")
} else if (number > 10) {
    println("number is greater than 10")
}

//when
val name = "John"
when(name) {
    "John" -> println("Hi man")
    "Alice" -> println("Hi lady")
}

//коллекции
val items = listOf(1, 2, 3)
var rwist = mutableListOf(1, 2, 3)

//исключения

