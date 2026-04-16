package switch_statements;
import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();
        switch(fruits){
            case "mango" -> System.out.println("king of fruit");
            case "apple" -> System.out.println("healthy fruit");
            case "grapes" -> System.out.println("small fruit");
            case "orange" -> System.out.println("round fruit");
            default -> System.out.println("invalid fruit");
        }
    }
}