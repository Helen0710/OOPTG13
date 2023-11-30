// Java Program to Demonstrate 
// Working of Map interface 
  
// Importing required classes 
import java.util.*; 
  
// Main class 
class GFG { 
  
    // Main driver method 
    public static void main(String args[]) 
    { 
        // Creating an empty HashMap 
        Map<Integer, String> hm 
            = new HashMap<Integer, String>(); 
  
        // Inserting pairs in above Map 
        // using put() method 
        hm.put(1, "Bing"); 
        hm.put(2, "Peter"); 
        hm.put(3, "Hans"); 
        hm.put(4,"helen"); 
  
        // Traversing through Map using for-each loop 
        for (Map.Entry<Integer, String> me : 
             hm.entrySet()) { 
  
            // Printing keys 
            System.out.println("Initial Map " + hm); 


            // Ein Element in der Liste ersetzen  
  
            hm.put(2, "For"); 
  
            System.out.println("Updated Map " + hm); 
            
            // Ein Element aus einer Liste löschen 

             hm.remove((4)); 

             System.out.println(hm);

             // Eine Liste in eine Map einfügen 
            
               int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 }; 
  
                // put all elements in arraylist 
                ArrayList<Integer> aa = new ArrayList(); 
                for (int i = 0; i < a.length; i++) { 
                    aa.add(a[i]); 
                } 
  
                HashMap<Integer, Integer> h = new HashMap(); 
  
                // counting occurrence of numbers 
                for (int i = 0; i < aa.size(); i++) { 
                 h.putIfAbsent(aa.get(i), Collections.frequency( 
                                         aa, aa.get(i))); 
                } 
                System.out.println(h); 


        } 
    } 
}