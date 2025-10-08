import java.util.*;

public class StringAnagrams {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] str1CharArr = str1.toCharArray();
        char[] str2CharArr = str2.toCharArray();

        Arrays.sort(str1CharArr);
        Arrays.sort(str2CharArr);

        for (int i = 0; i < str1CharArr.length; i++) {
            if (str1CharArr[i] != str2CharArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (isAnagram(str1, str2)) {
            System.out.println("Both are anagrams!");
        } else {
            System.out.println("They are not anagrams!");
        }
        sc.close();
    }
}
