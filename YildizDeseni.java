package ödev;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class YildizDeseni {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
