package ödev;

import java.util.Scanner;

public class Kdv {  //  Kullanıcıdan alınan fiyatın kdvli tutarını ve kdv miktarını ekrana bastıran program
    // Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program
    public static void main(String[] args) {
        double tutar,kdvOrani,kdv,kdvliFiyat;

        Scanner input=new Scanner(System.in);
        System.out.print("tutarı giriniz ");
        tutar = input.nextDouble();


        kdvOrani= (tutar <1000) ? 0.18 : 0.08;
        kdv=tutar*kdvOrani;
        kdvliFiyat=tutar+kdv;

        System.out.println("kdv tutarı "+ kdv);
        System.out.println("kdv'li fiyat "+ kdvliFiyat );

    }
}
