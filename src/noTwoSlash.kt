import java.util.*

fun noTwoSlash(url: String): String {
    val newList = mutableListOf<Char>()
    if (url.isNotEmpty()) {
        newList.add(url[0])
        var i = 1
        while (i < url.length) {
            if (!(url[i - 1] == '/' && url[i] == '/')) newList.add(url[i])
            i++
        }
    }
    return "" + newList.joinToString(separator = "")
}

fun main() {
    println(noTwoSlash("//page1///page2////page3/test.html"))
    println(noTwoSlash("///////page1///page2////page3/test./as////"))
    println(noTwoSlash("///"))
    println(noTwoSlash(""))
    println(noTwoSlash("a"))
    println(noTwoSlash("a/b/c"))
    println(noTwoSlash(""))

}