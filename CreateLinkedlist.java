public class CreateLinkedlist{
    
    
    
    static class Node{
        
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
        
        
    }
     public  void printLinkedlist(Node head){
         Node n =head;
         while(n!=null){
            System.out.print(n.data);
            
            n=n.next;
            if(n!=null){
            System.out.print("-->");
            }
        }
     }
     
     public static void main(String[] args){
         Node head;
       
       CreateLinkedlist llist=new CreateLinkedlist();
       head=new Node(1);
       Node second=new Node(2);
       Node third =new Node(3);
       
       head.next=second;
       second.next=third;
       llist.printLinkedlist(head);
        
}
    
}

