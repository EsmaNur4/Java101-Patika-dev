package ödev;

import java.util.Scanner;

public class Gecme2 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("matematik notunuzu giriniz ");
        mat = inp.nextInt();

        System.out.print("fizik notunuzu giriniz ");
        fizik = inp.nextInt();

        System.out.print("kimya notunuzu giriniz ");
        kimya = inp.nextInt();

        System.out.print("turkce notunuzu giriniz ");
        turkce = inp.nextInt();

        System.out.print("muzik notunuzu giriniz ");
        muzik = inp.nextInt();

        double ortalama = (mat + fizik + kimya + turkce + muzik) / 5;
        if (ortalama >= 55) {
            System.out.println("Tebrikler Gectiniz !");
        } else {
            System.out.println("Sinifta Kaldiniz !");
        }
        System.out.println("Ortalamanız: " + ortalama);
    }
}
