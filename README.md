# **Classic Cryptography Algorithms**

1. [Bahasa Indonesia](https://github.com/MuhammadIqbalAfandi/Classic-Cryptography-Algorithm/blob/master/README-ID.md)

### **Instalation**

**Gradle**

``` 
allprojects {
  repositories {
   ...
   maven { url 'https://jitpack.io' }
  }
 }
```

``` 
dependencies {
    implementation 'com.github.MuhammadIqbalAfandi:Classic-Cryptography-Algorithm:0.1.0-alpha'
}
```

### **Customization & Samples**

**APIs for Atbash Cipher Encryption and Decryption**

| Class          | Method                                              | Description                               |
|----------------|-----------------------------------------------------|-------------------------------------------|
| VigenereCipher | encryption(plaintext: String, key: String): String  | A function that produces text encryption. |
| VigenereCipher | decryption(ciphertext: String, key: String): String | Function that returns the original text.  |

**APIs for Vigenere Cipher Encryption and Decryption**

| Class        | Method                                 | Description                               |
|--------------|----------------------------------------|-------------------------------------------|
| AtbashCipher | encryption(plaintext: String): String  | A function that produces text encryption. |
| AtbashCipher | decryption(ciphertext: String): String | Function that returns the original text.  |

**APIs for Helpers**

| Class   | Method                                                         | Description                                                                                  |
|---------|----------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| Helpers | changeStringToAscii(string: String): MutableList<Int>          | Change the string value to ascii value.                                                      |
| Helpers | changeAsciiToString(asciiArray: MutableList): String           | Change the ascii value to string value.                                                      |
| Helpers | checkAsciiCharacterSupported(ascii: Int): Boolean              | Check whether the ascii value is the same as the supported ascii value.                      |
| Helpers | getCharacterValue(index: Int): Int                             | Retrieve character values based on index value.                                              |
| Helpers | getIndexValue(ascii: Int): Int                                 | Take the character index value.                                                              |
| Helpers | removeSpace(string: String): String                            | Removes spaces in the text.                                                                  |
| Helpers | repeatKeyWithKey(key: String, plaintext: String): String       | Repeat the key as much as the text to be encrypted.                                          |
| Helpers | repeatKeyWithPlaintext(key: String, plaintext: String): String | Repeat the key as much as the text to be encrypted by adding the plaintext value to the key. |
| Helpers | modulus(n: Int, m: Int): Int                                   | Modulus                                                                                      |

**Samples**

Kotlin:

```kotlin
val plaintext = "ATTACKATDAWN"
val key = "LEMONLEMONLE"
val vigenereEncryptionResult = VigenereCipher.encryption(plaintext, key)
val vigenereDecryptionResult = VigenereCipher.decryption(vigenereEncryptionResult, key)
println("Encryption ->")
println(vigenereEncryptionResult)
println("Decryption ->")
println(vigenereDecryptionResult)

val atbashEncryptionResult = AtbashCipher.encryption(plaintext)
val atbashDecryptionResult = AtbashCipher.decryption(atbashEncryptionResult)
println("Encryption ->")
println(atbashEncryptionResult)
println("Decryption ->")
println(atbashDecryptionResult)
```

kotlin:

```kotlin
val text = "Kotlin Awesome"
val asciiValue = Helpers.changeStringToAscii(text)
println(asciiValue)
```

### **List Of Character Supported**

```txt
"!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\ ^_`abcdefghijklmnopqrstuvwxyz{|}~"
```

### **Supported Character Index Values**

```txt
!  "  #  $  %  &  '  (  )  *  +   ,   -   .   /   0   1   2   3   4   5   6   7   8   9   :   ;   <   =   >   ?   @   A   B   C   D   E

0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27  28  29  30  31  32  33  34  35  36

F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z  [  \  ]  ^  _  `  a  b  c  d  e  f  g

37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70

h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z  {  |  }  ~

71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93
```

### **How to Atbash Cipher Encryption and Decryption Process in Applications**

**Encryption**

There are two processes atbash cipher encryption :

1. Check each plaintext character (original text), what is the plaintext character
included in the characters that are supported for encryption, please see
[here](#list-of-character-supported) what characters can be encrypted.

2. Encrypt every supported plaintext character, by searching
the index value of each plaintext character
please see [here](#supported-character-index-values) to see values
index of each character, after getting the character index value input
into the Atbash Cipher formula we get the character index value already in
encryption, because the value is still in the form of an index take the character value
based on the index you can see
[here](#supported-character-index-values).

**Decryption**

There are two prosses atbash cipher decryption :

1. Check each plaintext character (original text), what is the plaintext character
included in the characters that are supported for encryption, please see
[here](#list-of-character-supported) what characters can be encrypted.

2. Decrypt each supported ciphertext character, by searching
the index value of each ciphertext character please see
[here](#supported-character-index-values) to see the index value of
each character, after getting the character index value input
into the Atbash Cipher formula we get the character index value already in
decryption, because the value is still in the form of an index take its character value
based on the index you can see
[here](#supported-character-index-values).

### **What is the Vigenere Cipher Encryption and Decryption Process in Applications**

**Encryption**

There are two processes atbash cipher encryption :

1. Check each plaintext character (original text), what is the plaintext character
included in the characters that are supported for encryption, please see
[here](#list-of-character-supported) what characters can be encrypted.

2. Encrypt every supported plaintext character, by searching
the index value of each plaintext character
please see [here](#supported-character-index-values) to see values
index of each character, after getting the character index value input
into the Vigenere Cipher formula we get the character index value already in
encryption, because the value is still in the form of an index take the character value
based on the index you can see
[here](#supported-character-index-values).

**Decryption**

There are two prosses atbash cipher decryption :

1. Check each plaintext character (original text), what is the plaintext character
included in the characters that are supported for encryption, please see
[here](#list-of-character-supported) what characters can be encrypted.

2. Decrypt each supported ciphertext character, by searching
the index value of each ciphertext character please see
[here](#supported-character-index-values) to see the index value of
each character, after getting the character index value input
into the Vigenere Cipher formula we get the character index value already in
decryption, because the value is still in the form of an index take its character value
based on the index you can see
[here](#supported-character-index-values).
