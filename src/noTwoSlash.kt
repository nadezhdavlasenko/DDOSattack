import java.util.*

fun noTwoSlash(url: String): String {
    val list = url.toList()
    val newList = mutableListOf(list[0])
    var i = 1
    while (i < list.size) {
        if (!(list[i - 1] == '/' && list[i] == '/')) newList.add(list[i])
        i++
    }
    return newList.joinToString(separator = "")
}

fun main() {
    print(noTwoSlash("//page1///page2////page3/test.html"))
}