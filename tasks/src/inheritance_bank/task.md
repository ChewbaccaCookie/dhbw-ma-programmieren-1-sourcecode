# Aufgabe: Vererbung - Bank

- Implementieren Sie die Klassen `Konto`, `Girokonto`, `Sparkonto`, `Tagesgeld` und `Festgeld`.

- Die Klasse `Konto` soll mindestens die Attribute `nummer`, `name` und `saldo` sowie die Methoden `printInfo`, `payIn` und `payOut` besitzen.

- Die Klassen `Girokonto` und `Sparkonto` erben von `Konto`.

- Die Klassen `Tagesgeld` und `Festgeld` erben von `Sparkonto`

- Geben Sie den anderen Klassen entsprechende Attribute und Methoden, die zum jeweiligen Kontotyp passen.

- Achten Sie darauf, ob Methoden für einen Kontotypen eine geänderte Implementierung brauchen.

- Erstellen Sie in der `main`-Methode 10 verschiedene Objekte und geben Sie mittels der `printInfo`-Methode die Objekte aus.

---

## Erweiterung

1. Implementieren Sie zusätzlich die Klasse `Bank`, welche Konten Verwalten kann. Überlegen Sie sich geeignete Methoden und Attribute.

2. Fügen Sie der Bank eine Methode pro Kontotyp hinzu, die ausschließlich die Konten des jeweiligen Typen in der Konsole ausgibt.
