class Prime_no {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int c = 2; c <= Math.sqrt(n); c++) {
            if (n % c == 0) {
                return false;   
            }
            c++;
        }
        return true;  
    }

    public static void main(String[] args) {
        int n = 36;
        for(int i=1;i<n;i++){
            System.out.println(i+""+isPrime(i));
        }
    }
}
