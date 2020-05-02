/**
 * Developed by Muhammad Iqbal Afandi
 * since april 2020.
 */

package com.example.classiccryptographyalgorithm.algorithm

import com.example.classiccryptographyalgorithm.Helpers.changeAsciiToString
import com.example.classiccryptographyalgorithm.Helpers.changeStringToAscii
import com.example.classiccryptographyalgorithm.Helpers.checkAsciiCharacterSupported
import com.example.classiccryptographyalgorithm.Helpers.getCharacterValue
import com.example.classiccryptographyalgorithm.Helpers.getIndexValue
import com.example.classiccryptographyalgorithm.Helpers.repeatKeyWithKey

/**
 * class that provides functions for
 * text encryption and decryption using the vigenere cipher algorithm.
 */
object VigenereCipher {
    /**
     * A function that produces text encryption.
     *
     * @param plaintext Request text to be encrypted.
     * @param key Request text to be used as a key for encryption.
     * @return Return the encrypted text.
     */
    fun encryption(plaintext: String, key: String): String {
        val listValueAsciiPlaintext: MutableList<Int> = changeStringToAscii(plaintext)
        val listValueAsciiKey: MutableList<Int> =
            changeStringToAscii(repeatKeyWithKey(key, plaintext))
        val ciphertextValue: MutableList<Int> = mutableListOf()
        for (plaintextAsciiValue in listValueAsciiPlaintext.withIndex()) {
            if (checkAsciiCharacterSupported(plaintextAsciiValue.value)) {
                val plaintextIndexValue = getIndexValue(plaintextAsciiValue.value)
                val indexValue = plaintextAsciiValue.index
                val keyIndexValue = getIndexValue(listValueAsciiKey[indexValue])

                /**
                 * Formula from the vigenere cipher algorithm
                 * please visit the site https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher
                 * to see more detail.
                 */
                val vigenereEncryptionResult = (plaintextIndexValue + keyIndexValue) % 94
                ciphertextValue.add(getCharacterValue(vigenereEncryptionResult))
            } else {
                ciphertextValue.add(plaintextAsciiValue.value)
            }
        }
        return changeAsciiToString(ciphertextValue)
    }

    /**
     * Function that returns the original text.
     *
     * @param ciphertext Request text to decrypted.
     * @param key Request the same key as the key used for encryption.
     * @return Return the decrypted text.
     */
    fun decryption(ciphertext: String, key: String): String {
        val listValueAsciiCiphertext: MutableList<Int> = changeStringToAscii(ciphertext)
        val listValueAsciiKey: MutableList<Int> =
            changeStringToAscii(repeatKeyWithKey(key, ciphertext))
        val plaintextValue: MutableList<Int> = mutableListOf()

        for (ciphertextAsciiValue in listValueAsciiCiphertext.withIndex()) {
            if (checkAsciiCharacterSupported(ciphertextAsciiValue.value)) {
                val ciphertextIndexValue = getIndexValue(ciphertextAsciiValue.value)
                val indexValue = ciphertextAsciiValue.index
                val keyIndexValue = getIndexValue(listValueAsciiKey[indexValue])

                /**
                 * Formula from the vigenere cipher algorithm
                 * please visit the site https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher
                 * to see more detail.
                 */
                val vigenereDecryptionResult = (ciphertextIndexValue - keyIndexValue + 94) % 94
                plaintextValue.add(getCharacterValue(vigenereDecryptionResult))
            } else {
                plaintextValue.add(ciphertextAsciiValue.value)
            }
        }
        return changeAsciiToString(plaintextValue)
    }
}