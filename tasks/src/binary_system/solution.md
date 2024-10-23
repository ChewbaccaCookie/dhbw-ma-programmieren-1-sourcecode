# Lösung: Umrechnung im Binärsystem

## 1. Umrechnung von Binärsystem → Dezimalsystem

Um eine Binärzahl in eine Dezimalzahl umzurechnen, multiplizieren wir jedes Bit (die einzelnen Ziffern der Binärzahl)
mit der entsprechenden Potenz von 2 und addieren die Ergebnisse.

### a) $1001101_2$

Die Stellen der Binärzahl entsprechen folgenden Potenzen von 2:

$1001101_2 = 1 \cdot 2^6 + 0 \cdot 2^5 + 0 \cdot 2^4 + 1 \cdot 2^3 + 1 \cdot 2^2 + 0 \cdot 2^1 + 1 \cdot 2^0$

$= 1 \cdot 64 + 0 \cdot 32 + 0 \cdot 16 + 1 \cdot 8 + 1 \cdot 4 + 0 \cdot 2 + 1 \cdot 1$

$= 64 + 0 + 0 + 8 + 4 + 0 + 1 = 77_{10}$

### b) $11101001_2 $

$11101001_2 = 1 \cdot 2^7 + 1 \cdot 2^6 + 1 \cdot 2^5 + 0 \cdot 2^4 + 1 \cdot 2^3 + 0 \cdot 2^2 + 0 \cdot 2^1 + 1 \cdot
2^0$

$= 1 \cdot 128 + 1 \cdot 64 + 1 \cdot 32 + 0 \cdot 16 + 1 \cdot 8 + 0 \cdot 4 + 0 \cdot 2 + 1 \cdot 1$

$= 128 + 64 + 32 + 0 + 8 + 0 + 0 + 1 = 233_{10}$

### c) $101000110_2 $

$101000110_2 = 1 \cdot 2^8 + 0 \cdot 2^7 + 1 \cdot 2^6 + 0 \cdot 2^5 + 0 \cdot 2^4 + 0 \cdot 2^3 + 1 \cdot 2^2 + 1 \cdot
2^1 + 0 \cdot 2^0$

$= 1 \cdot 256 + 0 \cdot 128 + 1 \cdot 64 + 0 \cdot 32 + 0 \cdot 16 + 0 \cdot 8 + 1 \cdot 4 + 1 \cdot 2 + 0 \cdot 1$

$= 256 + 0 + 64 + 0 + 0 + 0 + 4 + 2 + 0 = 326_{10}$

### d) $110110,10011_2$

Die Stellen vor dem Komma entsprechen folgenden Potenzen von 2:

$110110_2 = 1 \cdot 2^5 + 1 \cdot 2^4 + 0 \cdot 2^3 + 1 \cdot 2^2 + 1 \cdot 2^1 + 0 \cdot 2^0$

$= 1 \cdot 32 + 1 \cdot 16 + 0 \cdot 8 + 1 \cdot 4 + 1 \cdot 2 + 0 \cdot 1$

$= 32 + 16 + 0 + 4 + 2 + 0 = 54_{10}$

Die Stellen nach dem Komma entsprechen folgenden negativen Potenzen von 2:

$10011_2 = 1 \cdot 2^{-1} + 0 \cdot 2^{-2} + 0 \cdot 2^{-3} + 1 \cdot 2^{-4} + 1 \cdot 2^{-5}$

$= 1 \cdot 0,5 + 0 \cdot 0,25 + 0 \cdot 0,125 + 1 \cdot 0,0625 + 1 \cdot 0,03125$

$= 0,5 + 0 + 0 + 0,0625 + 0,03125 = 0,59375_{10}$

Daher: $110110,10011_2 = 54,59375_{10}$

### e) $1000110,010011_2$

Die Stellen vor dem Komma entsprechen folgenden Potenzen von 2:

$1000110_2 = 1 \cdot 2^6 + 0 \cdot 2^5 + 0 \cdot 2^4 + 0 \cdot 2^3 + 1 \cdot 2^2 + 1 \cdot 2^1 + 0 \cdot 2^0$

$= 1 \cdot 64 + 0 \cdot 32 + 0 \cdot 16 + 0 \cdot 8 + 1 \cdot 4 + 1 \cdot 2 + 0 \cdot 1$

$= 64 + 0 + 0 + 0 + 4 + 2 + 0 = 70_{10}$

Die Stellen nach dem Komma entsprechen folgenden negativen Potenzen von 2:

$010011_2 = 0 \cdot 2^{-1} + 1 \cdot 2^{-2} + 0 \cdot 2^{-3} + 0 \cdot 2^{-4} + 1 \cdot 2^{-5} + 1 \cdot 2^{-6}$

$= 0 \cdot 0,5 + 1 \cdot 0,25 + 0 \cdot 0,125 + 0 \cdot 0,0625 + 1 \cdot 0,03125 + 1 \cdot 0,015625$

$= 0 + 0,25 + 0 + 0 + 0,03125 + 0,015625 = 0,296875_{10}$

Daher: $1000110,010011_2 = 70,296875_{10}$

---

## 2. Umrechnung von Dezimalsystem → Binärsystem

