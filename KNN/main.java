
import java.util.ArrayList;

public class main {
	public static int k = 5;

	public static void main(String[] args) {
		ArrayList<DataObject> objs = new ArrayList<DataObject>();
		
        objs.add(new DataObject(72, 20, 0)); // Kreis
        objs.add(new DataObject(75,25, 1));
        objs.add(new DataObject(77, 11, 1)); // Kreuz
        objs.add(new DataObject(77, 7, 2)); // Dreieck 
        objs.add(new DataObject(80, 17, 1));
        objs.add(new DataObject(84, 10, 2));
        objs.add(new DataObject(85, 14, 2));
        objs.add(new DataObject(88, 15, 1));
        objs.add(new DataObject(88, 9, 2));
        objs.add(new DataObject(89, 12, 0));
        objs.add(new DataObject(91, 3, 2));
        objs.add(new DataObject(92, 10, 2));
        objs.add(new DataObject(93, 17, 2));
        objs.add(new DataObject(94, 6, 0));
        objs.add(new DataObject(96, 3, 0));
        objs.add(new DataObject(97, 2, 0));
        

		DataObject o = new DataObject(100, 0);

		System.out.println(kNN(o, objs));
	}

	public static int kNN(DataObject o, ArrayList<DataObject> objs) {
		int[] indices = new int[k];
		double[] mins = new double[k];
		for (int i = 0; i < k; i++) {
			mins[i] = Double.MAX_VALUE;
		}

		for (int i = 0; i < objs.size(); i++) {
			double dist = distance(o, objs.get(i));
			double max = Double.MIN_VALUE;
			int maxIdx = 0;
			for (int j = 0; j < k; j++) {
				if (max < mins[j]) {
					max = mins[j];
					maxIdx = j;
				}
			}
			if (mins[maxIdx] > dist) {
				mins[maxIdx] = dist;
				indices[maxIdx] = i;
			}
		}

		int a = 0;
		int b = 0;
        int c = 0;
		for (int i = 0; i < k; i++) {
			if (objs.get(indices[i]).klasse == 0) {
				a++;
			} if (objs.get(indices[i]).klasse == 1) {
                b++;
            } 
            else {
                c++;
            }
				
			
		}
		if (a > b && a> c) {
			return 0;
		} 
        if (b > c && b>a) 
        {
			return 1; 
		}
        else{
            return 2;
        }

        
	}

	public static double distance(DataObject o, DataObject ref) {
		return Math.sqrt(o.x - ref.x) * (o.x - ref.x) + (o.y - ref.y) * (o.y - ref.y);
	}
}

