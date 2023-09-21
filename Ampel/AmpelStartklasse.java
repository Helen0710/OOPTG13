package Ampel;

public class AmpelStartklasse {

    public static void main (String[] args)

    {
        Ampel a1 = new Ampel("A", 1000);
        Ampel b1 = new Ampel("B", 2000);

        a1.start();
        b1.start();
    }
    
}
