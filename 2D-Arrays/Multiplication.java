import java.util.*;

public class Multiplication {

    public static void display(int arr[][]){
        for(int x[]: arr){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] multiply(int arr1[][],int arr2[][],int res[][]){
        for(int i=0; i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int k=0;k<arr1[0].length;k++){
                    res[i][j]+=arr1[i][k] * arr2[k][j];
                }
            }
        } 
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr1 rows and columns:");
        int r1 = sc.nextInt() ,c1 = sc.nextInt();
        System.out.println("Enter arr2 rows and columns: ");
        int r2 = sc.nextInt() ,c2 = sc.nextInt();
        int arr1[][] = new int [r1][c1];
        int arr2[][] = new int [r2][c2];
        System.out.println("Enter elements for arr1: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print("Enter the element:");
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter elements for arr2: ");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                System.out.print("Enter the element:");
                arr2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        if(c1 == r2) {
            int res[][] = new int[r1][c2];
            display(multiply(arr1,arr2,res));
        }
        else{
            System.out.println("1st matrix column and 2nd matrix row should be same!!!");
        }
        sc.close();
    }
}
