import java.util.*;

public class RotateArray {
    public static int[] leftRotation (int arr[]){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static int[] rightRotation (int arr[]){
        int temp1=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp1;
        return arr;
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
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter (1=Left Rotation) or (2=Right Rotation): ");
        int choice = sc.nextInt();
        if (choice==1){
            display(leftRotation(arr));
        }
        else if(choice==2){
            display(rightRotation(arr));
        }
        else{
            System.out.println("Enter either 1 or 2 !");
        }
        sc.close();
    }    
}
