package switch_statements;
import java.util.Scanner;
public class example3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        switch (days){
            case 1,2,3,4,5 ->System.out.println("weekdays");
            case 6,7 -> System.out.println("weekends");
        }
    }
}