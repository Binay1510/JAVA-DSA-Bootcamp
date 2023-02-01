package biny;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>(5); //size capacity doent matter

//        List.add(55);
//        List.add(15);
//        List.add(5);
//        List.add(35);
//        List.add(45);
//        List.add(65);
//        List.add(75);
//        List.add(85);
//        List.add(95);
//
//        //functions performed on arraylist
//        List.add(99);   //add element at last
//        List.set(0,858); // replace the element at given index
//
//        System.out.println(List);


//        input  intializatoin
        for (int i = 0; i < 5; i++) {
            List.add(in.nextInt());

        }
        //get irem at any index   add elements
        for (int i = 0; i < 5; i++) {
            System.out.println(List.get(i));
        }
        System.out.println(List);
    }
}
