import java.util.Scanner;
public class repition_of_num{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value:");
        int n= in.nextInt();
        System.out.println("enter the no whose count to be count:");
        int find=in.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==find){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}