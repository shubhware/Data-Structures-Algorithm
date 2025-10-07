import java.util.*;

public class SelectionSort {
    // T.C. => O(n^2);
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
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

        System.out.println("Sorted array is: ");
        selectionSort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
