import java.util.*;

public class Arraylist_examples{
    

public static void main(String args[]){
    
    ArrayList<String> myarray=new ArrayList<>();
     System.out.println("Initial size of al: " + myarray.size());

      // add elements to the array list
      myarray.add("C");
      myarray.add("A");
      myarray.add("A");
      myarray.add("B");
      myarray.add("D");
      myarray.add("F");
  
      System.out.println("Size of myarray after additions: " + myarray.size());

      // display the array list
      System.out.println("Contents of myarray: " + myarray);

      
     
} 


}