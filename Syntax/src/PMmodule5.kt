
/*
object Factory1
//обджект не мае ниякых полив, живе всю программу

class Factory() {
    companion object {
        fun getInstance() = Factory
    }
}

fun main() {
    val factory2Instance = Factory.getInstance()
}

*/
/*
class Factory private constructor(s: String, int1: Int) {
    private var string: String = s
    private var int: Int = int1

    override fun toString(): String {
        return string + int
    }

    companion object {
        fun getInstance(s: String, int: Int): Factory {
            return Factory(s, int)
        }
    }
}
*/
//http://prntscr.com/vxky12 покращення
//http://prntscr.com/vxl0yh
//http://prntscr.com/vxl2yt

class Factory private constructor(stringFromConstructor: String, int1: Int) {
    private var string: String = stringFromConstructor
    private var int: Int = int1

    fun update(s: String) {
        string = s
    }

    override fun toString(): String {
        return string
    }

    companion object {
        private var a: Factory? = null
        fun getInstance(): Factory {
            a?.let {
                return it
            }
            a = Factory("str", 6)
            return a as Factory
            //return a ?: Factory("str, 6)
        }
    }
}