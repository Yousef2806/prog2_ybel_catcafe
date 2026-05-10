# Blatt 02 – Git Branches, JUnit Basics und CI-Pipeline

Repository:
https://github.com/Yousef2806/prog2_ybel_catcafe

## Git-Spiel

In dieser Aufgabe wurden verschiedene Merge-Situationen mit Git getestet.

### Experiment 1
Eine Datei wurde nur im master-Branch geändert. Der Merge konnte ohne Konflikt durchgeführt werden.

### Experiment 2
Eine Datei wurde in beiden Branches verändert. Beim Merge entstand ein Konflikt, der manuell gelöst wurde.

### Experiment 3
Es wurde dieselbe Stelle verändert.

- Bei identischer Änderung entstand kein Konflikt.
- Bei unterschiedlicher Änderung entstand ein Merge-Konflikt.

### Experiment 4
Der Branch end wurde zuerst auf den aktuellen Stand von master gesetzt. Danach verlief der Merge einfacher.

## Gradle

Für das Projekt wurde eine Gradle-Konfiguration erstellt.

Folgende Funktionen wurden eingerichtet:

- gradle run
- gradle test
- gradle spotlessCheck

Zusätzlich wurden JUnit 6 und Spotless eingebunden.

## JUnit

Es wurden mindestens 10 unterschiedliche Testfälle für die Klasse CatCafe erstellt.

Getestet wurden unter anderem:

- Hinzufügen von Katzen
- Anzahl der Katzen
- Suche nach Namen
- Suche nach Gewicht
- Nullwerte
- Grenzfälle

Die Testmethoden wurden mit sinnvollen Namen erstellt und nach dem Muster given-when-then aufgebaut.

## CI-Pipeline

Mit GitHub Actions wurde eine einfache CI-Pipeline erstellt.

Bei jedem Push auf den Hauptbranch werden automatisch:

1. das Projekt gebaut,
2. die JUnit-Tests ausgeführt,
3. die Formatierung überprüft.

