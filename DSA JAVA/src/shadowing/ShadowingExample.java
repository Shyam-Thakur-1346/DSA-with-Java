
/* public class ShadowingExample {
    static int x =10;  // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);  // 10
        int x =40;   // the class variable at line 4 is shadowed by this
         System.out.println(x);  // 40
         fun();   // 10
    }
    static void fun(){
         System.out.println(x);
    }
}
*/// This is called variable shadowing.
// The local variable x shadows the class variable x.
// Shadowing can lead to confusion, so it's best to avoid using the same name for different variables in different scopes.