import java.util.ArrayList;
import java.util.List;
public class Cluster {
    
    String name;
    double mean;
    List <Integer> data;

    public Cluster(String name, int mean)
    {
        this.mean = mean;
        this.name = name;
        data = new ArrayList<>();
    }

    
    public void removeAll()

    {
      data.clear();
    }

    public void addValue(int value)
    {
        data.add(value);
    }
    public double getMean()
    {
        return mean;
    }

    public boolean calcMean()
    {
        boolean isNewMean;
        double sum =0; //Damit sicher gestellt wird das da am anfang keine flaschen Werte dring stehen 
        double newMean;

      for (var i = 0; i < data.size(); i++) {
          
        sum = sum +data.get(i); 

        /*
        In der Summme wird immer der Wert gespeichert, der aus dem Array Data geholt wird 
        dieser wird dann durch das plus sum mit den anderen Werten addiert 
        Beispiel 

        Erster Wert 3 + 0 <- Das ist der anfangsWert der in sum drin steht
        Danach: 
        Zweiter Wert 4 + 3 <- Da jetzt 3 in sum gespeichert ist 
        Dritter Wert 13 + 7
         */
          
      } // Ende For Schleife 

      newMean = sum /data.size();
      // Hier wird die Summer aller Werte durch die Anzahl der Werte geteilt um den Mittelwert zu erhalten 


      if (newMean != mean)
      {
        mean = newMean;
        isNewMean = true; 
      }
      else
      {
        isNewMean = false;
      }

      /*
        Hier wird überprüft ob der neue Mittelwert gleich der alte Mittelwert ist. 
        Wenn das der Fall ist springt er in den else Zweig und setzt die boolean Variabel 
        auf false. Damit springt er aus der ganzen Methode raus. Wenn die Werte noch nicht 
        gleich sind setzt es die Boolean Variabel wieder auf true und der Algorithmus macht weiter

       */
        
    } // Ende getMean()

    public String toString(){
        return "\t" +name + "mean" +mean + "\t" +data.toString() + "\n";
    }

}

