# **Classic Cryptography Algorithms**

1. [Bahasa Indonesia](#bahasa-indonesia)

2. [English Language](#english)

## **English**

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

**Gradle**

Add it in your root build.gradle at the end of repositories:

``` 
allprojects {
  repositories {
   ...
   maven { url 'https://jitpack.io' }
  }
 }
```

Step 2. Add the dependency

``` 
dependencies {
    implementation 'com.github.MuhammadIqbalAfandi:Classic-Cryptography-Algorithm:0.1.0-alpha'
}
```

## **List Of Character Supported**

```
"!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\ ^_`abcdefghijklmnopqrstuvwxyz{|}~"
```

## **Supported Character Index Values**

```
!  "  #  $  %  &  '  (  )  *  +   ,   -   .   /   0   1   2   3   4   5   6   7   8   9   :   ;   <   =   >   ?   @   A   B   C   D   E

0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27  28  29  30  31  32  33  34  35  36

F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z  [  \  ]  ^  _  `  a  b  c  d  e  f  g

37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70

h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z  {  |  }  ~

71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93
```

## **How to Atbash Cipher Encryption and Decryption Process in Applications**

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

## **What is the Vigenere Cipher Encryption and Decryption Process in Applications**

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

## **Bahasa Indonesia**

## **Bagaimana Proses Enkripsi dan Dekripsi Atbash Cipher dalam Aplikasi**

**Enkripsi**

Ada 2 proses enkripsi atbash cipher :

1. Mengecek setiap karakter plaintext (text asli), apakah karakter plaintext
termasuk kedalam karakter yang didukung untuk di enkripsi, silahkan lihat
[disini](#list-of-character-supported) karakter apa saja yang bisa di enkripsi.

2. Mengenkripsi setiap karakter plaintext yang didukung, dengan cara mencari
nilai index setiap karakter plaintext
silahkan lihat [disini](#supported-character-index-values) untuk melihat nilai
index dari setiap karakter, setelah mendapatkan nilai index karakternya masukan
kedalam rumus Atbash Ciphernya maka didapat nilai index karakter yang sudah di
enkripsi, karena nilai itu masi dalam bentuk index ambil nilai karakternya
berdasarkan index tersebut bisa lihat
[disini](#supported-character-index-values).

**Dekripsi**

Ada 2 prosess dekripsi atbash cipher :

1. Mengecek setiap karakter ciphertext (text terenkripsi), apakah karakter
ciphertext termasuk kedalam karakter yang didukung untuk di dekripsi,
silahkan lihat [disini](#list-of-character-supported) karakter apa saja yang
bisa di dekripsi.

2. Mengdekripsi setiap karakter ciphertext yang didukung, dengan cara mencari
nilai index setiap karakter ciphertext silahkan lihat
[disini](#supported-character-index-values) untuk melihat nilai index dari
setiap karakter, setelah mendapatkan nilai index karakternya masukan
kedalam rumus Atbash Ciphernya maka didapat nilai index karakter yang sudah di
dekripsi, karena nilai itu masi dalam bentuk index ambil nilai karakternya
berdasarkan index tersebut bisa lihat
[disini](#supported-character-index-values).

## **Bagaimana Proses Enkripsi dan Dekripsi Vigenere Cipher dalam Aplikasi**

**Enkripsi**

Ada 2 proses enkripsi atbash cipher :

1. Mengecek setiap karakter plaintext (text asli), apakah karakter plaintext
termasuk kedalam karakter yang didukung untuk di enkripsi, silahkan lihat
[disini](#list-of-character-supported) karakter apa saja yang bisa di enkripsi.

2. Mengenkripsi setiap karakter plaintext yang didukung, dengan cara mencari
nilai index setiap karakter plaintext
silahkan lihat [disini](#supported-character-index-values) untuk melihat nilai
index dari setiap karakter, setelah mendapatkan nilai index karakternya masukan
kedalam rumus Vigenere Ciphernya maka didapat nilai index karakter yang sudah di
enkripsi, karena nilai itu masi dalam bentuk index ambil nilai karakternya
berdasarkan index tersebut bisa lihat
[disini](#supported-character-index-values).

**Dekripsi**

Ada 2 proses enkripsi atbash cipher :

1. Mengecek setiap karakter ciphertext (text terenkripsi), apakah karakter
ciphertext termasuk kedalam karakter yang didukung untuk di dekripsi,
silahkan lihat [disini](#list-of-character-supported) karakter apa saja yang
bisa di dekripsi.

2. Mengdekripsi setiap karakter ciphertext yang didukung, dengan cara mencari
nilai index setiap karakter ciphertext silahkan lihat
[disini](#supported-character-index-values) untuk melihat nilai index dari
setiap karakter, setelah mendapatkan nilai index karakternya masukan
kedalam rumus Vigenere Ciphernya maka didapat nilai index karakter yang sudah di
dekripsi, karena nilai itu masi dalam bentuk index ambil nilai karakternya
berdasarkan index tersebut bisa lihat
[disini](#supported-character-index-values).
