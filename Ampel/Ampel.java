package Ampel;

public class Ampel implements Runnable {
    //Objektvariablen 
    private String name;
    private int wait = 0;
    private int aktZustand;
    private Thread thread;

    //Konstanten 
    public static final int ROT = 0;
    public static final int ROTGELB= 1;
    public static final int GRUEN = 2;
    public static final int GELB = 3;
    private String [] farben = {"Rot ", "RotGelb", "Gruen", "Gelb"};

    // Konstruktor

    public Ampel(String name, int wait) {
        this.name = name;
        this.wait = wait;
        thread = new Thread(this);
        wechsleZustandZu(ROT);

    }

    // Threadverwaltung

    public void start() {
        thread.start();
    }

    // Warte Zeit
    public void warte() {
       try {
        Thread.sleep(wait);
    } catch (InterruptedException e) {
        
        e.printStackTrace();
    }

    }

    @Override
    public void run() {

        while (true)
        {
            switch (aktZustand) {
                case ROT:
                    warte();
                    wechsleZustandZu(ROTGELB);
                    break;
                case ROTGELB: 
                    warte();
                    wechsleZustandZu(GRUEN);
                    break;
                case GRUEN:
                    warte();
                    wechsleZustandZu(GELB);
                    break;
                case GELB: 
                    warte();
                    wechsleZustandZu(ROT);
                    break;
        } // Ende While 

    }
      
    } // Ende Run 

    private void wechsleZustandZu(int folgeZustand) {
        aktZustand = folgeZustand;
        System.out.println(toString());

    }

    public String toString()
    {
        return name + ": " +farben[aktZustand];
    }

}