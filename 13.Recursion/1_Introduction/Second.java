/*So here using function call aggain and again we have to create many functions , wastage of time 
so to resolve the problem we use Recursion.
What does Recursion do?
1) It helps us in solving bigger complex problems in simple way.
2)you can convert recursion function into iteration and vice versa.
3)space complexity is not constant because of recursive calls.
 */

// using recursion

class Second{
    public static void main(String[] args) {
        Print(1);
    }
    static void Print(int n){
        // Base Condition
        if(n==5){
            System.out.println(5); 
            return;
        }
        System.out.println(n);
        // Recursive call
        Print(n+1);
    }
}