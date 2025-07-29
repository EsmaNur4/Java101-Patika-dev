package ödev;
import java.util.Scanner;
public class UcakBileti {

    public static void main(String[] args) {
        int yas, mesafeTipi;
        double mesafe, toplamFiyat;
        Scanner input= new Scanner(System.in);
        System.out.print("Mesafeyi km Turunden Giriniz: ");
        mesafe= input.nextDouble();
        System.out.print("Yasinizi Giriniz: ");
        yas=input.nextInt();
        System.out.print("1-Gidis\n2-Gidis Donus\nMesafe Tipini Seciniz: ");
        mesafeTipi=input.nextInt();
        toplamFiyat=0.10*mesafe;
        if(yas>0 && mesafe>0 && (mesafeTipi==1||mesafeTipi==2)){
            if(yas<12){
                toplamFiyat-=toplamFiyat/2;
            }if(12<yas && yas<24){
                toplamFiyat-=toplamFiyat/10;
            }if(yas>65){
                toplamFiyat-=toplamFiyat*3/10;
            }if(mesafeTipi==2){
                toplamFiyat-=toplamFiyat*2/10;
                toplamFiyat*=2;
            }
            System.out.println("Toplam Tutar= "+ toplamFiyat);
        }else{
            System.out.println("Hatali Giris Yaptiniz!");
        }





    }
}
