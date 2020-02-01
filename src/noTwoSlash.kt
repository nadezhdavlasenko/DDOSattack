import java.util.*

fun noTwoSlash(url: String): String {
    val list = LinkedList(url.toList())
    var i = 1
    while (i < list.size) {
        if (list[i - 1] == '/' && list[i] == '/') {
            list.removeAt(i)
        } else i++
    }
    return list.joinToString(separator = "")
}

fun main() {
    print(noTwoSlash("/page1///page2////page3/test.html"))
}