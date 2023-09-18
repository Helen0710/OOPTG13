# Thread erzeugen 
## Aufgabe

1. Erzeugen sie in Java die Datein `ErzeugeThreads.java` und `MeinThread.java`
2. Fügen sie eine Main Methode in die Klasse `ErzeugeThreads.java`
```` java
    public class ErzThread {
        public static void main (String[] args){

        }
    }
````
3. Die Klasse `MeinThread` soll von der Klasse `Thread` erben 
````java
    public MeinThread extends Tread {...}
````
4. Beim Erzeugen des Threads soll die Wartezeit udn der Name festgelegt sein.  -> Konstruktor mit Übergabeparameter 
```` java
    
public MeinThread (int wait, String name )

{
        this.name = name;  //Nur nötig da es gleich heißst wie Objetkvaribalen
        this.wait = wait; 
}
````
5. Jeder Thread hat einen Namen und zählt von 1-100 und gibt diese Werte nebenläufig auf der Konsole aus 
```` java
    @Override
    public void run()
    {   System.out.println("Name" +name+ "gestartet");
        for (int i = 1; i < 100; i++) {
            System.out.println(name + ";" +i);

            try {
                Thread.sleep(wait);  //Wartezeit 
            } catch (Exception e) {
                e.printStackTrace(); //Normale Exception Ausgabe auf der Konsole 
            }
        }
    }
````
6. Erweitern sie die Thread Klasse und testen Sie 2 Threads mit 30 und 100 ms Wartezeit 

```` java
````

7. Zeigen sie das der Main Thread vor den ZählThreads zuende ist obwohl er zuerst gestartet wird 
