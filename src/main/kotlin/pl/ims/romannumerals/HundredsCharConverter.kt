package pl.ims.romannumerals

/*
 * Created on 2021-04-06 12:44
 */
class HundredsCharConverter {
    private val tab = arrayOf("C", "CC", "CCC")
    fun convert(c: Int): String = when {
        c == 0 -> ""
        c < 4 -> tab[c - 1]
        c == 4 -> "CD"
        c == 5 -> "D"
        c < 9 -> "D" + tab[c - 6]
        else -> "CM"
    }
}
