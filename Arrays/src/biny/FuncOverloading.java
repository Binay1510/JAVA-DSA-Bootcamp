package biny;
// when we have 2 fun of same name but diff args
public class FuncOverloading {
    public static void main(String[] args) {
        fun(88);
        fun("Josh");
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}

