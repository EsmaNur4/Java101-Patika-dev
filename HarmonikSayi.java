package ödev;

import java.util.Scanner;

public class HarmonikSayi {    //Girilen sayinin harmonik serisi
    public static void main(String[] args) {
        int number;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            sum += (1.0 / i); // int degeri int degere boldugunde sonuc int olur ; öyle olmamali bu yuzden 1.0 yazabiliriz ya da i yi double yapabiliriz
        }
        System.out.println("Harmonik Sonuc= " + sum);
    }
}
