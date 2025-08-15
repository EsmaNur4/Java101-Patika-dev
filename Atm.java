package ödev;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {  //Kullanici adi=esma Password=123
        String userName, password;
        int select, balance = 1000, price1, price2;
        int right = 3;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Kullanici Adinizi Giriniz: ");
            userName = input.nextLine();
            System.out.print("Sifrenizi Giriniz: ");
            password = input.nextLine();
            if (userName.equals("esma") && (password.equals("123"))) {
                System.out.println("Giris Basarili!");
                do {
                    System.out.print("\n1-Para Yatirma\n2-Para Cekme\n3-Bakiye Sorgulama\n4-Cıkıs Yapma\nHangi İslemi Yapmak İstersiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatirmak İstediginiz Tutari Giriniz: ");
                            price1 = input.nextInt();
                            balance += price1;
                            System.out.println("Guncel Bakiye= " + balance);
                            break;
                        case 2:
                            System.out.print("Cekmek İstediginiz Tutari Giriniz: ");
                            price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiyeniz Yetersiz!");
                            } else {
                                balance -= price2;
                                System.out.println("Guncel Bakiye: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar Gorusmek Uzere");
                            break;
                        default:
                            System.out.println("Hatali Giris! ");
                    }

                } while (select != 4);

            } else {
                right -= 1;
                if(right==0){
                    System.out.println("Hesabiniz Bloke Olmustur");
                }
               else{
                    System.out.println("Hatali Giris Yaptiniz! " + right + " Hakkiniz Kaldi!");
                }
            }
        } while (right != 0);

    }
}
