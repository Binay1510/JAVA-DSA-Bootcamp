package linkedlst;

import java.util.List;

public class DoublyLL {

    private ListNode head;
    private ListNode tail;
    private int length ;
     private class ListNode{

        private int data;
        private ListNode prev;
       private ListNode next;

        public  ListNode(int data){
            this.data=data;
        }
    }
    public DoublyLL(){
         this.head=null;
         this.tail=null;
         this.length=0;
    }
    //display DLL
    public void displayforward() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.data );
            temp = temp.next;
        }

    }

// INSERTION IN DLL
    //1. INSERT AT FRONT
    public void InsertFront(int value){
        ListNode new_node =new ListNode(value);

        if(head==null){
            tail=new_node;
        }
        else {
            head.prev=new_node;
        }
        new_node.next= head;
        //new_node.prev=null;
        head=new_node;
    }

    // 2. INSERT AT END
        public void InsertLast(int value){
         ListNode new_node = new ListNode(value);
         if(head == null){
             head= new_node;

         }
         else {
             tail.next= new_node;
             new_node.prev=tail;
         }

         tail=new_node;

        }



    public static void main(String[] args) {
        DoublyLL doubly = new DoublyLL();

        doubly.InsertFront(1);
        doubly.InsertFront(2);

        doubly.displayforward();
        System.out.println("display at end");
        doubly.InsertLast(3);
        doubly.InsertLast(5);
        doubly.displayforward();
    }
}

