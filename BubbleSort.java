public class BubbleSort{


    public void Sort(int myarray[]){
        int temp=0;
    for(int i=1;i<myarray.length;i++){
        if(myarray[i-1]>myarray[i])
        
        temp=myarray[i-1];
        myarray[i]=myarray[i-1];
        myarray[i-1]=temp;
    }
    
    }

    public static void main(String args[]){
    
   int[] myarray={9,34,5,76,12,1};
        InsertionSort sortObj=new InsertionSort();
        sortObj.Sort(myarray);
        for(int i=0;i<myarray.length;i++){
        System.out.println(myarray[i]);
        }
    
    }
}