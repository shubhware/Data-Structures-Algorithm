import java.util.*;

public class ExponentCalculationUsingRecursion {
    public static int exponent(int x, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        int halfPower = exponent(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq *= x;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of power: ");
        int n = sc.nextInt();
        System.out.println(x + " to the power " + n + " is: " + exponent(x, n));
        sc.close();
    }
}
