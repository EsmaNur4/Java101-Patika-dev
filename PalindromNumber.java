package ödev;

public class PalindromNumber {   // Tersten okunusu sayinin kendiyle ayni olan sayilar

    static boolean isPolindrom(int number) {
        int number2 = number, lastNumber, reverseNumber = 0;
        while (number2 != 0) {
            lastNumber = number2 % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            number2 /= 10;
        }
            if (number == reverseNumber) {
                return true;
            } else {
                return false;
            }
    }

    public static void main(String[] args) {
        System.out.println(isPolindrom(1331));
    }

}

