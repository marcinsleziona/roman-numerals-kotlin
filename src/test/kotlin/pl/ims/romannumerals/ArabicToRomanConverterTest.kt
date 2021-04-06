package pl.ims.romannumerals

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.assertThrows

/*
 * Created on 2021-04-06 11:28
 */
internal class ArabicToRomanConverterTest {

    private val converter = ArabicToRomanConverter()

    @Test
    fun `Number greater than 3999 should throw IllegalStateExeption`() {
        assertThrows<IllegalArgumentException> {
            converter.convert("4000")
        }
    }

    @TestFactory
    fun testConvert() = listOf(
        "0" to "",
        "1" to "I",
        "11" to "XI",
        "57" to "LVII",
        "98" to "XCVIII",
        "192" to "CXCII",
        "999" to "CMXCIX",
        "1491" to "MCDXCI",
        "1987" to "MCMLXXXVII",
        "2021" to "MMXXI",
    )
        .map { (input, expected) ->
            dynamicTest("when I convert $input then I should get $expected") {
                assertEquals(expected, converter.convert(input))
            }
        }
}

