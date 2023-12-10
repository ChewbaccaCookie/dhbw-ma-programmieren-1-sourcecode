# Aufgabe: Rekursion 2

Schreiben Sie eine Java-Methode, die eine positive ganze Zahl $x$ und eine nicht-negative ganze Zahl $n$ als Parameter akzeptiert und die Potenz $x^n$ mithilfe von Rekursion berechnet. Vermeiden Sie die Verwendung von Schleifen oder eingebauten Potenzfunktionen.

## Aufgabenstellung

- Schreiben Sie eine rekursive Methode mit dem Namen `calculatePower`, die $x$ und $n$ als Parameter akzeptiert und $x^n$ berechnet.

- Behandeln Sie den Basisfall: Wenn $n$ gleich 0 ist, sollte die Methode 1 zurückgeben, da jede Zahl zur Potenz 0 gleich 1 ist.

- In anderen Fällen sollte die Methode die Potenz $x^n$ rekursiv berechnen, indem sie x mit $x^{n-1}$ multipliziert.

- Schreiben Sie ein Hauptprogramm, um Ihre Methode zu testen. Rufen Sie die Methode für verschiedene Werte von $x$ und $n$ auf und geben Sie das Ergebnis aus.
