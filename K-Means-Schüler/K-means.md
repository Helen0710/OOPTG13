## K-Means Algorithmus 

1. Als ersten Schritt braucht man 2 Klassen. Eine Klasse Cluster und eine Klasse in der sich auch später der ausführbare Code befindet. 

### Cluster

In der Klasse Cluster erstellen wir 2 Variabeln: name, means. Anschließend erzeugen wir einen Konstruktor in dem diese beiden Variabeln übergeben werden. 

```` java
    String name;
    double mean;
    List <Integer> data;

    public Cluster(String name, int mean)
    {
        this.mean = mean;
        this.name = name;
        data = new ArrayList<>();
    }
````

Danach benötigen wir verschiedene Methoden. In der ersten Methode werden dem Cluster Werte zugeordnet. 

```` java 
````