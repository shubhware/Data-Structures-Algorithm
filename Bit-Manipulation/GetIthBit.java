import java.util.*;

public class GetIthBit {
    public static int getIthBit(int num, int index) {
        int bitMask = 1 << index;
        if ((num & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("enter the ith position: ");
        int index = sc.nextInt();
        System.out.println("The ith bit value is: " + getIthBit(n, index));
        sc.close();
    }
}
