class First{
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(2);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}

// In this funtion is calling another function .
/* This is function calling another function


 Here firstly main function goes to stack , main function calls print1 function till that main function rest
now come inside print1 function it prints 1 and call another function print2 similary reachs upto print5 function
now here print5 function prints 5 and back to from where it has been call that is to print4 function similarly 
all functions goes back to from where they have call and goes out of stack at last print1 function gooes back to 
main function and then main function is also over and prints the final output. */

