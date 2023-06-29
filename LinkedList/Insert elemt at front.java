package linkedlst;

import java.io.*;
import linkedlst.*;
//ll node

class Node{
    int data;
    Node next;
}

//class to insert element in LL
class LinkedList{
    Node head;     //head of list

    //function to insert a new node at front of LL
    void insertAtFront(int new_data){
        Node new_node =new Node();       //create a new node or allocate
        new_node.data=new_data;         //put data in new node
        new_node.next=head;            //make next of new node as head
        head=new_node;                  //update the head
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

    // driver code

    public static void main(String[] args) {
        //start with empty ll

        LinkedList list=new LinkedList();

        list.insertAtFront(6);
        list.printList();
        //insert at start

        System.out.println("after insert");
        list.insertAtFront(5);
        list.insertAtFront(4);
        list.insertAtFront(3);
        list.insertAtFront(2);


        list.printList();

    }
}