Um eine Dezimalzahl in eine Binärzahl umzurechnen, teilen wir die Zahl wiederholt durch 2 und notieren den Rest, bis das
Ergebnis 0 ist. Die Binärzahl ergibt sich dann aus den Resten, von unten nach oben gelesen.

### a) $143_{10} $

$143 \div 2 = 71 \ \text{Rest} \ 1$

$71 \div 2 = 35 \ \text{Rest} \ 1$

$35 \div 2 = 17 \ \text{Rest} \ 1$

$17 \div 2 = 8 \ \text{Rest} \ 1$

$8 \div 2 = 4 \ \text{Rest} \ 0$

$4 \div 2 = 2 \ \text{Rest} \ 0$

$2 \div 2 = 1 \ \text{Rest} \ 0$

$1 \div 2 = 0 \ \text{Rest} \ 1$

Von unten nach oben gelesen: $143_{10} = 10001111_2 $

### b) $56_{10} $

$56 \div 2 = 28 \ \text{Rest} \ 0$

$28 \div 2 = 14 \ \text{Rest} \ 0$

$14 \div 2 = 7 \ \text{Rest} \ 0$

$7 \div 2 = 3 \ \text{Rest} \ 1$

$3 \div 2 = 1 \ \text{Rest} \ 1$

$1 \div 2 = 0 \ \text{Rest} \ 1$

Von unten nach oben gelesen: $56_{10} = 111000_2 $

### c) $226_{10} $

$226 \div 2 = 113 \ \text{Rest} \ 0$

$113 \div 2 = 56 \ \text{Rest} \ 1$

$56 \div 2 = 28 \ \text{Rest} \ 0$

$28 \div 2 = 14 \ \text{Rest} \ 0$

$14 \div 2 = 7 \ \text{Rest} \ 0$

$7 \div 2 = 3 \ \text{Rest} \ 1$

$3 \div 2 = 1 \ \text{Rest} \ 1$

$1 \div 2 = 0 \ \text{Rest} \ 1$

Von unten nach oben gelesen: $226_{10} = 11100010_2 $

### d) $315,781_{10}$

Zuerst wird die Ganzzahl $315_{10}$ in Binär umgerechnet:

$315 \div 2 = 157 \ \text{Rest} \ 1$

$157 \div 2 = 78 \ \text{Rest} \ 1$

$78 \div 2 = 39 \ \text{Rest} \ 0$

$39 \div 2 = 19 \ \text{Rest} \ 1$

$19 \div 2 = 9 \ \text{Rest} \ 1$

$9 \div 2 = 4 \ \text{Rest} \ 1$

$4 \div 2 = 2 \ \text{Rest} \ 0$

$2 \div 2 = 1 \ \text{Rest} \ 0$

$1 \div 2 = 0 \ \text{Rest} \ 1$

Von unten nach oben gelesen: $315_{10} = 100111011_2$

Jetzt wird der Dezimalteil $0,781_{10}$ in Binär umgerechnet, indem wir den Dezimalteil wiederholt mit 2 multiplizieren:

$0,781 \cdot 2 = 1,562 \ \text{(Ganzzahl)} \ 1$

$0,562 \cdot 2 = 1,124 \ \text{(Ganzzahl)} \ 1$

$0,124 \cdot 2 = 0,248 \ \text{(Ganzzahl)} \ 0$

$0,248 \cdot 2 = 0,496 \ \text{(Ganzzahl)} \ 0$

$0,496 \cdot 2 = 0,992 \ \text{(Ganzzahl)} \ 0$

$0,992 \cdot 2 = 1,984 \ \text{(Ganzzahl)} \ 1$

Von oben nach unten gelesen: $0,781_{10} \approx 0,110001_2$

Daher: $315,781_{10} \approx 100111011,110001_2$

### e) $83,8429_{10}$

Zuerst wird die Ganzzahl $83_{10}$ in Binär umgerechnet:

$83 \div 2 = 41 \ \text{Rest} \ 1$

$41 \div 2 = 20 \ \text{Rest} \ 1$

$20 \div 2 = 10 \ \text{Rest} \ 0$

$10 \div 2 = 5 \ \text{Rest} \ 0$

$5 \div 2 = 2 \ \text{Rest} \ 1$

$2 \div 2 = 1 \ \text{Rest} \ 0$

$1 \div 2 = 0 \ \text{Rest} \ 1$

Von unten nach oben gelesen: $83_{10} = 1010011_2$

Jetzt wird der Dezimalteil $0,8429_{10}$ in Binär umgerechnet:

$0,8429 \cdot 2 = 1,6858 \ \text{(Ganzzahl)} \ 1$

$0,6858 \cdot 2 = 1,3716 \ \text{(Ganzzahl)} \ 1$

$0,3716 \cdot 2 = 0,7432 \ \text{(Ganzzahl)} \ 0$

$0,7432 \cdot 2 = 1,4864 \ \text{(Ganzzahl)} \ 1$

$0,4864 \cdot 2 = 0,9728 \ \text{(Ganzzahl)} \ 0$

$0,9728 \cdot 2 = 1,9456 \ \text{(Ganzzahl)} \ 1$

Von oben nach unten gelesen: $0,8429_{10} \approx 0,110101_2$

Daher: $83,8429_{10} \approx 1010011,110101_2$
