package ödev;

import java.util.Scanner;

public class UsRecursive {

    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
         return pow(a, b - 1) * a;

    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Degerini Giriniz:");
        num1 = inp.nextInt();
        System.out.print("Us Degerini Giriniz:");
        num2 = inp.nextInt();
        System.out.println("Sonuc="+pow(num1, num2));
    }
}
