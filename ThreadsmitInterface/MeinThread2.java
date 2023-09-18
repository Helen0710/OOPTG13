package ThreadsmitInterface;

public class MeinThread2 implements Runnable {
    
    Thread t; 
    String name;
    int wait; 


    MeinThread2(String name, int wait)

    {
        this.name = name;
        this.wait = wait;
        t = new Thread(this);

    }


    @Override
    public void run() {
        System.out.println("Name" +name+ "gestartet");
        for (int i = 1; i < 100; i++) {
            System.out.println(name + ";" +i);

            try {
                Thread.sleep(wait);  //Wartezeit 
            } catch (Exception e) {
                e.printStackTrace(); //Normale Exception Ausgabe auf der Konsole 
            }
        }
    }


    public void start() {

        t.start();
    }



}
