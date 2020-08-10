package com.muhammadiqbalafandi.classiccryptographyalgorithm.algorithm

import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.getCharacterValue
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

class VigenereCipherTest {

    private lateinit var vigenereCipher: VigenereCipher
    private lateinit var atbashCipher: AtbashCipher
    private lateinit var helper: Helpers

    @Before
    fun before() {
        vigenereCipher = mock(VigenereCipher::class.java)
        atbashCipher = mock(AtbashCipher::class.java)
        helper = mock(Helpers::class.java)
        vigenereCipher =
            VigenereCipher
        atbashCipher = AtbashCipher
        helper = Helpers
    }

    @Test
    fun encryption() {
        val plaintext2 = "SerBuBerlin"
        val plaintext3 = "hmqauqmqkic"
        val key = "PizzapPizap"

//        val result = atbashCipher.encryption(vigenereCipher.encryption(plaintext2, key))
//        val result = vigenereCipher.encryption(atbashCipher.encryption("{P2bHliC8T@"), key)
//        println("Encryption -> $result")
    }
}