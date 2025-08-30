import java.util.*;
public class RadixOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        if(str.matches("[0-1]+")){
            System.out.println("Binary Radix Base=2");
        }
        else if (str.matches("[0-7]+")){
            System.out.println("Octal Radix Base=8");
        }
        else if(str.matches("[0-9]+")){
            System.out.println("Decimal Radix Base=10");
        }
        else if(str.matches("[0-9A-Fa-f]+")){
            System.out.println("Hexadecimal Radix Base=16");
        }
        else{
            System.out.println("Enter any one either binary or octal or decimal or hexadecimal: ");
        }
    }
}
