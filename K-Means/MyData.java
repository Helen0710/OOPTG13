public class MyData {

    int x;
    int y;
    MyCluster cluster;
   

    // Getter und Setter für Cluster 
    public MyCluster getCluster() {
        return cluster;
    }
    public void setCluster(MyCluster cluster) {
        this.cluster = cluster;
    }
    // Konstruktor 
    public MyData(int x, int y) {
        this.x = x;
        this.y = y;
        this.cluster = null;

    } 
    // Getter und Setter für X und Y
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    

}

   