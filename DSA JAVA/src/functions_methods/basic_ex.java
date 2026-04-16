// take inputs of two numbers and print the sum
import java.util.Scanner;
public class basic_ex{
    public static void main(String[] args) {
    sum();
    sum();
    }
    static void sum(){
             Scanner in = new Scanner(System.in);
             System.out.println("enter no 1:");
             int num1 = in.nextInt();
             System.out.println("enter no 2:");
             int num2 = in.nextInt();
             int sum = num1+num2;
             System.out.println("the sum is:"+sum);
    }
}