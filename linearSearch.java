public class linearSearch{

    public int linearSearch(int key,int array[]){
        for(int i=0;i<array.length;i++){
            if(key==array[i])
            {return i;
                
            }
            
        }
        return -1;
        
    }
    
   public static void main(String[] args){
        linearSearch obj=new linearSearch();
        int[] myarray={1,2,3,4,5,6,7,8,9};
        int index=obj.linearSearch(9,myarray);
        System.out.println(index);
    }
}