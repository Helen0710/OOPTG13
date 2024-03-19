# Funktionalte Interfaces
## Eigenschaften
- lässt sich sehr gut paralelisieren -> effizientere Nutzung der Rechenkerne
- lässt sich sehr gut lesen 
- man kann nur eine Funktion pro Interface deklarieren

## Erstellen einer eigenen Funktion
````java
    Mathe mult = (a,b) -> a*b;

    System.out.println(mult.fkt(5,3)) // gibt 15 aus

    public interface Mathe {
        double fkt(double a, double b);
    }
````

## Beispiel von gegebenen Klassen
### Function Klasse
````java
Function<Integer, Integer> addTwo = number -> number + 2;
        Function<Integer, Integer> multThree = number -> number * 3;

        //erst addTwo dannach multThree
        int result = addTwo.andThen(multThree).apply(4);
        System.out.println(result);

        //erst multThree dannach addTwo
        int result2 = addTwo.compose(multThree).apply(4);
        System.out.println(result2);
````

## Consumer Klasse
````java
    List<String> students = List.of("Peter", "Paul", "Peterpaul");
    Consumer<String> ausgabe = input -> System.out.printl(input);
        
    students.forEach(ausgabe);
    Supplier<Double> ran1000 = () -> Math.random() * 1000;
    System.out.println(ran1000.get());
````