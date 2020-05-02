package com.muhammadiqbalafandi.classiccryptographyalgorithm.algorithm

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

class AtbashCipherTest {

    private lateinit var atbashCipher: AtbashCipher

    @Before
    fun before() {
        atbashCipher = mock(AtbashCipher::class.java)
        atbashCipher =
            AtbashCipher
    }

    @Test
    fun encryption() {
        val plaintext = "abcdef ghijkl mnopqrst uvwxyz"
        val atbashEncryptionResult = atbashCipher.encryption(plaintext)
        val atbashDecryptionResult = atbashCipher.decryption(atbashEncryptionResult)
        println("Encryption ->")
        println(atbashEncryptionResult)
        println("Decryption ->")
        println(atbashDecryptionResult)
    }

    @Test
    fun decryption() {
    }
}