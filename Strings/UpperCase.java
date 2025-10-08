import java.util.*;

public class UpperCase {
    public static String toUpperCase(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isSpaceChar(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
                str2 += str.charAt(i);
            } else {
                str2 += Character.toUpperCase(str.charAt(i));
            }
        }
        return str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String output = toUpperCase(str);
        System.out.println("The converted string is: " + output);
        sc.close();
    }
}
