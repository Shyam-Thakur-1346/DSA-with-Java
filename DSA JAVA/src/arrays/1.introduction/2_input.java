import java.util.Arrays;
import java.util.Scanner;
class ArrayInputExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


// arrays of primitives.



        // Declare and initialize an array
        int[] arr = new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=67;
        arr[3]=89;
        arr[4]=101;

       // [23, 45, 67, 89, 101]
        // Read from the array by printing the first element
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // input using a loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // Print the array elements using a loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);



            // one more way to print array - using Arrays.toString()
            System.out.println(Arrays.toString(arr));


// array of objects
String[] strArr = new String[5];
for (int k = 0; k < strArr.length; k++) {
    strArr[k] = in.next();
}
System.out.println(Arrays.toString(strArr));

// output - [element1, element2, element3, element4, element5]

// modify 
strArr[0] = "modifiedElement1";
strArr[1] = "modifiedElement2";
strArr[2] = "modifiedElement3";
strArr[3] = "modifiedElement4";
strArr[4] = "modifiedElement5";

        }
    }
}