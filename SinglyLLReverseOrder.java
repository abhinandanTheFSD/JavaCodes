import javax.swing.plaf.SliderUI;

public class SinglyLLReverseOrder {
       class Node {
            int data ;
            Node next;

            public Node(int data) {
            this.data=data;
            this.next=null;
            }
       }
    
      public Node head = null;
      public Node tail = null;

      public void addNode(int data){
       Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }

      }
      
      public void reverse(){
       Node current = head;
       Node previous = null;
       Node next = null;

       while(current != null){
        next = current.next;
        current.next=previous;
        previous=current;
        current=next;
       }
       head = previous;


      }

      public void display(){
        Node current = head;
        if(head==null){
                 System.out.println("List Is Empty");
                 return;
        }
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
      }
      public static void main(String[] args) {
        SinglyLLReverseOrder sList = new SinglyLLReverseOrder();
        sList.addNode(10);
        sList.addNode(20);
        sList.addNode(30);

        sList.display();
        
        sList.reverse();
git 
        sList.display();
      }
}
