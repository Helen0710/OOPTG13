# K-Nearest-Neighbor

Als erstes müssen wir die Klasse DataObject erstellen. In diesem legen wir fest, dass ein Object einen x,y und Klassen Wert hat. 

````java
    int x;
	int y;
	int klasse;
	
	public DataObject(int x, int y)
	{
		this.x = x;
		this.y = y;
		
	}
	
	public DataObject(int x, int y, int klasse)
	{
		this.x = x;
		this.y = y;
		this.klasse = klasse;
	}
````

Als nächstes benötigen wir eine Main Methode. In dieser implementieren wir die verschieden Klassen und fügen Objekte hinzu. 

```` java
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

````
Dann benötigen wir eine Methode die den Abstand zu den anderen Objekten ermittelt. Das machen wir mithilfe des Euklidischen Abstand. Dieser ist einfach der Satz des Phytagoras -> c = wurzel aus a^2 +b^2 ......

```` java
    public static double distance (DataObject o, DataObject ref)
    {
        return ((o.x - ref.x) * (o.x - ref.x) + (o.y - ref.y) * (o.y - ref.y));
    }

````

