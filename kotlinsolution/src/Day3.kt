/*
*
* Puzzle source : https://adventofcode.com/2021/day/3
* */

val report: List<String> = listOf("00100","11110","10110","10111","10101","01111","00111","11100","10000","11001","00010","01010")
val numberOfBinaryDigits = 5
fun main() {
    print("Gamma binary : ${calculateGammaBinary()}")
    val binaryGamma = calculateGammaBinary()
    print("the epsilon rate: ${invertingBinaryDigits(binaryGamma)}")
}

fun calculateGammaBinary(): String {
    var digits = ""
    val length = report.size

    for(digitIndex in 0..numberOfBinaryDigits - 1) {
        var numberOfOnes = 0
        report.forEach {
            if (it[digitIndex].toString() == "1") {
                numberOfOnes += 1
            }
        }
        digits += if (numberOfOnes > length - numberOfOnes) {
            "1"
        } else "0"
    }


    return digits
}

private fun invertingBinaryDigits(binaryValue: String): String {
    var invertedDigits = binaryValue
    for (index in 0..4){
        val shifted = (1 shl index)
        print("shifted value - $shifted\n")
        val xored = invertedDigits.toInt(radix = 2).xor(shifted)
        print("shifted value - $shifted - xored value : $xored : binary : ${xored.toString(2)}\n")
    }
    return invertedDigits
}

private fun String.toDecimal(): Int? {
    return if(!isNullOrBlank()) {
        toInt(2)
    } else null
}
