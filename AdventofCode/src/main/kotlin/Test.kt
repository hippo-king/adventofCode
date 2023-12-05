fun main() {
    var arrs = mutableListOf(
        mutableListOf('c', ' ', 'e', '@'),
        mutableListOf('b', ' ', 'F', '$'),
        mutableListOf('^', 'M', 'C', 'T'),
        mutableListOf('%', 'w', 'x', 'l'),
        mutableListOf('c', 'f', 'g', '#')
    )
    var charLocation = 1
    var fromArrayLocation = 1
    var toArrayLocation = 1
    var emptyChar = false
    var charToSave = ' '
    var index = 0
    do {
        for (chars in arrs[index]) {
            //if char is empty and is equal to charLocation, check next list
            if (chars == ' ' && index == charLocation) {
                //Do Nothing, Move to next
                arrs[index]
            }
//            else {
//                print(chars)
        }
        println(arrs[index])

        index++
        // TAKE CHAR from arrs[2] to arr[1]
//        println(arrs[2][1].toString())
    } while ((index in 0 until arrs.size))
    println(arrs.size)
////    index
//    var index = 0
//    for (list in arrs) {
//        if (list[fromArrayLocation] === ' ') {
//            //Empty arr location
//            list[fromArrayLocation] = ' '
//            //
//        } else {
//            //Add new mutable list to beginning
//
//            //decide which char location to add new char
//            var newList = mutableListOf(' ', ' ', ' ', ' ')
//            list.add(toArrayLocation, charToSave)
//        }
//        for (element in list) {
//
//            if (index == charLocation) {
//                charToSave = element
//            }
//            print("$element ")
//            index++
//        }
//
//        println()
//    }
//    println("Saved $charToSave")

}