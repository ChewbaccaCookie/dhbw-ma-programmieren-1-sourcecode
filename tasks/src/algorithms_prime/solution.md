# Lösung: Algorithmen

<div class="split">
<div>

__Eingabe:__ Ganzzahl `zahl`

__Ausgabe:__ Boolean `isPrim`

__Schritte:__

1. Setze `isPrim = true`.
1. Wenn die `zahl` kleiner oder gleich 1 ist, setze `isPrim = false` und beende das Programm.
1. Setze den Zähler `teiler` auf 2.
1. Solange `teiler` <= $\sqrt{zahl}$ ist:
    1. Überprüfe, ob `zahl modulo teiler == 0` ist.
    2. Wenn ja, setze `isPrim = false` und beende das Programm.
    3. Erhöhe `teiler` um 1.
1. Beende das Programm.

</div>
<div>
<v-click>

__Komplexität:__

Die Komplexität des beschriebenen Algorithmus zum Testen, ob eine Zahl eine Primzahl ist, beträgt $O(\sqrt{n})$, wobei $n$ die zu überprüfende Zahl ist.

</v-click>
</div>
</div>
