package pl.ims.romannumerals

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

/*
 * Created on 2021-04-06 10:32
 */
internal class HundredsCharConverterTest {

    private val converter = HundredsCharConverter()

    @TestFactory
    fun testConvert() = listOf(
        0 to "",
        1 to "C",
        2 to "CC",
        3 to "CCC",
        4 to "CD",
        5 to "D",
        6 to "DC",
        7 to "DCC",
        8 to "DCCC",
        9 to "CM",
    )
        .map { (input, expected) ->
            dynamicTest("when I convert $input then I should get $expected") {
                assertEquals(expected, converter.convert(input))
            }
        }
}
