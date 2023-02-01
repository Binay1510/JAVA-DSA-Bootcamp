package biny;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        int a =in.nextInt();
//        int b =in.nextInt();
//        int c =in.nextInt();

        //Q1- largest of three numbers
        System.out.println("Enter the first number:");
        int a=in.nextInt();
        System.out.println("Enter the second number:");
        int b=in.nextInt();
        System.out.println("Enter the third number:");
        int c=in.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("max number is:"+max);
    }
}
