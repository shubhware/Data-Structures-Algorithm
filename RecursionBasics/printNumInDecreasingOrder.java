import java.util.*;

public class printNumInDecreasingOrder {
    public static void printDecreasingOrder(int num) {
        // Base Case
        if (num == 1) {
            System.out.print(num + "\n");
            return;
        }
        // Work
        System.out.print(num + " ");
        printDecreasingOrder(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        printDecreasingOrder(num);
        sc.close();
    }
}
