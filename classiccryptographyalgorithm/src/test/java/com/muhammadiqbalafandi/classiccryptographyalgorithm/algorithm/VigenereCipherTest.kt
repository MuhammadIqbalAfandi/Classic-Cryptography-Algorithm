package com.muhammadiqbalafandi.classiccryptographyalgorithm.algorithm

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

class VigenereCipherTest {

    private lateinit var vigenereCipher: VigenereCipher

    @Before
    fun before() {
        vigenereCipher = mock(VigenereCipher::class.java)
        vigenereCipher =
            VigenereCipher
    }

    @Test
    fun encryption() {
        val plaintext = "SERBU BERLIN"
        val key = "PIZZA"
        val vigenereEncryptionResult = vigenereCipher.encryption(plaintext, key)
        val vigenereDecryptionResult = vigenereCipher.decryption(vigenereEncryptionResult, key)
        println("Encryption ->")
        println(vigenereEncryptionResult)
        println("Decryption ->")
        print(vigenereDecryptionResult)
    }

    @Test
    fun decryption() {
    }
}