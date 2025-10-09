import java.util.*;

public class FastExponentiation {
    public static int fastExpo(int x, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x;
            }
            n = n >> 1;
            x = x * x;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        int output = fastExpo(x, n);
        System.out.println("Exponent of " + x + " to the power " + n + " is: " + output);
        sc.close();
    }
}
