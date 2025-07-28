package ödev;

import java.util.Scanner;

public class UcSayiSiralama {
    public static void main(String[] args) {  // Girilen 3 sayiyi kucukten buyuge siralayan program
        int a, b, c;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        a = inp.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        b = inp.nextInt();
        System.out.print("3. sayiyi giriniz: ");
        c = inp.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("1.sayi<2.sayi<3.sayi");
            } else {
                System.out.println("1.sayi<3.sayi<2.sayi");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("2.sayi<1.sayi<3.sayi");
            } else {
                System.out.println("2.sayi<3.sayi<1.sayi");
            }
        } else {
            if (a < b) {
                System.out.println("3.sayi<1.sayi<2.sayi");
            } else {
                System.out.println("3.sayi<2.sayi<1.sayi");
            }
        }
    }


}
