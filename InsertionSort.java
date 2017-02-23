import java.util.*;

public class InsertionSort{
    
    public void Sort(int array[]){
        int n=array.length;
        for(int i=1;i<=n-1;i++){
            int j=i;
            int element=array[j];
            while(j>0 && array[j-1]>element){
                array[j]=array[j-1];
                j=j-1;
                array[j]=element;
                
            }
            
        }
        
    }
    public static void main(String args[]){
        int[] myarray={1,34,5,76,12,9};
        InsertionSort sortObj=new InsertionSort();
        sortObj.Sort(myarray);
        for(int i=0;i<myarray.length;i++){
        System.out.println(myarray[i]);
        }
        
    }
    
    
}