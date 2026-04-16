// function overloading - when two or more functions have the same name but different parameters.
// This is useful when you want to perform similar operations with different types or numbers of inputs.
// For example, you could have a function that adds two integers and another that adds two doubles.
// it decides which function to run based on the arguments passed to it on compile time.

// either the type or the number of the parameters should be differetnt.
package varargs_variables_arguments;
class Main {
    public static void main(String[] args) {
        fun(10);
        fun("shyam");
    }
    static void fun(int a){
         System.out.println(a);
    }
    static void fun(String name){
      System.out.println(name);
    }
}