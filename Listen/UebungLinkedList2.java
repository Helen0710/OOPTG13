package Listen;

import java.util.LinkedList;
import java.util.Scanner;

public class UebungLinkedList2 {

    public static void main(String[] args) {
        LinkedList<String> einkaufsliste = new LinkedList<>();

        einkaufsliste.add("Yogurt");
        einkaufsliste.add("Müsli");
        einkaufsliste.add("Äpfel");

        for (String einkaufslistep : einkaufsliste) {
            System.out.println(einkaufslistep);
        }

        Scanner s = new Scanner(System.in); 
       Scanner n = new Scanner (System.in);

        System.out.println("Möchtest du noch etwas zur Liste hinzufügen?");
        
        if (s.next().equals("ja")) {
            System.out.println("Was möchtest du hinzufügen?");
            
            einkaufsliste.addLast(n.nextLine());
            
            

        } // Ende if 

        if(einkaufsliste.contains(n));  // funktioniert noch nicht ganz 

        {
            System.out.println("War schon auf der Liste");
            einkaufsliste.removeLast();
            
        }
        System.out.println(einkaufsliste);
    }
    
}
