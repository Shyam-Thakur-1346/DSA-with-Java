import java.util.ArrayList;
import java.util.Scanner;
public class example1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);
     /* list.add(465);
        list.add(45);
        list.add(65);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(46);
        System.out.println(list);  
        list.set(0,65464);  // index value, no to be replace
        System.out.println(list);
        list.remove(0);    // index value = 0
        System.out.println(list);                                              */
       
       // itetration
        for(int i=0;i<5;i++){
          list.add(in.nextInt());}
          
       // get item at any index
        for(int i=0;i<5;i++){
          System.out.println(list.get(i));}
          
System.out.println(list);
}
}