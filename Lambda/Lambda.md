## Lambda

Zuerst braucht man eine Functional Interface. Dieses muss `genau`
eine Methode enthalten. 
````` java
Interface Tier 
{
    void machetwas();
}
``````

In der Hauptklasse kann man nun mit der Lambda Notation ein Objekt von diesem Interface erzeugen. Nur geschieht dies in einer verkürzten schreibweise. 
````` java
public static void main (String[] args)
{
    Tier elefant = () -> " Töörö"; 
    elefant.machetwas();
}

``````
Bei diesem Beispiel haben ja oben in dem funktional Interface ein Methode ohne Übergabeparameter oder Rückgabewert. Das bedeutet das wir das in der Hauptklasse dann auch nicht berücksichtigen müssen. 
Mann kann jetzt mit dieser Initialisierung die Methode des Interfaces mit dem name des Objektes aufrufen. 

### Lambda mit Rückgabewert 

````` java
Interface Berechne  
{
    int berechne(int a, int b); 
}
``````
Hier haben wir nun Übergabeparameter in der Methode des Interface 
````` java
public static void main (String[] args)
{
    berechne addiere = (a,b) ->  a+b

    int ergebniss = addiere.berechne(5,3); 

    system.out.println("Ergebniss:"+ ergebniss); 
}

``````
Hier haben wir nun das Interface Berechne mit einer Methode berechne. Diese enthält nun zwei Parameter a und b. Diese Müssen dann auch in der ausführbaren Klasse in den Klammern der Zuweisung aufgeführt werden. dann wird definiert was in der Methode berechne() gemachtwerden soll. In dem Fall sollen die Werte aus a und b addiert werden. 
Darunter wird der Variabel ergebniss der Wert der Berechnung von den Werten 5,3 zugeordnet. 

Zum Schluss wird das ganze noch ausgegeben. 