public class BubbleSort{


    public void Sort(int myarray[]){
        int temp=0;
       for(int j=1;j<myarray.length;j++){ 
    for(int i=1;i<myarray.length;i++){
        if(myarray[i-1]>myarray[i]){
        
        temp=myarray[i];
     
        myarray[i]= myarray[i-1];
           myarray[i-1]=temp;
    }
    
    }
       }
    
    }

    public static void main(String args[]){
    
   int[] myarray={45,34,23,12,10,1};
        BubbleSort sortObj=new BubbleSort();
        sortObj.Sort(myarray);
        for(int i=0;i<myarray.length;i++){
        System.out.println(myarray[i]);
        }
    
    }
}
