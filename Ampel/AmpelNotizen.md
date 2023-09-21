# Ampelaufgabe 


## Aufgabenstellung

### Zustände
Die Nummerierung wird asl Zustandsvariabel umgesetzt (Konstante). 
Der Wechsel der Zustände wird über das switch-While Idiom gelöst. Jede Ampel 
läuft in einem nebenläufigen Thread mit Interface Runnable . 


1. Rot 
2. Rot/Gelb
3. Grün 
4. Gelb


## Benötigte Klassen 

- ausführbare Klasse `AmpelStartklasse.java`
- Klasse `Ampel.java`

## Ampelbeschreibung 

- nach Starten einer Ampel ist der Zustand rot.
- wait definiert die Wartezeit der Zustände. 

## Testszenario 

- Es werden 2 Ampeln gestartet 
- Es erfolgt die Ausgabe des Namens der Ampel mit zugehörigen Zustand. 
- Eine gestartete Ampel läuft endlos weiter 

