package ödev;
import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {

        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        double mesafe,tutar,kmBasina=2.20, basFiyat=10;
        Scanner girdi=new Scanner(System.in);
        System.out.print("km yi giriniz ");
        mesafe=girdi.nextInt();
        tutar= basFiyat+ mesafe*kmBasina;
        tutar=(tutar<20) ? 20 : tutar;
        System.out.println("tutar= "+ tutar);

    }
}
