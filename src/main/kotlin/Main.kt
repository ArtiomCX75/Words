fun main() {
    val expected = getWords().random().lowercase()
    println("Start game")
    var counter = 1
    var tested = readln().lowercase()
    while (!checkWord(expected, tested)) {
        counter++
        tested = readln().lowercase()

    }
    println("Word: $expected")
    println("Attempts: $counter")
    println("End game")

}

fun checkWord(expected: String, tested: String): Boolean {
    if (!checkLine(tested)) return false
    val resultStr: StringBuilder = StringBuilder("*****")
    for (i in 0..4) {
        if (expected.contains(tested[i])) {
            resultStr[i] = tested[i].lowercaseChar()
            if (expected[i] == tested[i]) {
                resultStr[i] = tested[i].uppercaseChar()

            }
        }
    }
    println(resultStr.toString())
    return expected == tested
}

fun checkLine(str: String): Boolean {
    if (str.length != 5) {
        println("Length should be equal 5")
        return false
    }
    val isAbsent = getWords().firstOrNull { it.lowercase() == str }.isNullOrBlank()

    return if (isAbsent) {
        println("Word $str is absent")
        false
    } else {
        true
    }
}