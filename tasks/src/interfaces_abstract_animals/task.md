# Aufgabe: Interfaces

Implementieren Sie das vorherige Beispiel der Vererbung von Tieren.

## Aufgabenstellung

- Erstellen Sie ein Interface `Flying` mit den Methoden `fly()`, `land()`, `descend()` und `ascend()`.
- Erstellen Sie ein Interface `Swimming` mit der Methode `swim()`.
- Erstellen Sie ein Interface `Walking` mit der Methode `walk()`.
- Erstellen Sie eine Interface `Bird`, welche die Interfaces `Flying` und `Walking` erweitert.
- Erstellen Sie eine Klasse `Fish`, welche das Interface `Swimming` implementiert.
- Erstellen Sie eine Klasse `Duck`, welche die Interfaces `Bird` und `Swimming` implementiert.

Jede Funktion soll eine entsprechende Ausgabe auf der Konsole erzeugen und logisch sinnvoll sein.

---

## Erweiterung

- Erstellen Sie eine abstrakte Klasse `Animal` mit den Methoden `eat()`, `sleep()` und `makeSound()` und den Attributen `name` und `species`.
- Lassen Sie die Klasse `Bird`, `Fish` und `Duck` von der Klasse `Animal` erben.
