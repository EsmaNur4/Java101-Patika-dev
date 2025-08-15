package ödev;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        int number = input.nextInt();
        int Number=number;
        int totalDigits = 0;
        int sum = 0;
        int digit;
                                                                      
        while (Number != 0)                  {
            Number /= 10;
            totalDigits++;
        }

        Number = number;
        while(Number!=0) {
            digit = Number % 10;
            sum+=digit^totalDigits;
            Number /= 10;
        }
        if (sum == number) {
            System.out.println(number + " Sayisi Bir Armstrong Sayidir.");
        } else {
            System.out.println(number + " Sayisi Armstrong Sayi Degildir.");
        }

    }
}
