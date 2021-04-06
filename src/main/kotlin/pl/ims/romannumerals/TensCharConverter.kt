package pl.ims.romannumerals


/*
 * Created on 2021-04-06 12:43
 */
class TensCharConverter {
    private val tab = arrayOf("X", "XX", "XXX")
    fun convert(c: Int): String = when {
        c == 0 -> ""
        c < 4 -> tab[c - 1]
        c == 4 -> "XL"
        c == 5 -> "L"
        c < 9 -> "L" + tab[c - 6]
        else -> "XC"
    }
}
