import java.util.*;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int currValue = arr[i];
            int prevPos = i - 1;
            while (prevPos >= 0 && arr[prevPos] > currValue) {
                arr[prevPos + 1] = arr[prevPos];
                prevPos--;
            }
            //insertion
            arr[prevPos + 1] = currValue;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Created array is: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        insertionSort(arr);
        System.out.println("Array after sorting is: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
