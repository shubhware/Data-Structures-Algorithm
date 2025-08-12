import java.util.* ;
public class InvertedStar {
    public static void printInvertedStar(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of lines: ");
        int n = sc.nextInt();
        sc.close();
        printInvertedStar(n);
    }
}
