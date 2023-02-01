package biny;

import java.util.Arrays;
import java.util.SplittableRandom;

//when we create a method that creates a variable no of args->Variable length args  >
// when we don't know how many arguments we are giving
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,6,89,4);
        multiple(3,4,"Josh","John","Aaina");

    }
    static void multiple(int a, int b, String ...v){   //varargs always at end bcz if it wil be in middle then how we will know when fixed values are coming
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){    //int..v-> taking as a array of integers/string/cagr
        System.out.println(Arrays.toString(v));
    }

}
