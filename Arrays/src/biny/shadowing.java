package biny;

public class shadowing {
    static int x=90; //this will be shodowed in line9

    public static void main(String[] args) {
        System.out.println(x); //90
        int x ;   // the class variabl at line 6 is shadowed by this
        //System.out.println(x);  scope will begin when value is initialized

        x=40;
        System.out.println(x); //40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
