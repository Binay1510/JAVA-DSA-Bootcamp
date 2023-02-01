package biny;

public class swap {
    public static void main(String[] args) {

        int a =10;
        int b=20;

        Swap(a,b);

        System.out.println(a + " "+ b);

        String name ="Binay ";
        changename(name);
        System.out.println(name);
    }
    static void changename(String name){
        name="Rahul";
    }
    static void Swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
