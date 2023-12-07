
import java.util.*;

public class main
{
    public int k = 5; // Anzahl der bestimmenden Nachbarn 

    public static void main(String[] args) {

        ArrayList<DataObject> objs = new ArrayList<DataObject>();

        objs.add(new DataObject(5, 1, 0));
		objs.add(new DataObject(6, 1, 0));
		objs.add(new DataObject(5, 2, 0));
		objs.add(new DataObject(6, 2, 0));
		objs.add(new DataObject(7, 1, 0));
		objs.add(new DataObject(0, 4, 1));
		objs.add(new DataObject(1, 4, 1));
		objs.add(new DataObject(0, 5, 1));
		objs.add(new DataObject(1, 5, 1));

        //Dieses Element soll untersucht werden, ob es 1 oder 0 ist
		DataObject o = new DataObject(2, 3);  


        
    }


    public static int knn (DataObject o, ArrayList<DataObject> objs)
    {

    }

    public static double distance (DataObject o, DataObject ref)
    {
        return ((o.x - ref.x) * (o.x - ref.x) + (o.y - ref.y) * (o.y - ref.y));
    }
}