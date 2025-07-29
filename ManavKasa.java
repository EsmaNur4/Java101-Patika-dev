package ödev;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double armutPr = 2.14, elmaPr = 3.67, domatesPr = 1.11, muzPr = 0.95, patlicanPr = 5.0;
        double a, b, c, d, e, toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut: ");
        a = input.nextDouble();

        System.out.print("Kaç kilo elma: ");
        b = input.nextDouble();

        System.out.print("Kaç kilo domates: ");
        c = input.nextDouble();

        System.out.print("Kaç kilo muz: ");
        d = input.nextDouble();

        System.out.print("Kaç kilo patlıcan: ");
        e = input.nextDouble();

        toplam = a * armutPr + b * elmaPr + c * domatesPr + d * muzPr + e * patlicanPr;
        System.out.println("toplam tutar = " + toplam);
    }
}
