import java.util.*;

public class PrintNthFibonacci {
    public static int fib(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return n;
        }
        // Work
        int fib_nm1 = fib(n - 1);
        int fib_nm2 = fib(n - 2);
        // Inner call
        return fib_nm1 + fib_nm2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth value: ");
        int n = sc.nextInt();
        System.out.println("Nth Fibonacci Value is: " + fib(n));
        sc.close();
    }
}
