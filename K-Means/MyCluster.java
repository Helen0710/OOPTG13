import java.util.ArrayList;

class MyCluster {
    
    int x;
    int y;
    String name;

    // Konstruktor MyCluster 
    public MyCluster(int x, int y,String name )
    {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    ArrayList <String> dataObjekt = new ArrayList<String>();

   

}