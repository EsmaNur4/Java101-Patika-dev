package ödev;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int n, sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac Tane Sayi Gireceksiniz? :");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayiyi Giriniz: ");
            sayi = input.nextInt();

        }


    }
}
