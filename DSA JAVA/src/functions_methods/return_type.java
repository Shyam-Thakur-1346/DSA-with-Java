// take inputs of two numbers and print the sum and take th return type as int
import java.util.Scanner;
public class return_type {
    public static void main(String[] args) {
    int answer = sum();
    System.out.println("answer:"+answer);
    }
    static int sum(){
             Scanner in = new Scanner(System.in);
             System.out.println("enter no 1:");
             int num1 = in.nextInt();
             System.out.println("enter no 2:");
             int num2 = in.nextInt();
             int sum = num1+num2;
             return sum;
    }
}

//return string type example


/*import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    String message=greet();
    System.out.println(message);
    }
    static String greet(){ 
        String greetings="Hello, how are you";
        return greetings;
        
    }
}
*/