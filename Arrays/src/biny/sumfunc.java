package biny;
import java.util.Scanner;

import static java.lang.Long.sum;

public class sumfunc {

    public static void main(String[] args) {
//        int ans=sum2();
//        System.out.println(ans);
        int ans=sum3(20,30);
        System.out.println(ans);
    }

    //pass value of numbers when you are calling the methpd in main()

    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }

    static int sum2(){
        Scanner in =new Scanner(System.in );
        System.out.println("enter first number:");
        int num1=in.nextInt();
        System.out.println("Enter second number:");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;                   //funciton sum2() is over

    }











//    static void sum(){
//        Scanner in =new Scanner(System.in );
//        System.out.println("enter first number:");
//        int num1=in.nextInt();
//        System.out.println("Enter second number:");
//        int num2=in.nextInt();
//        int sum=num1+num2;
//        System.out.println("Sum is :"+sum);
//
//    }
}
