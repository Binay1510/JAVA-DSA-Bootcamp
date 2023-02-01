package biny;

import java.util.Scanner;

public class MultiDarray {
    public static void main(String[] args) {
//        int[][] arr=new int[3][];
        Scanner in=new Scanner(System.in);
//        int[][] arr={
//                {1,2,3}, //0 index
//                {4,5,6},  //1 index
//                {7,8,9,10}  //2index
//        };

        int[][]arr =new int[3][3];
        System.out.println(arr.length); // no of rows

        //input

        for (int row=0; row <arr.length ; row++) {
            // for ecah col in every row
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]= in.nextInt();

            }
        }
        //output
        for (int row=0; row <arr.length ; row++) {
            // for ecah col in every row
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]+ " ");

            }
            System.out.println();
        }
//        for (int row = 0; row < arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }

//        for(int[]a : arr){
//            System.out.println(Arrays.toString(a));
//        }

    }
}
