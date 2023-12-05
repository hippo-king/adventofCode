import java.io.File

fun main() {
    //   Read in File and assign it to array
    var arrayOfSections = readFile()
    // Counter
    var counter = 0
    //  Check if sections overlap
    for (line in arrayOfSections) {
//    if Overlap increment counter
        if (checkOverlap(line)) {
            counter++
        }
    }
    println(counter)
}

//  Function reading file into a list and returns the list of strings for each line
fun readFile(): List<String> {
    //  Define file location
    val fileName = "src/`2023`.day1.main/kotlin/Day4Input.txt"
    //  Read file in by line
    return File(fileName).readLines()


}

//  Function receives a string and compares the numbers inside string for overlap
fun checkOverlap(s: String): Boolean {
    //  Split string into parts by ,
    var pair = s.split(',')
    //Check both pairs
    return checkPairs(pair[0], pair[1])
}

fun checkPairs(s: String, s1: String): Boolean {
    //  Split each section by -
    var sectionOne = s.split('-')
    var sectionTwo = s1.split('-')
    //check range
    return if (checkRange(sectionOne[0].toInt(), sectionOne[1].toInt(), sectionTwo[0].toInt(), sectionTwo[1].toInt())) {
//        println("$s . $s1")
//        println("${sectionOne[0]}, ${sectionOne[1]}, ${sectionTwo[0]}, ${sectionTwo[1]}")
        println("OverLap")
        true
    } else false

}

fun checkRange(oneStart: Int, oneEnd: Int, twoStart: Int, twoEnd: Int): Boolean {
    //  if overlap range [a-b],[x-y] if x >= a & b >=y
    if (oneStart <= twoStart && oneEnd >= twoEnd) {
        return true
    } else if (oneStart >= twoStart && oneEnd <= twoEnd) {
        return true
    } else if (oneStart in (twoStart..twoEnd) || oneEnd in (twoStart..twoEnd)) {
        return true
    } else if (twoStart in (oneStart..oneEnd) || twoEnd in (oneStart..oneEnd)) {
        return true
    } else return false
}
