package ödev;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int number1, number2, operator;
        Scanner input = new Scanner(System.in);
        System.out.print("lutfen birinci sayiyi giriniz : ");
        number1 = input.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        number2 = input.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nLutfen yapmak istediginiz islemi seciniz");
        operator = input.nextInt();

        switch (operator) {
            case 1:
                System.out.println("Toplam= " + (number1 + number2));
                break;
            case 2:
                System.out.println("Cıkarma= " + (number1 - number2));
                break;
            case 3:
                System.out.println("Carpim= " + (number1 * number2));
                break;
            case 4:
                if (number2 == 0) {
                    System.out.println("Bir sayi sifira bolunemez");
                } else
                    System.out.println("Bolum= " + (number1 / number2));
                break;
            default:
                System.out.println("Yanlis giris yaptiniz. Tekrar deneyiniz");
        }

    }
}
