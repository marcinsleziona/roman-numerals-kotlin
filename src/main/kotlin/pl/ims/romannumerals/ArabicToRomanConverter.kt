package pl.ims.romannumerals


/*
 * Created on 2021-04-06 12:45
 */
class ArabicToRomanConverter {
    private val unitCharConverter: UnitCharConverter = UnitCharConverter()
    private val tensCharConverter: TensCharConverter = TensCharConverter()
    private val hundredsCharConverter: HundredsCharConverter = HundredsCharConverter()
    private val thousandsCharConverter: ThousandsCharConverter = ThousandsCharConverter()

    fun convert(number: String): String {
        if (number.trim().isEmpty()) {
            return ""
        }
        val charArray = number.toCharArray()
        var idx = 1
        var ret = ""
        charArray.reverse()
        for (i in charArray.indices) {
            val c = charArray[i].toInt()
            if (idx == 1) {
                ret = unitCharConverter.convert(c.minus(48)).plus(ret)
                idx++
            } else if (idx == 2) {
                ret = tensCharConverter.convert(c.minus(48)).plus(ret)
                idx++
            } else if (idx == 3) {
                ret = hundredsCharConverter.convert(c.minus(48)).plus(ret)
                idx++
            } else {
                break
            }
        }
        if (charArray.size >= 4) {
            ret = thousandsCharConverter.convert(number.substring(0, number.length - 3).toInt()).plus(ret)
        }
        return ret
    }
}
