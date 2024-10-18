void main() {
    // Variablen für Rechteck, Kreis, Kugel, Kegel und Zylinder
    double length = 5;
    double width = 10;
    double radius = 6;
    double height = 12;  // Höhe für Kegel und Zylinder
    final double PI = Math.PI;  // Verwende die konstante PI aus der Java Math Bibliothek

    // Flächenberechnung für Rechteck und Kreis
    double areaRectangle = length * width;
    double areaCircle = radius * radius * PI;

    System.out.println("Fläche Rechteck = " + areaRectangle);
    System.out.println("Fläche Kreis = " + areaCircle);

    // Prozentualer Unterschied der Flächen
    double areaRatio = (areaCircle / areaRectangle) * 100;
    System.out.println("Verhältnis Kreis zu Rechteck = " + areaRatio + "%");
    
    // Volumenberechnungen
    double volumeSphere = (4.0 / 3.0) * PI * Math.pow(radius, 3);  // Volumen der Kugel
    double volumeCone = (1.0 / 3.0) * PI * Math.pow(radius, 2) * height;  // Volumen des Kegels
    double volumeCylinder = PI * Math.pow(radius, 2) * height;  // Volumen des Zylinders

    System.out.println("Volumen der Kugel = " + volumeSphere);
    System.out.println("Volumen des Kegels = " + volumeCone);
    System.out.println("Volumen des Zylinders = " + volumeCylinder);

    // Prozentualer Vergleich des Kugelvolumens mit Kegel und Zylinder
    double sphereConeRatio = (volumeCone / volumeSphere) * 100;
    double sphereCylinderRatio = (volumeCylinder / volumeSphere) * 100;

    System.out.println("Verhältnis Kugel zu Kegel = " + sphereConeRatio + "%");
    System.out.println("Verhältnis Kugel zu Zylinder = " + sphereCylinderRatio + "%");

    // Umfangsberechnungen
    double circumferenceCircle = 2 * PI * radius;  // Umfang des Kreises
    double circumferenceRectangle = 2 * (length + width);  // Umfang des Rechtecks

    System.out.println("Umfang des Kreises = " + circumferenceCircle);
    System.out.println("Umfang des Rechtecks = " + circumferenceRectangle);

    // Flächenberechnungen für Kugel, Kegel und Zylinder (Oberfläche)
    double surfaceAreaSphere = 4 * PI * Math.pow(radius, 2);  // Oberfläche der Kugel
    double surfaceAreaCylinder = 2 * PI * radius * (radius + height);  // Oberfläche des Zylinders
    double surfaceAreaCone = PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));  // Oberfläche des Kegels

    System.out.println("Oberfläche der Kugel = " + surfaceAreaSphere);
    System.out.println("Oberfläche des Zylinders = " + surfaceAreaCylinder);
    System.out.println("Oberfläche des Kegels = " + surfaceAreaCone);
}