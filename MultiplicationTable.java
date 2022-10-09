package assign;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter any Number:");
        int num=in.nextInt();
        for(int i=0;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
