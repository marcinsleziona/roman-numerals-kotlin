package pl.ims.romannumerals


/*
 * Created on 2021-04-06 12:44
 */
class ThousandsCharConverter {
    fun convert(c: Int): String {
        if (c == 0) return ""
        if (c > 3) throw IllegalArgumentException("Standard Roman Numerals handle numbers up to 3999 !")
        val tab = CharArray(c)
        tab.fill('M')
        return String(tab)
    }
}
