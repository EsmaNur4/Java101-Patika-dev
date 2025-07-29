package ödev;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) { // Kombinasyon formulu C(n,r) = n! / (r! * (n-r)!)
        double n, fakN = 1, r, fakR = 1, faknr = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayiyi Giriniz: ");
        n = input.nextDouble();
        System.out.print("İkinci Sayiyi Giriniz: ");
        r = input.nextDouble();
        for (int i = 1; i <= n; i++) {
            fakN *= i;
        }
        for (int i = 1; i <= r; i++) {
            fakR *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            faknr *= i;
        }

        System.out.println("Kombinasyon(" + n + "," + r + ")= " + fakN / (fakR * faknr));
    }
}
