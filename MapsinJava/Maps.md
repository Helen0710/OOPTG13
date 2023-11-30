# Maps in Java

Man kann eine Map in java Nutzen um zum Beispiel ein Wörterbuch zu programmieren. Das besondere an einer Map ist, dass man selber einen Schlüssel wählen darf. Dieser darf hier auch ein String sein. Aber Achtung bei der Wahl des Schlüsse! Der Schlüssel muss immer eindeutig sein er darf also nicht doppelt vorkommen. 

### Einfaches Beispiel für eine Map in java 
```` java
// Java Program to Demonstrate 
// Working of Map interface 
  
// Importing required classes 
import java.util.*; 
  
// Main class 
class GFG { 
  
    // Main driver method 
    public static void main(String args[]) 
    { 
        // Creating an empty HashMap 
        Map<String, Integer> hm 
            = new HashMap<String, Integer>(); 
  
        // Inserting pairs in above Map 
        // using put() method 
        hm.put("a", new Integer(100)); 
        hm.put("b", new Integer(200)); 
        hm.put("c", new Integer(300)); 
        hm.put("d", new Integer(400)); 
  
        // Traversing through Map using for-each loop 
        for (Map.Entry<String, Integer> me : 
             hm.entrySet()) { 
  
            // Printing keys 
            System.out.print(me.getKey() + ":"); 
            System.out.println(me.getValue()); 
        } 
    } 
}
````

In diesem Beispiel wir als aller erstes mit dem "import java.util.*;" alles nötige importiert.
Im Anschluss beginnt die eigentliche Programmierung. 
Als erstes erzeugt man eine leere Map. Diese kann 2 oder mehr Datentypen enthalten. Dabei ist der erste immer der Key nach dem man dann die Liste durchsuchen kann. 
Im Anschluss daran kann man der Map etwas hinzufügen mit dem Befehl
name.put()

Um eine Map zu iterieren benötigt man folgenden Befehl: 

````java
 for (Map.Entry<String, Integer> me : 
             hm.entrySet()) { 
  
````
Um ein Element in einer Liste zu ersetzen benötigt man folgenden Code: 

```` java
            System.out.println("Initial Map " + hm); 

            // Ein Element in der Liste ersetzen  
  
            hm.put(2, "For"); 
  
            System.out.println("Updated Map " + hm);

````

Um ein Element aus der Map zu löschen beöntigt man den Befehl: 

```` java
            // Ein Element aus einer Liste löschen 

             hm.remove((4)); 

             System.out.println(hm);

`````

Mit diesem Befehl wird der Wert aus dem 4 Element gelöscht 

Um ein Array in eine Map einzufügen benötigt man folgenden Code: 

```` java
  int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 }; 
  
        // put all elements in arraylist 
        ArrayList<Integer> aa = new ArrayList(); 
        for (int i = 0; i < a.length; i++) { 
            aa.add(a[i]); 
        } 
  
        HashMap<Integer, Integer> h = new HashMap(); 
  
        // counting occurrence of numbers 
        for (int i = 0; i < aa.size(); i++) { 
            h.putIfAbsent(aa.get(i), Collections.frequency(aa, aa.get(i))); 
        } 
        System.out.println(h); 
````



