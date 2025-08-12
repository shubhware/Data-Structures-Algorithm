import java.util.* ;

public class HollowRectangle {
    public static void printHollowRectangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if( i==1 || j==1 || i==n || j==n ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of lines: ");
        int n = sc.nextInt();
        sc.close();
        printHollowRectangle(n);
    }    
}
