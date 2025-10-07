import java.util.*;

public class palindromeString {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome!");
        } else {
            System.out.println(str + " is not a palindrome!");
        }
        sc.close();
    }
}
