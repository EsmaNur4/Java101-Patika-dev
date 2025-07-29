package ödev;

import java.util.Scanner;

public class CiftveDordeBolunen {   // Tek sayi girilene kadar girilen sayilarin 2 ve 4 e tam bölünenlerini toplayan program
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayi girin: ");
            sayi = inp.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi % 2 == 0);
        System.out.println("Cift ve Dorde Tam Bolunenlerin Toplami " + toplam);

    }
}


