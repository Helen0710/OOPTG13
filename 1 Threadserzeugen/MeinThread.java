/**
 * MeinThread
 */
public class MeinThread extends Thread{
    	
    //Objektvariabeln  
    int wait;
    String name;

//Konstruktor erzeugen

public MeinThread (int wait, String name )

{
        this.name = name;  //Nur nötig da es gleich heißst wie Objetkvaribalen
        this.wait = wait; 
}



    // run Methode Überschreiben


   
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
    
    
}