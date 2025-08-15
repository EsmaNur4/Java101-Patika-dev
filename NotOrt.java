package ödev;

import java.util.Scanner;
public class NotOrt {
    public static void main(String[] args) {
        // Not ortalaması hesaplama ve geçme kalma durumu

        int mat, fizik, kimya, tarih, turkce, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("matematik notunuzu giriniz ");
        mat = inp.nextInt();
        System.out.print("fizik notunuzu giriniz ");
        fizik = inp.nextInt();
        System.out.print("kimya notunuzu giriniz ");
        kimya = inp.nextInt();
        System.out.print("tarih notunuzu giriniz ");
        tarih = inp.nextInt();
        System.out.print("turkce notunuzu giriniz ");
        turkce = inp.nextInt();
        System.out.print("muzik notunuzu giriniz ");
        muzik = inp.nextInt();

        double ortalama = (mat + fizik + kimya + tarih + turkce + muzik) / 6.0;
        System.out.println("ortalamanız:" + ortalama);

        boolean gectiMi = ortalama > 60;
        String sonuc = gectiMi ? "GECTİNİZ" : "KALDINIZ";
        System.out.println(sonuc);

    }
}

