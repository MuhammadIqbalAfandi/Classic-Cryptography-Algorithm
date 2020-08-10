package com.muhammadiqbalafandi.classiccryptographyalgorithm

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

class HelpersTest {

    private lateinit var helpers: Helpers

    private val text = "Kotlin is Awesome"
    private val ascii = mutableListOf(
        75,
        111,
        116,
        108,
        105,
        110,
        32,
        105,
        115,
        32,
        65,
        119,
        101,
        115,
        111,
        109,
        101
    )

    @Before
    fun before() {
        helpers = mock(Helpers::class.java)
        helpers = Helpers
    }

    @Test
    fun changeStringToAscii() {
        val resultAscii = helpers.changeStringToAscii(text)
        print(resultAscii)
    }

    @Test
    fun changeAsciiToString() {
        val resultString = helpers.changeAsciiToString(ascii)
        print(resultString)
    }

    @Test
    fun checkAsciiCharacterSupported() {
    }

    @Test
    fun removeSpace() {
        val textWithoutSpace = helpers.removeSpace(text)
        print(textWithoutSpace)
    }

    @Test
    fun repeatKeyWithKey() {
        val result = helpers.repeatKeyWithKey("30", text)
        print(result)
    }

    @Test
    fun repeatKeyWithPlaintext() {
        val result = helpers.repeatKeyWithPlaintext("30", text)
        print(result)
    }

    @Test
    fun modulus() {
//        val result = ((Helpers.modulus(-15, 26)) + 1)
//        val result = ((0 - 7) + 26) % 26
//        val result = (93 + 93) % 94
//        print(result)
    }

}