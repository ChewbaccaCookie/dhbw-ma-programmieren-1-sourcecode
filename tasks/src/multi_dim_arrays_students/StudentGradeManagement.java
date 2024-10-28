void main() {
    String[] students = {"Alice", "Bob", "Charlie", "David", "Eve"};

    double[][] studentGrades = {
            {1.5, 2.2, 1.3},
            {3.3, 2.8, 3.0},
            {1.7, 2.5, 3.8},
            {2.0, 3.2, 3.5},
            {2.7, 1.6, 3.2}
    };

    String[] subjects = {"Programmieren-1", "Einführung in die IT", "Vertragsrecht"};

    if (students.length != studentGrades.length) {
        System.out.println("Anzahl der Stunden und der Noten stimmen nicht überein.");
        return;
    }

    double[] studentAverages = new double[students.length];
    for (int i = 0; i < studentGrades.length; i++) {
        for (int j = 0; j < studentGrades[i].length; j++) {
            studentAverages[i] += studentGrades[i][j];
        }
        studentAverages[i] /= studentGrades[i].length;
    }

    System.out.println("Durchschnitt pro Student:");
    for (int i = 0; i < students.length; i++) {
        System.out.println(students[i] + ": " + studentAverages[i]);
    }

    double[] subjectAverages = new double[studentGrades[0].length];
    for (int i = 0; i < studentGrades[0].length; i++) {
        for (int j = 0; j < studentGrades.length; j++) {
            subjectAverages[i] += studentGrades[j][i];
        }
        subjectAverages[i] /= studentGrades.length;
    }

    System.out.println("Durchschnitt pro Fach:");
    for (int i = 0; i < subjects.length; i++) {
        System.out.println(subjects[i] + ": " + subjectAverages[i]);
    }

    // Da die durchschnittswerte bereits berechnet wurden => Sortieren der Liste
    String[] sortedStudents = students.clone();
    double[] sortedStudentAverages = studentAverages.clone();
    for (int i = 0; i < sortedStudentAverages.length; i++) {
        for (int j = 0; j < sortedStudentAverages.length - i - 1; j++) {
            if (sortedStudentAverages[j] > sortedStudentAverages[j + 1]) {
                double averageTmp = sortedStudentAverages[j];
                String studentTmp = sortedStudents[j];
                sortedStudentAverages[j] = sortedStudentAverages[j + 1];
                sortedStudents[j] = sortedStudents[j + 1];
                sortedStudentAverages[j + 1] = averageTmp;
                sortedStudents[j + 1] = studentTmp;
            }
        }
    }

    System.out.println("Beste Person: " + sortedStudents[0] + " (" + sortedStudentAverages[0] + ")");
    System.out.println(
            "Schlechteste Person: " +
                    sortedStudents[sortedStudents.length - 1] +
                    " (" +
                    sortedStudentAverages[sortedStudentAverages.length - 1] +
                    ")"
    );
}
