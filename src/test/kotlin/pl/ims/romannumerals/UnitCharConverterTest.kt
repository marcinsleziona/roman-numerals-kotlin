package pl.ims.romannumerals

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

/*
 * Created on 2021-04-06 10:32
 */
internal class UnitCharConverterTest {

    private val converter = UnitCharConverter()

    @TestFactory
    fun testConvert() = listOf(
        0 to "",
        1 to "I",
        2 to "II",
        3 to "III",
        4 to "IV",
        5 to "V",
        6 to "VI",
        7 to "VII",
        8 to "VIII",
        9 to "IX",
    )
        .map { (input, expected) ->
            dynamicTest("when I convert $input then I should get $expected") {
                assertEquals(expected, converter.convert(input))
            }
        }
}
