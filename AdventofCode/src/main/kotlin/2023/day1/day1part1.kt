package `2023`.day1

import readFromFile
import java.io.File

fun main() {
//    file variable location
    val FILE_LOCATION = "input.txt"
    /*
    split string by first and last digit and append the two digits together for the wqhole number
    1abc2
    pqr3stu8vwx
    a1b2c3d4e5f
    treb7uchet
     */

    val input = "1abc2\n" +
            "pqr3stu8vwx\n" +
            "a1b2c3d4e5f\n" +
            "treb7uchet"

    //1. read input in from file
    //  Define file location
    //  Read file in by line
    //2. split each line and add it to an arr
    var list = File().readLines()



    for (line in list) {
        println(line)
    }
//    println(fileName)

    //3. loop through array and check each line for first digit char and last digit char
    //4. append first digit to second digit for our desired 2-digit number
    //5. sum all the 2digit numbers

//    for (line in input) {
//        println(line)
//    }
//    println("Hello World")
}