// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[][] arr= {
            {1,2,3},
            {4,5,6,7,8},
            {2,3}
        };
        for(int[]row: arr)
        System.out.println(Arrays.toString(row)); 
        
        // second way 
     /*   for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
        }  */
    }
}