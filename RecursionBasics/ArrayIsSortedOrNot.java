import java.util.*;

public class ArrayIsSortedOrNot {
    public static boolean isSorted(int arr[], int idx) {
        // Base Case
        if (idx == arr.length - 1) {
            return true;
        }
        // Work
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        // Inner call
        return isSorted(arr, idx + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Created array is: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        if (isSorted(arr, 0)) {
            System.out.println("Array is sorted!");
        } else {
            System.out.println("Array is not sorted!");
        }
        sc.close();
    }
}
