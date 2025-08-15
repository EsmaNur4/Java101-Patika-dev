package ödev;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 0, k = 1, sum, sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = inp.nextInt();
        if (sayi == 1) {
            System.out.println("0");

        } else {
            System.out.print("0 1 ");
            for (int i = 0; i < sayi - 2; i++) {
                sum = n + k;
                System.out.print(sum + " ");
                n = k;
                k = sum;
            }
        }


    }
}
