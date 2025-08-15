package ödev;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        n = inp.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + " Bir Mukemmel Sayidir.");
        } else {
            System.out.println(n + " Bir Mukemmel Sayi Degildir.");
        }

    }
}
