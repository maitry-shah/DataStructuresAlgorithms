import java.util.Scanner;

public class BinarySearch{

    public int BinarySearch(int key,int array[],int min,int max){
    int i;
    
   
    int midlength = (min+max-1)/2;   
    if(min!=max){
    if(key>array[midlength]){
        min=midlength+1;
         System.out.println("min:"+min);
         System.out.println("greater than mean:"+array[midlength]);
         System.out.println("max:"+max);

        
        return BinarySearch(key, array,min,max);
         
        }
    
    else if(key==array[midlength] ){
        return midlength;
        } 
        
    else{
         max=midlength+1;
         System.out.println("less than mean:"+max);

        return BinarySearch( key,array,min,max);
         
        
        }
        
    }
    return -1;
}
    
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number to search in the array");
    int key=scan.nextInt();
    BinarySearch obj = new BinarySearch(); 
    int[] myarray={4,5,6,7,8};
    int index=obj.BinarySearch(key,myarray,0,myarray.length);
    if(index==-1){
     System.out.println("Element not found");
    }
    System.out.println(index);
   

}
}