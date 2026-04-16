import java.util.Arrays;
class Main1 {
    public static void main(String[] args) {
        fun(2,3,67,54,89,3,6,3,2);
    }
    static void fun(int ...v){           // ...v means variable arguments we can pass any no of arguments.
        System.out.println(Arrays.toString(v));
    }
}


/* import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        fun(2,3,67,54,89,3,6,3,2);
        multiple(4,6,"shyam","thakur","ram","shyam");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v)); 
    }
    static void multiple(int a,int b,String ...v){
        System.out.println("a = " + a + ", b = " + b);
        System.out.println(Arrays.toString(v)); 
    }
} */