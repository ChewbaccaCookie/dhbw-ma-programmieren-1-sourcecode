# Aufgabe: Exceptions

Passen Sie die Aufgabe: **Vererbung - Bank** so an, dass eine ÌnsufficientFundsException geworfen wird, wenn ein Konto überzogen wird.

## Aufgabenstellung

- Erstellen Sie eine Klasse `InsufficientFundsException`, die von `Exception` erbt. Diese soll die Menge des fehlenden Geldes speichern. Implementieren Sie einen Konstruktor, der diese Menge als Parameter erhält und in der Error Message ausgibt.
- Passen Sie die Klasse `Account` so an, dass eine `InsufficientFundsException` geworfen wird, wenn ein Konto überzogen wird.
- Passen Sie die `main`-Methode in `Bank` so an, dass die Exception behandelt wird. Geben Sie eine passende Fehlermeldung aus, wenn ein Konto überzogen wird.

---

## Erweiterung

- Implementieren Sie eine Methode `transfer` in der Klasse `Account`, die einen Betrag von einem Konto auf ein anderes überweist. Werfen Sie eine `InsufficientFundsException`, wenn das Konto nicht genügend Geld hat.
- Lassen Sie die `main`-Methode in `Bank` ein Konto überziehen und eine Überweisung durchführen. Behandeln Sie die Exceptions.
- Implementieren Sie in der Methode `payOut` einen Zufallsgenerator (`Math.random()`), der zufällig eine `SystemException` wirft (z.B. bei einer Zahl kleiner 0.2). Diese Implementierung simuliert einen Systemfehler, der zufällig auftritt.
- Damit der Kunden von einem Systemfehler nichts mitbekommt soll diese Exception behandelt werden und automatisch ein neuer Versuch (bis zu 3 Versuche)  gestartet werden. Wenn der dritte Versuch fehlschlägt, soll eine `SystemException` geworfen werden, die nicht behandelt wird.
- Passen Sie die `main`-Methode so an, sodass die `SystemException` behandelt wird.

