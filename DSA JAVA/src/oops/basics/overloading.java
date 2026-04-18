package oops.basics;

public class overloading {
    public static void main(String[] args) {
        MathUtils obj = new MathUtils();

        System.out.println(obj.add(2, 3));        // int
        System.out.println(obj.add(2.5, 3.5));    // double
        System.out.println(obj.add(1, 2, 3));
    }
}
class MathUtils {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
