package static_variables;

public class Person {
    // Statische Variablen
    public static int count = 0;
    public static double averageAge = 0.0;

    // Statische Methode, um eine neue Person hinzuzufügen und den Durchschnitt zu aktualisieren
    public static void addPerson(String name, int age) {
        count++;  // Inkrementiere die Anzahl der erstellten Personen
        averageAge = (averageAge * (count - 1) + age) / count; // Aktualisiere den Durchschnitt
    }

    // Statische Methode, um den aktuellen Durchschnitt des Alters zurückzugeben
    public static double getAverageAge() {
        return averageAge;
    }

    public static void main(String[] args) {
        // Fügen Sie mindestens drei Personen hinzu
        addPerson("Alice", 25);
        addPerson("Bob", 30);
        addPerson("Charlie", 35);

        // Rufen Sie die `getAverageAge`-Methode auf, um den Durchschnitt des Alters auszugeben
        System.out.println("Durchschnittsalter: " + getAverageAge());

        // Geben Sie die Gesamtanzahl der erstellten Personen aus
        System.out.println("Gesamtanzahl der Personen: " + count);
    }
}

