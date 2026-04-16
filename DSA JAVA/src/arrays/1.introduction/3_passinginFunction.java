
//import java.lang.reflect.Array;
import java.util.Arrays;

//import java.util.Arrays;
//import  java.util.Scanner;
class ArrayUtils1 {
    // Method to print an array
    public static void main(String[] args) {
        int[] nums ={3,4,5,12};
        System.out.print(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }

    // Method to change the array
    public static void change(int[] arr) {
        arr[0] = 99;
    }
}



// strings are immutable in java
// arrays are mutable in java
// mutable- can be changed after creation
