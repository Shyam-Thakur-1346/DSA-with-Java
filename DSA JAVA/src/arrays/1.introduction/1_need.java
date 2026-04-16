// Arrays - Introduction
// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
// They are particularly useful when you need to work with a collection of similar items, such as a list of numbers or a set of strings.
// In Java, arrays are objects that can hold a fixed number of values of a single type.

class NeedForArrays{
    public static void main(String[] args) {
        // Without arrays
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        System.out.println("Without arrays:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // With arrays
        int[] numbers = {10, 20, 30};
        System.out.println("With arrays:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // example of array declaration and initialization
    //    int[] ros; // declaration of an array, ros is getting in the stack
    //     ros = new int[5]; // allocation of memory for 5 integers in the heap

//   int[] arr     =    new int[5];
//  compile time         run time
// left side is reference variable and right side is object

// dynamic memory allocation - done at run time . 
// arrays object are in heap and heap objects are not contiguously allocated
// so arrays object in java are also not contiguously allocated because it depends on the JVM implementation.
// new keyword is used to create an array object in heap memory.
// null - default value for all reference types in java
// none - default value for all primitive types in python

// String[] arr = new String[5];
// internal workings of arrays in java

    }
}