import java.util.*;

public class checkPowerOf2 {
    public static boolean isPowerOfTwo(int num) {
        if ((num & (num - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is power of 2!");
        } else {
            System.out.println(num + " is not a power of 2!");
        }
        sc.close();
    }
}
