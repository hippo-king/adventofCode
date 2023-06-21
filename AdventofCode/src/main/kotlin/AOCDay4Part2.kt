import java.io.File

fun main() {
    //   Read in File and assign it to array
    var arrayOfSections = readFile()
    // Counter
    var counter = 0
    //  Check if sections overlap
    for (line in arrayOfSections) {
//    if Overlap increment counter
        if (checkOverlap2(line)) {
            counter++
        }
    }
    println(counter)
}

//  Function receives a string and compares the numbers inside string for overlap
fun checkOverlap2(s: String): Boolean {
    //  Split string into parts by ,
    var pair = s.split(',')
    //Check both pairs
    return checkPairs2(pair[0], pair[1])
}

fun checkPairs2(s: String, s1: String): Boolean {
    //  Split each section by -
    var sectionOne = s.split('-')
    var sectionTwo = s1.split('-')
    //check range
    return if (checkRange2(
            sectionOne[0].toInt(),
            sectionOne[1].toInt(),
            sectionTwo[0].toInt(),
            sectionTwo[1].toInt()
        )
    ) {
//        println("$s . $s1")
//        println("${sectionOne[0]}, ${sectionOne[1]}, ${sectionTwo[0]}, ${sectionTwo[1]}")
        println("OverLap")
        true
    } else false

}

fun checkRange2(oneStart: Int, oneEnd: Int, twoStart: Int, twoEnd: Int): Boolean {
    //  if overlap ranger [a-b],[x-y] if x >= a & b >=y
    if (oneStart <= twoStart && oneEnd >= twoEnd) {
        return true
    } else if (oneStart >= twoStart && oneEnd <= twoEnd) {
        return true
    } else return false
}
