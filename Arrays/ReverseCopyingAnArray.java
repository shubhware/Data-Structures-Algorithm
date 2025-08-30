import java.util.*;
public class ReverseCopyingAnArray {
    public static int[] reverseCopy(int arr1[],int arr2[]){
        for(int i=arr1.length-1,j=0;i>=0 && j<arr2.length;i--,j++){
            arr2[j]=arr1[i];
        }
        return arr2;
    }
    public static void display(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }
            else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter the element: ");
            arr1[i] = sc.nextInt();
        }
        display(reverseCopy(arr1, arr2));
        sc.close();
    }
}
