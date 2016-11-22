public class AddNodeLinkedList{
    
            static class Node{
                int data;
                Node next;
                Node(int d){
                    data=d;
                    next=null;
                }
            }   
        
            public Node AddNode(Node head, Node NewNode){
              //  System.out.println(" Head"+head.data+ " NN"+NewNode.data);
                NewNode.next=head;
                head=NewNode;
                return head;
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
            Node head;
            AddNodeLinkedList LList=new AddNodeLinkedList();
            head=new Node(1);
            Node second=new Node(2);
            Node third=new Node(3);
            Node NewNode=new Node(4);
            
            head.next=second;
            second.next=third;
            head = LList.AddNode(head,NewNode);
           // System.out.println(" Head"+head.data);
            LList.printLinkedlist(head);
            
                
                
            } 
}
