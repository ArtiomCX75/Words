fun main() {
    /**
    hardcoded example
    todo add logic
    */
    var list = getWords()
    list = list.filter { !it.contains("п") }
        .filter { !it.contains("и") }
        .filter { !it.contains("р") }
        .filter { !it.contains("т") }
        .filter { !it.contains("б") }
        .filter { !it.contains("о") }
        .filter { !it.contains("г") }
        .filter { !it.contains("ч") }
        .filter { !it.contains("л") }
        .filter { !it.contains("е") }
        .filter { !it.contains("ж") }
        .filter { !it.contains("к") }
        .filter { !it.contains("в") }
        .filter { !it.contains("з") }
        .filter { !it.contains("х") }
        .filter { it.contains("м") }
        .filter { it.toCharArray()[3] == 'а' }

    list.onEach { println(it) }
    println(list.count())

}

