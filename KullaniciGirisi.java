package ödev;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, desicion, newpassword;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adinizi giriniz ");
        userName = inp.nextLine();
        System.out.print("Sifrenizi giriniz ");
        password = inp.nextLine();

        if (userName.equals("esma") && password.equals("java123")) {
            System.out.println("Basariyla giris yaptiniz");
        } else {
            System.out.println("Yanlis giris yaptiniz. Sifrenizi sifirlamak ister misiniz ? İsterseniz EVET yaziniz.");
            desicion = inp.nextLine();
            if (desicion.equals("EVET")) {
                System.out.println("Yeni sifrenizi giriniz:");
                newpassword = inp.nextLine();
                if (newpassword.equals("java123")) {
                    System.out.println("Sifre olusturulamadi.");
                } else {
                    System.out.println("Sifreniz basariyla olusturuldu");
                }
            }
        }
    }
}
