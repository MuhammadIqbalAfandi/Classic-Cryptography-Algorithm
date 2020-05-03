# **Algoritma Kriptograpi Klasik**

### **Instalasi**

**Gradle**

Selalu periksa versi terbaruh

```gradle
allprojects {
  repositories {
   ...
   maven { url 'https://jitpack.io' }
  }
 }
```

```gradle
dependencies {
    implementation 'com.github.MuhammadIqbalAfandi:Classic-Cryptography-Algorithm:0.2.0-alpha'
}
```

### **API & Contoh Penggunaan**

**API untuk Enkripsi dan Dekripsi Vigenere Cipher**

| Class          | Method                                              | Description                               |
|----------------|-----------------------------------------------------|-------------------------------------------|
| VigenereCipher | encryption(plaintext: String, key: String): String  | Melakukan Proses Enkripsi Text.           |
| VigenereCipher | decryption(ciphertext: String, key: String): String | Melakukan Proses Dekripsi Text.           |

**API untuk Enkripsi dan Dekripsi Atbash Cipher**

| Class        | Method                                 | Description                               |
|--------------|----------------------------------------|-------------------------------------------|
| AtbashCipher | encryption(plaintext: String): String  | Melakukan Proses Enkripsi Text.           |
| AtbashCipher | decryption(ciphertext: String): String | Melakukan Proses Dekripsi Text.           |

**API untuk Fungsi Pembantu(Helpers)**

| Class   | Method                                                         | Description                                                                                  |
|---------|----------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| Helpers | changeStringToAscii(string: String): MutableList<Int>          | Mengubah string ke nilai ascii value.                                                      |
| Helpers | changeAsciiToString(asciiArray: MutableList): String           | Mengubah ascii ke nilai string value.                                                      |
| Helpers | checkAsciiCharacterSupported(ascii: Int): Boolean              | Memeriksa apakah nilai ascii merupakan nilai ascii yang didukung.                      |
| Helpers | getCharacterValue(index: Int): Int                             | Mengembalikan karakter berdasarkan nilai index.                                              |
| Helpers | getIndexValue(ascii: Int): Int                                 | Mengambil nilai index dari karakter.                                                              |
| Helpers | removeSpace(string: String): String                            | Menghapus spasi teks.                                                                  |
| Helpers | repeatKeyWithKey(key: String, plaintext: String): String       | Mengulang key sebanyak plaintext dengan menambahkan key itu sendiri.                                          |
| Helpers | repeatKeyWithPlaintext(key: String, plaintext: String): String | Mengulang key sebanyak plaintext dengan menambahkan plaintext itu sendiri.|
| Helpers | modulus(n: Int, m: Int): Int                                   | Mengasilkan nilai sisa bagi.                                                                                      |

**Contoh Penggunaan**

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

### **Daftar Karakter yang didukung**

```txt
"!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\ ^_`abcdefghijklmnopqrstuvwxyz{|}~"
```

### **Nilai Index Karakter yang didukung**

```txt
!  "  #  $  %  &  '  (  )  *  +   ,   -   .   /   0   1   2   3   4   5   6   7   8   9   :   ;   <   =   >   ?   @   A   B   C   D   E

0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27  28  29  30  31  32  33  34  35  36

F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z  [  \  ]  ^  _  `  a  b  c  d  e  f  g

37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70

h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z  {  |  }  ~

71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93
```

### **Bagaimana Proses Enkripsi dan Dekripsi Vigenere Cipher dan Atbash Cipher dalam Aplikasi**

1. Mengecek setiap karakter plaintext (text asli), apakah karakter plaintext
termasuk kedalam karakter yang didukung untuk di enkripsi, silahkan lihat
[disini](#daftar-karakter-yang-didukung) karakter apa saja yang bisa di enkripsi.

2. Mengenkripsi setiap karakter plaintext yang didukung, dengan cara mencari
nilai index setiap karakter plaintext
silahkan lihat [disini](#nilai-index-karakter-yang-didukung) untuk melihat nilai
index dari setiap karakter, setelah mendapatkan nilai index karakternya masukan
kedalam rumus maka didapat nilai index karakter yang sudah di enkripsi, karena
nilai itu masi dalam bentuk index ambil nilai karakternya berdasarkan index
tersebut bisa lihat [disini](#nilai-index-karakter-yang-didukung).
Hal yang sama juga berlaku untuk dekripsi.
