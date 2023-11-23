
import java.util.*; 

public class Startklasse 
{
    public  static void main(String[] args)
    
    {
        Set<Integer> data = new LinkedHashSet<Integer>(); 
        data.add(2); 
        data.add(7);
        data.add(8);

        Set <Integer> data1 = new LinkedHashSet<Integer>();
        data1.add(5);
        data1.add(7);
        data1.add(8);
        data1.add(9);
        
        data.addAll(data1);
        System.out.print("Union of data1 and data is:");    
        System.out.println(data);
        
        System.out.print("Intersection of set1 and set2 is:");    
        System.out.println(data);    


        
        System.out.println("Does the Set contains '91'?" + data.contains(91));   
        System.out.println("Does the Set contains '7'? " + data.contains(7));  
        System.out.println("Does the Set contains '8'? " + data.contains(8));  
        



        Integer[] A = {22, 45,33, 66, 55, 34, 77};  
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
        Set<Integer> set1 = new HashSet<Integer>();    
        set1.addAll(Arrays.asList(A));    
        Set<Integer> set2 = new HashSet<Integer>();    
        set2.addAll(Arrays.asList(B));    

        Set<Integer> difference_data = new HashSet<Integer>(set1);    
        difference_data.removeAll(set2);    
        System.out.print("Difference of set1 and set2 is:");    
        System.out.println(difference_data);    
    }
}