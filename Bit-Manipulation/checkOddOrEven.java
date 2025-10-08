import java.util.*;

public class checkOddOrEven {
    public static int isOddOrEven(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (isOddOrEven(n) == 0) {
            System.out.println("Even number!");
        } else {
            System.out.println("Odd Number!");
        }
        sc.close();
    }
}
