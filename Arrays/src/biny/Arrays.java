package biny;

public class Arrays {
    public static void main(String[] args) {

        //array syntax
        // datatype[] var_name = new datatype[size]
//        int[] rollno1= new int[5];
//        // or directly
//        int[] rollno2= {44,3,4,5,9};

        int[] ros; // declaration of array ros is getting defined in stack
        ros=new int[5]; // initialzation : here obj is being created in memory
        System.out.println(ros[2]);

        String[] arr= new String[5];
        System.out.println(arr[1]);

    }
}
