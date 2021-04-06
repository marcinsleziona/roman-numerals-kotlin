package pl.ims.romannumerals


/*
 * Created on 2021-04-06 12:42
 */
class UnitCharConverter {
    private val tab = arrayOf("I", "II", "III")
    fun convert(c: Int): String = when {
        c == 0 -> ""
        c < 4 -> tab[c - 1]
        c == 4 -> "IV"
        c == 5 -> "V"
        c < 9 -> "V" + tab[c - 6]
        else -> "IX"
    }
}
