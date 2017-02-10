//This program adds node after the given node 
//Author-Maitry Shah
import java.util.Scanner;

public class AddNodeAfterNode{
    static Node head;
            static class Node{
                int data;
                Node next;
                Node(int d){
                    data=d;
                    next=null;
                }
            }   
        
            public void addNewNode(int newdata){
                Node newNode=new Node(newdata);
              // System.out.println(" newnodedata\n"+newNode.data);
                
               Node n=head;
               while(n.next!=null){
               n=n.next;
            }
            n.next = newNode;
            
            }
        
    
            public void printLinkedlist(Node head){
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
            
            AddNodeAfterNode LList=new AddNodeAfterNode();
            head=new Node(1);
        
            LList.addNewNode(2);
            LList.addNewNode(3);
            LList.addNewNode(4);
            LList.addNewNode(5);
            System.out.println("The linked list is:")
            LList.printLinkedlist(head);
            
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter a node after which you want to add new Node ");
            int n = reader.nextInt();  
                
                
            } 
}
