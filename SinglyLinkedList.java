public class SinglyLinkedList  {
    // Singly Linked list is a linear data structure. in which each element of list contains pointer.
    // which points to the next element in the list.
    // each element called node.
    // node --> data , next      (next node reference)
    // HEAD__>Node-->Node-->Node__>TAIL    Tail node-->(data,null)

    //Representing node as a class
    class Node{
        // declaring data members
        int data;  
        Node next;
        
        //initialize data members using constructor
        public Node(int data){
           this.data=data;
           this.next=null;    
        }
    }

    // Represent the head and tail
    public Node head=null;
    public Node tail=null;

    // addNode() will add a new Node
    public void addNode(int data){
           // create a newNode
           Node newNode = new Node(data);
           //checks new node is empty
           if(head==null){
            //if list is empty, the new node will be head and tail itself
            head=newNode;
            tail=newNode;
           }
           else{
            // new node will be added after the tail
            tail.next=newNode;
            // new node will be the tail now
            tail=newNode;
           }
    }

    //display() will display all the nodes present in the list.
    public void display(){
        // Node current point to head
        Node current = head;

        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Nodes of sigly Linked List");
        while(current != null){
            // print each node by incrementing pointer
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
         
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.addNode(1);
        sList.addNode(2);

        sList.display();
    }


} 
