package pl.ims.romannumerals

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.assertThrows

/*
 * Created on 2021-04-06 10:32
 */
internal class ThousandsCharConverterTest {

    private val converter = ThousandsCharConverter()

    @Test
    fun `Number greater than 3 should throw IllegalArgumentException`() {
        assertThrows<IllegalArgumentException> {
            converter.convert(4)
        }
    }

    @TestFactory
    fun testConvert() = listOf(
        0 to "",
        1 to "M",
        2 to "MM",
        3 to "MMM",
    )
        .map { (input, expected) ->
            dynamicTest("when I convert $input then I should get $expected") {
                assertEquals(expected, converter.convert(input))
            }
        }
}
