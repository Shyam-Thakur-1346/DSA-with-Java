package switch_statements;
import java.util.Scanner;
public class nested_switch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
         String department = in.next();
         switch (empId){
             case 1:
                  System.out.println("Shyam");
                 break;
             case 2:
                  System.out.println("Ram");
                 break;
             case 3:
                    System.out.println("Sita");
                  switch(department){
                      case "IT" -> System.out.println("IT department");
                      case "Management" -> System.out.println("Management");
                      default -> System.out.println("NoDepartmentEntered");
                  }

              default:
                 System.out.println("enter correct empId");
         }
    }
}