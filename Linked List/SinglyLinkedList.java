package linkedlst;

//ll node

class Node{
    int data;
    Node next;
}

//class to insert element in LL
class LinkedList{
    Node head;     //head of list
   // INSERTION 
    //function to insert a new node at front of LL
    void insertAtFront(int new_data){
        Node new_node =new Node();       //create a new node or allocate
        new_node.data=new_data;         //put data in new node
        new_node.next=head;            //make next of new node as head
        head=new_node;                  //update the head
    }

    //Insert element at MIDDLE
      void insertAtSpecific(int position,int new_data){
        Node new_node=new Node(); //cretion of new node
        new_node.data=new_data;
        if (position==1){            //if new node is on head position
            insertAtFront(new_data);
            return;
        }
        Node node=head;
        while(node!= null){
            if(node.data==position){
                new_node.next=node.next;
                node.next=new_node;
                return;
            }
            node=node.next;
        }

    }

    //INSERT AT END
    void InsertAtEnd(int data){
        Node new_node =new Node();   //node created
        new_node.data=data;

        if(head==null){   //if only 1 node is in LL
            head=new_node;
            return;
        }

        Node temp = head;    // create a temp node starting from begin/ head to traverse LL to insert at end
        while (null!= temp.next){   //traverse LL jbb tkk end nhi reach hota
            temp=temp.next;

        }
        temp.next =new_node;
        new_node.next =null; //optional

    }


    //function to print the LL startingfrom head

    void printList(){
        Node node =head;     //start from head
        while(node!= null){
            System.out.println(node.data + "");
            node=node.next;
        }
        System.out.println();
    }
//DELTE IN LINKED LIST
    //1. DELETE FROM STARTING
    public void Delete_Start() {
        if (head == null) {
            System.out.println("List is empty , not possible to delete");
            return;
        }
        System.out.println("deleted " + head.data);
        //move head to next node
        head = head.next;
    }

    //2. DELETE AT MIDDLE / ANY POSITION
    

    // driver code

    public static void main(String[] args) {
        //start with empty ll

        LinkedList list=new LinkedList();

        list.insertAtFront(6);
        list.printList();
        //insert at start
        list.insertAtFront(5);
        list.insertAtFront(4);
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.printList();

        //inserting at middle
        System.out.println("Inseert at any position");
        list.insertAtSpecific(1,22);
        list.insertAtSpecific(3,10);
        list.printList();

        System.out.println("at end ");
        list.InsertAtEnd(56);

        list.printList();

        list.Delete_Start();
        list.printList();


    }
}
