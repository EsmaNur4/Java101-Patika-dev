package ödev;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SayiTahmin {
    public static void main(String[] args) {
        int random;
        int number;
        int right = 0;
        int[] wrong=new int[5];
        boolean isWin=false;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        random = rand.nextInt(100);

        while (right < 5) {
            System.out.print("Bir Sayi Giriniz: ");
            number = input.nextInt();
            if (number < 0 && number > 100) {
                System.out.println("Yanlis Aralikta Bir Sayi Girdiniz!");
                continue;
            }
            if (random == number) {
                isWin=true;
                System.out.println("Tebrikler Dogru Tahmin! Tahmin Ettigin Sayi: "+number);
                break;
            } else {
                wrong[right]=number;
                right++;
                System.out.println("Yanlis Cevap!");
                if(number>random){
                    System.out.println(number+" Sayisi Gizli Sayidan Buyuktur.");
                }else{
                    System.out.println(number+" Sayisi Gizli Sayidan Kucuktur.");
                }
                System.out.println("Kalan Hakkiniz:" + (5 - right));
            }
        }
        if(!isWin){
            System.out.println("Oyunu Kaybettiniz!");
            System.out.println("Gizli sayi: "+random);
            System.out.print("Tahminleriniz: ");
            System.out.print(Arrays.toString(wrong));
        }

    }
}
