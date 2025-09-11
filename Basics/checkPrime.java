import java.util.*;

public class checkPrime {
    public static boolean isPrime(int num){
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                flag = false;
            }
            else{
                flag = true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        if(isPrime(n)){
            System.out.println("The number " + n + " is prime!");
        }
        else{
            System.out.println("The number " + n + " is not prime!");
        }
    }
}
