## Sets in Java


````` java
Set<Integer> data = new LinkedHashSet<Integer>(); 
````````
Diese Zeile benötigt man um ein Set in java zu erstellen.

Im Anschluss kann man mit der Methode add Werte in dieses Set hinzufügen.

```` java
data.add(2); 
data.add(7);
data.add(8);
````
Ausgegeben wird das ganze mit einem SystemOutPrint. 

```` java
System.out.println(data);
````

Ein andere Weg um Werte in ein Set einzufügen, wäre folgender: 

````java 
Integer[] A = {22, 45,33, 66, 55, 34, 77};  
Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
Set<Integer> set1 = new HashSet<Integer>();    
set1.addAll(Arrays.asList(A));    
Set<Integer> set2 = new HashSet<Integer>();    
set2.addAll(Arrays.asList(B));   
````

Hier erstellt man zuerst 2 Arrays die man dann dem Set hinzufügt. Durch diesen Schritt ersparrt man sich dass ständig adden von Daten und kann mit weniger Code Werte in ein Set hinzufügen.

## Funktionen eines Sets

### Differenz 
```` java
Set<Integer> difference_data = new HashSet<Integer>(set1);    
difference_data.removeAll(set2);    
System.out.print("Difference of set1 and set2 is:");    
System.out.println(difference_data);    
````
Hier wird die Differenz der beiden oben implementieren Sets ausgegeben, dass bedeutet die Werte die nur in einem der beiden Sets enthalten sind. 

### Schnittmenge 
```` java
Set<Integer> intersection_data = new HashSet<Integer>(set1);    
intersection_data.retainAll(set2);    
System.out.print("Intersection of set1 and set2 is:");    
System.out.println(intersection_data);    
````
In diesem Beispiel wird die Schnittmenge der beiden Sets gefunden, dass bedeutet es gibt die Werte aus, die sowohl in set1 als auch in set2 enthalten sind. 

### Vereinigung 

```` java
Set<Integer> union_data = new HashSet<Integer>(set1);    
union_data.addAll(set2);    
System.out.print("Union of set1 and set2 is:");    
System.out.println(union_data); 
````

Hier werden einfach alle Werte der beiden Sets in einem gemeinsamen Set ausgegeben. 

### Abfragen ob Werte in einem Set enthalten sind 

```` java
System.out.println("Does the Set contains '91'?" + data.contains(91));   
System.out.println("Does the Set contains '7'? " + data.contains(7));  
System.out.println("Does the Set contains '8'? " + data.contains(8));  
````
Hier wird ermittelt ob Werte in einem Set enthalten sind die Ausgabe sind dann wiefolgt aus. 

`````
Does the Set contains '91'?false
Does the Set contains '7'? true
Does the Set contains '8'? true
`````

