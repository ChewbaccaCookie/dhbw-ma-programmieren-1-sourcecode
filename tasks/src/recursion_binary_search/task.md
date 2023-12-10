# Aufgabe: Rekursion 3

Schreiben Sie eine Java-Methode, die eine rekursive binäre Suche in einem Array durchführt, um ein bestimmtes Element zu finden.

## Aufgabenstellung

- Schreiben Sie eine rekursive Methode mit dem Namen `recursiveBinarySearch`, die ein sortiertes Array, das zu suchende Element, den linken Index und den rechten Index als Parameter akzeptiert.

- Implementieren Sie die rekursive binäre Suchlogik, die die Mitte des aktuellen Suchbereichs berechnet und das gesuchte Element mit dem Element in der Mitte vergleicht.

- Je nach Vergleichsergebnis teilen Sie den Suchbereich weiter auf, indem Sie den linken oder rechten Index entsprechend anpassen und die Methode erneut aufrufen.

- Beenden Sie die Rekursion, wenn das gesuchte Element gefunden wird oder der Suchbereich nicht weiter aufgeteilt werden kann (der linke Index ist größer als der rechte Index).