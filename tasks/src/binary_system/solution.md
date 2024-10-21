### 1. Umrechnung von Binärsystem → Dezimalsystem

Um eine Binärzahl in eine Dezimalzahl umzurechnen, multiplizieren wir jedes Bit (die einzelnen Ziffern der Binärzahl)
mit der entsprechenden Potenz von 2 und addieren die Ergebnisse.

#### a) $1001101_2$

Die Stellen der Binärzahl entsprechen folgenden Potenzen von 2:

$1001101_2 = 1 \cdot 2^6 + 0 \cdot 2^5 + 0 \cdot 2^4 + 1 \cdot 2^3 + 1 \cdot 2^2 + 0 \cdot 2^1 + 1 \cdot 2^0$

$= 1 \cdot 64 + 0 \cdot 32 + 0 \cdot 16 + 1 \cdot 8 + 1 \cdot 4 + 0 \cdot 2 + 1 \cdot 1$

$= 64 + 0 + 0 + 8 + 4 + 0 + 1 = 77_{10}$

#### b) $11101001_2 $

$11101001_2 = 1 \cdot 2^7 + 1 \cdot 2^6 + 1 \cdot 2^5 + 0 \cdot 2^4 + 1 \cdot 2^3 + 0 \cdot 2^2 + 0 \cdot 2^1 + 1 \cdot
2^0$

$= 1 \cdot 128 + 1 \cdot 64 + 1 \cdot 32 + 0 \cdot 16 + 1 \cdot 8 + 0 \cdot 4 + 0 \cdot 2 + 1 \cdot 1$

$= 128 + 64 + 32 + 0 + 8 + 0 + 0 + 1 = 233_{10}$

#### c) $101000110_2 $

$101000110_2 = 1 \cdot 2^8 + 0 \cdot 2^7 + 1 \cdot 2^6 + 0 \cdot 2^5 + 0 \cdot 2^4 + 0 \cdot 2^3 + 1 \cdot 2^2 + 1 \cdot
2^1 + 0 \cdot 2^0$

$= 1 \cdot 256 + 0 \cdot 128 + 1 \cdot 64 + 0 \cdot 32 + 0 \cdot 16 + 0 \cdot 8 + 1 \cdot 4 + 1 \cdot 2 + 0 \cdot 1$

$= 256 + 0 + 64 + 0 + 0 + 0 + 4 + 2 + 0 = 326_{10}$

---

### 2. Umrechnung von Dezimalsystem → Binärsystem

Um eine Dezimalzahl in eine Binärzahl umzurechnen, teilen wir die Zahl wiederholt durch 2 und notieren den Rest, bis das
Ergebnis 0 ist. Die Binärzahl ergibt sich dann aus den Resten, von unten nach oben gelesen.

#### a) $143_{10} $

$143 \div 2 = 71 \ \text{Rest} \ 1$

$71 \div 2 = 35 \ \text{Rest} \ 1$

$35 \div 2 = 17 \ \text{Rest} \ 1$

$17 \div 2 = 8 \ \text{Rest} \ 1$

$8 \div 2 = 4 \ \text{Rest} \ 0$

$4 \div 2 = 2 \ \text{Rest} \ 0$

$2 \div 2 = 1 \ \text{Rest} \ 0$

$1 \div 2 = 0 \ \text{Rest} \ 1$

Von unten nach oben gelesen: $143_{10} = 10001111_2 $

#### b) $56_{10} $

$56 \div 2 = 28 \ \text{Rest} \ 0$

$28 \div 2 = 14 \ \text{Rest} \ 0$

$14 \div 2 = 7 \ \text{Rest} \ 0$

$7 \div 2 = 3 \ \text{Rest} \ 1$

$3 \div 2 = 1 \ \text{Rest} \ 1$

$1 \div 2 = 0 \ \text{Rest} \ 1$

Von unten nach oben gelesen: $56_{10} = 111000_2 $

#### c) $226_{10} $

$226 \div 2 = 113 \ \text{Rest} \ 0$

$113 \div 2 = 56 \ \text{Rest} \ 1$

$56 \div 2 = 28 \ \text{Rest} \ 0$

$28 \div 2 = 14 \ \text{Rest} \ 0$

$14 \div 2 = 7 \ \text{Rest} \ 0$

$7 \div 2 = 3 \ \text{Rest} \ 1$

$3 \div 2 = 1 \ \text{Rest} \ 1$

$1 \div 2 = 0 \ \text{Rest} \ 1$

Von unten nach oben gelesen: $226_{10} = 11100010_2 $