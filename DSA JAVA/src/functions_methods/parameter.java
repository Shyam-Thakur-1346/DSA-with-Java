// take inputs of two numbers and print the sum , take values frommain function that is by parameter

public class parameter {
    public static void main(String[] args) {
    int answer = sum(3,4);
    System.out.println(answer);
    }
   static int sum(int a,int b){
       int sum = a+b;
       return sum;
   }
}

//return string type and take the string from main function that is by parameter

/*class Main {
    public static void main(String[] args) {
    String message =greet(" shyam");
    System.out.println(message);
    }
   static String greet(String name){
       String greeting = "Hello"+name;
       return greeting;
   }
}
*/

// one more type in this input is from user
//return string type and take the string from main function that is by parameter
/*import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.println("enter your name");
    String name = in.next();
    String message =greet(name);
    System.out.println(message);
    }
   static String greet(String name){
       String greeting = "Hello"+name;
       return greeting;
   }
}
*/