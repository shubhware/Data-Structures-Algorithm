import java.util.*;

public class hcfOrGcd {
    public static int gcd(int num1,int num2){
        if(num1 == num2){
            return num1;
        }
        else if(num1>num2){
            num1-=num2;
        }
        else{
            num2-=num1;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 and num2:" );
        int num1 = sc.nextInt(),num2 = sc.nextInt();
        System.out.println("Gcd is: "+gcd(num1,num2));
        sc.close();
    }
}
