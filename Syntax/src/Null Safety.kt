import java.util.*

class ItemService(itemId: String, s: String) {
    fun findItemNameForId(id: String): ItemService? {
        val itemId = UUID.randomUUID().toString()
        return ItemService(itemId, "name-$itemId");
    }
}



fun main() {
    /*val id = "item__id"
    val itemService = ItemService()

    val result = itemService.findItemNameForId(id)

    assertNotNull(result?.let { it -> it.id })
    assertNotNull(result!!.id)*/
}