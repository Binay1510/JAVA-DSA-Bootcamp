package modfunc;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter First nUmber");
        int first=in.nextInt();
        System.out.println("Enter Second nUmber");
        int second=in.nextInt();
        System.out.println("Enter THird nUmber");
        int third=in.nextInt();

        int maximum=maximum(first,second,third);
        int minimum=minimum(first,second,third);

        System.out.println("Largest number is:"+maximum);
        System.out.println("Smallest number is:"+minimum);


    }


    static int maximum(int first,int second,int third){
        int max=first;

        if(second>max){
            max=second;
        }
        if(third>max){
            max=third;
        }
        return max;
    }
    static int minimum(int first,int second,int third){
        int min=first;

        if(second<min){
            min=second;
        }
        if(third<min){
            min=third;
        }
        return min;
    }

}
