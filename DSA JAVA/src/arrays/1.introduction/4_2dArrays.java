import java.util.Scanner;
//import java.util.Arrays;
 class  ArrayUtils{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("enter the size of row:");
	    int r= in.nextInt();
	    System.out.println("enter the size of col:");
	    int c= in.nextInt();
	     int[][] arr = new int[r][c];
	    for(r=0;r<arr.length;r++){
	        for(c=0;c<arr[r].length;c++){
	           arr[r][c] = in.nextInt();
	        }
	    }

        //                                                      output way 1
	    for (r = 0; r < arr.length; r++) {
           for (c = 0; c < arr[r].length; c++) {
            System.out.print(arr[r][c] + " ");  
    }
    System.out.println(); // move to next line after finishing row
}

//                                                               output way 2
/*  for (r=0; r < arr.length; r++) {
        System.out.print(Arrays.toString(arr[r]));
        */

 //                                                               output way 3
   /*for (int[] row : arr) {
       System.out.println(Arrays.toString(row));
   }
   */

}
}
