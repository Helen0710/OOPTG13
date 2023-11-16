/**
 * ErzeugeThreads
 */
public class ErzeugeThreads {

    public  static void main(String[] args){
        System.out.println("Erzeuge Thread gestartet");
        
        MeinThread a = new MeinThread (30,"a" );
        MeinThread b = new MeinThread(100, "b");


        // Thread starten 

        a.start();
        b.start();

        System.out.println("Thread zuende");


    }
}