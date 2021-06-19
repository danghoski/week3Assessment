fun main () {
    println("Enter a Word:")
    val str = readLine()

    var result : String = ""
    var lastIndex = str!!.lastIndex

    while (lastIndex >= 0) {
        result += str[lastIndex]
        lastIndex --
    }
    println("Revered: $result")
}