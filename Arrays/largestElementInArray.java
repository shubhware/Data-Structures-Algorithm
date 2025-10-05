import java.util.*;

public class largestElementInArray {
    public static int getLargestValue(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value: ");
            arr[i]=sc.nextInt();
        }
        int max = getLargestValue(arr);
        System.out.println("The largest element is: " + max);
        sc.close();
    }
}
