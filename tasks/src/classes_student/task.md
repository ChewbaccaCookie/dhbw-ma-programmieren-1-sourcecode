# Aufgabe: Klassen und Objekte 1

Entwickeln Sie eine Klasse `Student`, welche eine Abbildung von Studenten darstellt.

Erstellen sie die Klasse `Student` mit folgenden Attributen und Methoden. Erstellen Sie dann in der `main()`-Methode mindestens drei Studenten und initialisieren Sie die Attribute mit Werten Ihrer Wahl. Geben Sie die Studenten-Informationen mit der `printInfo()`-Methode aus.

**Attribute:**

- `firstName`
- `lastName`
- `studentId`
- `semester`
- `age`

**Methoden:**

- `getFullName()`: Gibt den vollen Namen des Studenten zurück
- `printInfo()`: Gibt alle Attribute des Objekts in einem lesbaren Format aus

---

## Erweiterung

Erweitern Sie die Klasse um die folgenden Funktionen:

- Fügen Sie die Funktion `equals(Student student)` hinzu, welche zwei Studenten vergleicht
- Fügen Sie die Funktion `clone()` hinzu, welche eine Kopie des Studenten zurückgibt
- Speichern Sie zu jedem Studenten den vorherig erstellten Studenten in einem Attribut `PREVIOUS_STUDENT`.
- Fügen Sie eine statische Methode `getAverageAge()` hinzu, welche den Durchschnitt des Alters aller bereits erstellten Studenten zurückgibt.
