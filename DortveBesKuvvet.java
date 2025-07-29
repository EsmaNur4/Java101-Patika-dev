package ödev;

import java.util.Scanner;

public class DortveBesKuvvet {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        number = scan.nextInt();
        System.out.println("Girilen Sayiya Kadar 4'un Kuvvetleri: ");
        for (int i = 1; i < number; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Girilen Sayiya Kadar 5'in Kuvvetleri: ");
        for (int i = 1; i < number; i *= 5) {
            System.out.println(i);
        }


    }
}
