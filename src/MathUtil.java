public class MathUtil {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int gcd(int a, int b){
        while (b!=0){
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int fibonacci(int n) {

        int a = 0, b = 1;
        System.out.print(a + " ");

        while (b <= n) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        return a;
    }
    public static int factorial(int n) {
        if (n < 0){
            return 0;
        }
        else if (n == 0){
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    public boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return reversed;
    }
    public boolean isArmstrongNumber(int n) {
        int original = n, sum = 0;
        int numDigits = String.valueOf(n).length();
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n = n / 10;
        }
        return sum == original;
    }
    public int nextPrime(int n) {
        n++;
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }


}







