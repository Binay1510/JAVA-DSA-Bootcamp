package biny;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int num1= input.nextInt();
//        System.out.println("Enter second number");
//        int num2= input.nextInt();
//        int sum=num1+num2;
//        System.out.println("SUM ="+sum);


        // as we are taking float input but giving an integer aand it is giving us float ,so this is called type conversion and casting
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        float num1= input.nextInt();
        System.out.println("Enter second number");
        float num2= input.nextInt();
        float sum=num1+num2;
        System.out.println("SUM ="+sum);

    }
}
