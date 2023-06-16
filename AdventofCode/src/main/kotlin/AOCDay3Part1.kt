import java.io.File

fun main() {
    //  Define file location
    val fileName = "src/main/kotlin/Day3Input.txt"
    //  Read file in by line
    var packingList = File(fileName).readLines()

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

    //  Print Total
    println(totalInt)

}

//  Function to receive to strings and loop through the first by character and check to see if the second
//  string contains that char, then returns that char
fun checkMatch(part1: String, part2: String): Char {
    var retChar = ' '
    //Loop through each char
    for (char in part1) {
        if (part2.contains(char))
            return char
    }
    return retChar
}

//  Function to receive a string and return a pair containing the first half and second half strings
fun separateStringInHalf(s: String): Pair<String, String> {
//    Define Length of String
    var stringLen = s.length
//    Slice string from index 0 Until half the length of string
    var firstHalf = s.slice(0 until (stringLen / 2))
//    Slice string from index half of the length Until the end of the string
    var secondHalf = s.slice((stringLen / 2) until stringLen)
//    Return pair
    return Pair(firstHalf, secondHalf)
}

//  Function to receive a character and return a numerical value associated to number
fun charsVal(char: Char): Int {
    when (char) {
        'a' -> return 1
        'b' -> return 2
        'c' -> return 3
        'd' -> return 4
        'e' -> return 5
        'f' -> return 6
        'g' -> return 7
        'h' -> return 8
        'i' -> return 9
        'j' -> return 10
        'k' -> return 11
        'l' -> return 12
        'm' -> return 13
        'n' -> return 14
        'o' -> return 15
        'p' -> return 16
        'q' -> return 17
        'r' -> return 18
        's' -> return 19
        't' -> return 20
        'u' -> return 21
        'v' -> return 22
        'w' -> return 23
        'x' -> return 24
        'y' -> return 25
        'z' -> return 26
        'A' -> return 27
        'B' -> return 28
        'C' -> return 29
        'D' -> return 30
        'E' -> return 31
        'F' -> return 32
        'G' -> return 33
        'H' -> return 34
        'I' -> return 35
        'J' -> return 36
        'K' -> return 37
        'L' -> return 38
        'M' -> return 39
        'N' -> return 40
        'O' -> return 41
        'P' -> return 42
        'Q' -> return 43
        'R' -> return 44
        'S' -> return 45
        'T' -> return 46
        'U' -> return 47
        'V' -> return 48
        'W' -> return 49
        'X' -> return 50
        'Y' -> return 51
        'Z' -> return 52
        else -> {
            return 0
        }
    }


}