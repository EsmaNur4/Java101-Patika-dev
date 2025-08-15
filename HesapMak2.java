package ödev;

import java.util.Scanner;

public class HesapMak2 {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sonuc = " + result);
        return result;
    }

    static int sub(int a, int b) {
        int result = a - b;
        System.out.println("Sonuc = " + result);
        return result;
    }

    static int multi(int a, int b) {
        int result = a * b;
        System.out.println("Sonuc = " + result);
        return result;
    }

    static int div(int a, int b) {
        int result = a / b;
        System.out.println("Sonuc = " + result);
        return result;
    }

    static int pow(int a, int b) {
        int result=1;
        for(int i=1;i<=b;i++){
          result*=a;
        }
        System.out.println("Sonuc= "+ result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Sonuc = " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, sayi1, sayi2;
        do {
            System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-Us Alma\n6-Mod Alma\n7-Cikis Yapma");
            System.out.print("Yapmak İstediginiz İslemi Seciniz: ");
            choice = input.nextInt();
            if (choice == 7) {
                System.out.println("Cikis Yapildi.");
            } else {
                System.out.print("1. Sayiyi Giriniz: ");
                sayi1 = input.nextInt();
                System.out.print("2. Sayiyi Giriniz: ");
                sayi2 = input.nextInt();
                switch (choice) {
                    case 1:
                        sum(sayi1, sayi2);
                        break;
                    case 2:
                        sub(sayi1, sayi2);
                        break;
                    case 3:
                        multi(sayi1, sayi2);
                        break;
                    case 4:
                        if (sayi2== 0) {
                        System.out.println("Hatali Giris!");
                    }else {
                            div(sayi1, sayi2);
                        }
                        break;
                    case 5:
                       pow(sayi1,sayi2);
                        break;
                    case 6:
                        mod(sayi1, sayi2);
                        break;
                    default:
                        System.out.println("Hatali Giris");
                }
            }
        } while (choice != 7);


    }
}
