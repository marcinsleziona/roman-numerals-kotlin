package pl.ims.romannumerals

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
 * Created on 2021-04-06 10:32
 */
internal class TensCharConverterTest {

    private val converter = TensCharConverter()

    @Test
    fun `Convertion result should equal the expected result`() {
        assertAll(
            { assertEquals("", converter.convert(0)) },
            { assertEquals("X", converter.convert(1)) },
            { assertEquals("XX", converter.convert(2)) },
            { assertEquals("XXX", converter.convert(3)) },
            { assertEquals("XL", converter.convert(4)) },
            { assertEquals("L", converter.convert(5)) },
            { assertEquals("LX", converter.convert(6)) },
            { assertEquals("LXX", converter.convert(7)) },
            { assertEquals("LXXX", converter.convert(8)) },
            { assertEquals("XC", converter.convert(9)) }
        )
    }
}
