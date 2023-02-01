package biny;

import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        //create an array
        int[] arr={1,3,6,5,4}; //arr->refrence
        change(arr);               // parameter
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[]num){
        num[0]=99;// if you make change to obj via ref variable
    }
}
