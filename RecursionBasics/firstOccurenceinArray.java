import java.util.*;

public class firstOccurenceinArray {
    public static int firstOccurence(int arr[], int key, int i) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }
        // Work
        if (arr[i] == key) {
            return i;
        }
        // inner call
        return firstOccurence(arr, key, i + 1);
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

        System.out.print("Enter the element to find: ");
        int key = sc.nextInt();

        int idx = firstOccurence(arr, key, 0);
        System.out.println("First occurence of " + key + " is at index: " + idx + " !");
        sc.close();
    }
}
