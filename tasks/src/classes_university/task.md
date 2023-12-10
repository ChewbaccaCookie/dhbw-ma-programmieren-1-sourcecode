# Aufgabe: Klassen und Objekte 2

Die Studenten sollen nun auch einer Universität zugeordnet werden können. Die Objekte sollen in beiden Klassen (Student und University) aufeinander verweisen können, sodass die Universität alle Studenten kennt und jeder Student seine Universität kennt.

## Aufgabenstellung

- Erstellen Sie eine Klasse `University` mit den Attributen `name`, `students`, `location` und `foundedYear`.
- Fügen Sie der Klasse `University` die Methoden `addStudent(Student student)`, `removeStudent(Student student)` and `getStudents()` hinzu.
- Fügen Sie nun der Klasse `Student` das Attribut `university` und die Methode `setUniversity(University university)` und `getUniversity()` hinzu.
- Stellen Sie sicher dass `setUniversity` aufgerufen wird sobald ein Student einer Universität hinzugefügt oder entfernt wird.

---

- Erstellen Sie eine neue Klasse `StudentManagement` mit einer `main()`-Methode. Diese soll das folgende implementieren:
    - Erstellen Sie eine Universität mit dem Namen "DHBW Mannheim" und dem Gründungsjahr 1974.
    - Erstellen Sie mindestens 3 Studenten und fügen Sie diese der Universität hinzu.
    - Geben Sie nun die Namen aller Studenten aus, die an der Universität eingeschrieben sind.

## Erweiterung

- Implementieren Sie eine toString()-Methode für die Klasse `University`, welche alle Attribute der Klasse in einem lesbaren Format zurückgibt.
- Implementieren Sie eine toString()-Methode für die Klasse `Student`, welche alle Attribute der Klasse in einem lesbaren Format zurückgibt.
- Erstellen Sie eine Klasse `Location`, welche die exakte lokaltion der Universität definiert. Diese sollte die Attribute `street`, `houseNumber`, `zipCode` und `city` besitzen. Erstellen Sie eine toString()-Methode für die Klasse `Location`, welche alle Attribute der Klasse in einem lesbaren Format zurückgibt.
