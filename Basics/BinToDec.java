import java.util.* ;

public class BinToDec {
    public static int binToDec(int bin){
        int power = 0;          //Start with power 0
        int dec = 0;
        while(bin > 0){
            int lastdig = bin % 10 ;           //Calculate remainder
            dec += lastdig * Math.pow(2, power);
            power++ ;           //Dont forget to increase power and reduce bin_num here.
            bin /= 10;
        }
        return dec ;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter the binary number: ");
        int bin_num = sc.nextInt();
        sc.close();
        System.out.println("The decimal equivalent is: " + binToDec(bin_num));
    }
}
