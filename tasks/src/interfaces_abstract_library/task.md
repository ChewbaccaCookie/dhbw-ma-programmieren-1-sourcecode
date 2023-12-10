# Aufgabe: Bibliotheksverwaltungssystem
Erstellen Sie ein einfaches Bibliotheksverwaltungssystem in Java, das verschiedene Abstraktionsebenen und die Verwendung von Interfaces demonstriert.

## Aufgabenstellung

- Erstellen Sie ein Interface `DigitalItem`, das Methoden wie `download()`, `play()`, `stream()` definiert
- Erstellen Sie ein Interface `PhysicalItem`, das Methoden wie `position()` definiert
- Erstellen Sie eine abstrakte Klasse `LibraryItem`, die die Methoden `checkOut()`, `checkIn()`, `isAvailable()` und `isDigital()` definiert
- Implementieren Sie die Klassen `Book`, `DVD` und `Magazine`, die von `LibraryItem` erben und spezifische Attribute (`titel`, `author`, `availability`) sowie Methoden für jedes Element bereitstellen. Die Klassen sollen die jeweiligen Interfaces implementieren.

---

- Erstellen Sie eine Klasse `Library`, die eine Liste von `LibraryItem`-Objekten verwaltet
- Implementieren Sie die Methoden `addItem()`, `removeItem()`, `checkOutItem()`, `checkInItem()`, um die Verwaltung der Bibliotheksobjekte zu ermöglichen
- Die `Library`-Klasse soll sicherstellen, dass mehrere Benutzer gleichzeitig Elemente ausleihen können, ohne dass es zu Problemen mit der Verfügbarkeit kommt

<br/>

- Erstellen Sie ein Interface `LibraryUser`, das Methoden wie `register()`, `borrowItem()`, und `returnItem()` für Bibliotheksbenutzer definiert.
- Implementieren Sie eine Klasse `Member`, die das `LibraryUser`-Interface implementiert und spezifische Attribute eines Bibliotheksmitglieds (`name`, `borrowHistory`) sowie Methoden für Benutzeraktionen bereitstellt.
