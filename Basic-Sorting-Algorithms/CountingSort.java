import java.util.*;

public class CountingSort {
    public static void countingSort(int arr[]) {

        // calculating largest element in array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // creating a count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                --count[i];
            }
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
        System.out.println();

        System.out.print("Created array is: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        countingSort(arr);
        System.out.print("Array after sorting is: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        sc.close();
    }
}
