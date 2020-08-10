/**
 * Developed by Muhammad Iqbal Afandi
 * since april 2020.
 */

package com.muhammadiqbalafandi.classiccryptographyalgorithm.algorithm

import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.changeAsciiToString
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.changeStringToAscii
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.checkAsciiCharacterSupported
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.getCharacterValueForAtbash
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.getIndexValue
import com.muhammadiqbalafandi.classiccryptographyalgorithm.Helpers.modulus

/**
 * class that provides functions for
 * text encryption and decryption using the atbash cipher algorithm.
 */
object AtbashCipher {

    fun encryption(str: String): String {
        val listValueAsciiPlaintext: MutableList<Int> = changeStringToAscii(str)
        val ciphertextValue: MutableList<Int> = mutableListOf()
        for (plaintextAsciiValue in listValueAsciiPlaintext) {
            if (checkAsciiCharacterSupported(plaintextAsciiValue)) {
                val plaintextIndexValue = getIndexValue(plaintextAsciiValue) + 1

                /**
                 * Formula from the vigenere cipher algorithm
                 * please visit the site https://en.wikipedia.org/wiki/Atbash
                 * to see more detail.
                 */
                val atbashEncryptionResult = ((modulus(-plaintextIndexValue, 94)) + 1)
                ciphertextValue.add(getCharacterValueForAtbash(atbashEncryptionResult))
            } else {
                ciphertextValue.add(plaintextAsciiValue)
            }
        }
        return changeAsciiToString(ciphertextValue)
    }
}