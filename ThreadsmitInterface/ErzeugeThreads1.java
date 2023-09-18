package  ThreadsmitInterface;

public class ErzeugeThreads1 {
    
    
    public static void main(String[] args) {
        System.out.println("Erzeuge Thread gestartet");
        
        MeinThread2 a = new MeinThread2 ("a",30 );
        MeinThread2 b = new MeinThread2 ("b", 30);
        ;


        // Thread starten 

        a.start();
        b.start();

        System.out.println("Thread zuende");


    }
}
