package ödev;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        double yil;
        String burc;
        Scanner input = new Scanner(System.in);
        System.out.print("Dogum Yilinizi Giriniz : ");
        yil = input.nextDouble();
        if (yil % 12 == 0) {
            burc = "Maymun";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 1) {
            burc = "Horoz";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 2) {
            burc = "Kopek";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 3) {
            burc = "Domuz";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 4) {
            burc = "Fare";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 5) {
            burc = "Okuz";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 6) {
            burc = "Kaplan";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 7) {
            burc = "Tavsan";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 8) {
            burc = "Ejderha";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 9) {
            burc = "Yilan";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 10) {
            burc = "At";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        } else if (yil % 12 == 11) {
            burc = "Koyun";
            System.out.println("Cin Zodyagi Burcunuz: " + burc);
        }

    }
}
