/* Time coplexity is: O(log n) */

import java.util.*;

public class binarySearchImplementation {
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        int result=binarySearch(arr,key);
        if(result == -1){
            System.out.println("Key not found!");
        }
        else{
            System.out.println("Key found at pos : " + result);
        }
        sc.close();
    }
}
