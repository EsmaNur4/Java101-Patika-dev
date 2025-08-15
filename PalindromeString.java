package ödev;

public class PalindromeString {
    static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    static boolean isPalindrome2(String str) {
        String str2 ="";
        for (int i = (str.length() - 1); i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ebe"));
        System.out.println(isPalindrome2("ebe"));

    }
}
