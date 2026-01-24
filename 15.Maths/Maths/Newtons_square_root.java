// NEWTON RAPHSON METHOD
class Newtons_square_root  {

    public static double sqrtNewton(double n) {
        double x = n;           // initial guess
        double root;
        double epsilon = 0.000001;  // precision

        while (true) {
            root = 0.5 * (x + n / x);

            if (Math.abs(root - x) < epsilon) {
                break;
            }

            x = root;
        }

        return root;
    }

    public static void main(String[] args) {
        double n = 25;
        System.out.println("Square root: " + sqrtNewton(n));
    }
}
