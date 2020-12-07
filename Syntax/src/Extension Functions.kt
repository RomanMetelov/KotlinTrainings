import java.util.concurrent.ThreadLocalRandom
import kotlin.test.assertTrue

fun <T> List<T>.random(): T? {
    if (this.isEmpty()) return null
    return get(ThreadLocalRandom.current().nextInt(count()))//разобрать эту конструкцию
}

fun <T> getRandomElementOfList(list: List<T>): T? {
    return list.random()
}

val elements = listOf("a", "b", "c", "d", "e", "f")

val result = getRandomElementOfList(elements)

fun main() {
    assertTrue(elements.contains(result))
    println(elements.contains(result))
    println(elements.random())
    println(elements.random())
    println(getRandomElementOfList(elements))
    println(getRandomElementOfList(elements))
    print(getRandomElementOfList(elements))

}
