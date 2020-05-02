/**
 * Developed by Muhammad Iqbal Afandi
 * since april 2020.
 */

package com.muhammadiqbalafandi.classiccryptographyalgorithm.algorithm

import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.changeAsciiToString
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.changeStringToAscii
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.checkAsciiCharacterSupported
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.getCharacterValue
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.getIndexValue
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.modulus

/**
 * class that provides functions for
 * text encryption and decryption using the atbash cipher algorithm.
 */
object AtbashCipher {
    /**
     * A function that produces text encryption.
     *
     * @param plaintext Request text to be encrypted.
     * @return Return the encrypted text.
     */
    fun encryption(plaintext: String): String {
        val listValueAsciiPlaintext: MutableList<Int> = changeStringToAscii(plaintext)
        val ciphertextValue: MutableList<Int> = mutableListOf()
        for (plaintextAsciiValue in listValueAsciiPlaintext) {
            if (checkAsciiCharacterSupported(plaintextAsciiValue)) {
                val plaintextIndexValue = getIndexValue(plaintextAsciiValue) + 1

                /**
                 * Formula from the vigenere cipher algorithm
                 * please visit the site https://en.wikipedia.org/wiki/Atbash
                 * to see more detail.
                 */
                val atbashEncryptionResult = ((modulus(-plaintextIndexValue, 94)) + 1) - 1
                ciphertextValue.add(getCharacterValue(atbashEncryptionResult))
            } else {
                ciphertextValue.add(plaintextAsciiValue)
            }
        }
        return changeAsciiToString(ciphertextValue)
    }

    /**
     * Function that returns the original text.
     *
     * @param ciphertext Request text to decrypted.
     * @return Return the decrypted text.
     */
    fun decryption(ciphertext: String): String {
        val listValueAsciiPlaintext: MutableList<Int> = changeStringToAscii(ciphertext)
        val plaintextValue: MutableList<Int> = mutableListOf()
        for (ciphertextAsciiValue in listValueAsciiPlaintext) {
            if (checkAsciiCharacterSupported(ciphertextAsciiValue)) {
                val ciphertextIndexValue = getIndexValue(ciphertextAsciiValue) + 1

                /**
                 * Formula from the vigenere cipher algorithm
                 * please visit the site https://en.wikipedia.org/wiki/Atbash
                 * to see more detail.
                 */
                val atbashDecryptionResult = ((modulus(-ciphertextIndexValue, 94)) + 1) - 1
                plaintextValue.add(getCharacterValue(atbashDecryptionResult))
            } else {
                plaintextValue.add(ciphertextAsciiValue)
            }
        }
        return changeAsciiToString(plaintextValue)
    }
}