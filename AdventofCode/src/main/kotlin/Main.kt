import java.io.File

fun main(args: Array<String>) {

    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}    //create a global function to read a file from disk

fun readFromFile(fileLoc: String): String {
    //  Define file location
    val fileName = fileLoc
    //  Read file in by line
    var packingList = File(fileLoc).readLines()

    //  Initialize total Int Accumulator
    var totalInt = 0

    // Separate each line into a string
    for (line in packingList) {
        //  Split string in half
        val part1 = separateStringInHalf(line).first
        val part2 = separateStringInHalf(line).second
        //  Find matching Char in both strings
        val match = checkMatch(part1, part2)
        //  Find match's integer amount
        val matchInt = charsVal(match)
        //  Add matchInt to totalInt
        totalInt += matchInt
    }

    return "test"
}