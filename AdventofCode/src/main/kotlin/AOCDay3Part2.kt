import java.io.File

fun main() {
    //  Define file location
    val fileName = "src/`2023`.day1.main/kotlin/Day3Input.txt"
    //  Read file in by line
    var packingList = File(fileName).readLines()

    //  Initialize total Int Accumulator
    var totalInt = 0
    //  Initialize every third counter
    var counter = 0
    //  Initialize list of three items
    var tripleList = mutableListOf<String>()

    for (pack in packingList) {
        //  If counter is less than 3 add item to array else start a new array
        if (counter < 3) {
            //  Add pack to list
            tripleList.add(pack)
            //  Increment counter
            counter++
        }
        if (counter >= 3) {
            //  Check list for matching char
            var match = checkMatch3(tripleList[counter - 3], tripleList[counter - 2], tripleList[counter - 1])
            //  Get character's number value
            totalInt += charsVal(match)
            //  Clear the list
            tripleList.clear()
            //  Reset counter to 0
            counter = 0
        }
    }
//  Print Total
    println(totalInt)
}

//  Function to receive three strings and loop through the first by character and check to see if the second
//  string contains that char, and the third string also contains that letter, then returns that char
fun checkMatch3(s1: String, s2: String, s3: String): Char {
    var retChar = ' '
    //Loop through each char
    for (char in s1) {
        if (s2.contains(char)) if (s3.contains(char)) {
            return char
        }
    }

    return retChar
}
