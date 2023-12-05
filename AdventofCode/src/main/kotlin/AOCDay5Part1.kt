import java.io.File

fun main() {

    var file = readFileUpdated("src/main/kotlin/Day5Input.txt")
    var counter = 0
    var stackArr = mutableListOf<String>()
//    var stackArr = ""
    for (line in file) {
        //  Here lies our stacks
        var strOfChars = ""
        //  Counter to keep track of Char location for each stack in string
        var ctr = 1
        if (counter in 0..7) {
            //  Grab list item numbers corresponding with their stack
            //  If line is shorter than desired list location add nothing to array
            while (ctr <= 33) {
                if (line.length > ctr) {
                    strOfChars += line[ctr].toString()
                }
                if (line.length < ctr) {
                    //  Add empty space for list indexing
                    strOfChars += ' '
                }
                ctr += 4
            }
            stackArr.add(strOfChars)

//            println(stackArr)
        }

        //  Here lies our directions
        if (counter >= 10) {
            //  Define move amount from line by removing all other text from line
            var moveAmount = line.split("move")[1].split("from")[0].trim().toInt()
            //  Define stack number to remove moveAmount stacks
            var fromStack = line.split("move")[1].split("from")[1].split("to")[0].trim().toInt()
            //  Define stack number to receive moveAmount stacks
            var receivingStack = line.split("move")[1].split("from")[1].split("to")[1].trim().toInt()

            var stackshot = changeStack(stackArr, moveAmount, Pair(fromStack, receivingStack))
//            println("Amount: $moveAmount    From: $fromStack   To: $receivingStack")
        }
//        println(stackArr2)
        counter++
    }
    if (counter == file.size) {
        for (lines in stackArr) {
            println(lines)
        }
    }
//    println(stackArr)
}

//  Function that receives a list, number of moves, and from to where then moves desired numbers of items from one list location to another
fun changeStack(stacks: MutableList<String>, numMoves: Int, dir: Pair<Int, Int>): MutableList<String> {
    var retList = stacks
    var fromStack = (dir.first - 1)
    var toStack = dir.second
    var newStackString = ""
    //  Modify array to desired string

    //  Move from
//    var oldString = retList[fromStack].toList()
//    var storedChars = ""
//
//    var newList = testFuun(retList, numMoves, dir)
//        oldString
//    println(newList)


//    retList[fromStack] = newStackString


    return retList
}

private fun readFileUpdated(src: String): List<String> {
    //  Read file in by line
    return File(src).readLines()
}

//  Add Character to List string
fun addListItem( list: MutableList<String>, char: Char, location : Int) :MutableList<String> {
    var retList = list


    return retList
}


fun testFuun(stacks: MutableList<String>, numMoves: Int, dir: Pair<Int, Int>): MutableList<String> {

    var someList = stacks
    var removedChar = " "
    for (i in 0 until dir.first) { // loop over the indices
        var value = someList[i] // get the value at index i
        if (value != " ") {
            //  Copy char to saved variable
            removedChar = value
            //  Remove char from list location
            someList[i] = " "

            //  Move char to end of new arrey

        }
        // modify the value if it meets a condition
    }
    var holdIndex = 0
    for (i in 0 until dir.second) { // loop over the indices
        //  Loop until holdIndex is equal or higher than i
        if (holdIndex >= i) {

            //  If location doesn't have a character, check array list below, if no char check below and if char is found add the new char to index above
            if (someList[i] == " ") {
                holdIndex = i
                // Check next iteration
            } else if (someList[i].isNotEmpty()) {
                holdIndex = i - 1
            }
        } else {
            //  Set saved char to new list location
            someList[i] = removedChar
            someList.add(removedChar)
        }

    }
    return someList
}