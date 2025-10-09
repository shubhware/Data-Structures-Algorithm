import java.util.*;

public class printNumInIncreasingOrder {
    public static void printIncreasingOrder(int num) {
        // Base Case
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        // Work
        printIncreasingOrder(num - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        printIncreasingOrder(num);
        sc.close();
    }
}
