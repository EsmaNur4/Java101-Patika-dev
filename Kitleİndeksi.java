package ödev;
import java.util.Scanner;
public class Kitleİndeksi {
    public static void main(String[] args) { // kullanıcıdan boy ve kilo değerlerini alınıp vücut kitle indeksini bulan program
        // Formül =Kilo (kg) / (Boy(m) * Boy(m))

        double boy,kilo,vkIndeks;
        Scanner girdi= new Scanner(System.in);
        System.out.print("Boyunuzu giriniz (m cinsinden) :" );
        boy= girdi.nextDouble();
        System.out.print("Kilonuzu giriniz (kg cinsinden) :");
        kilo= girdi.nextDouble();
        vkIndeks=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+ vkIndeks);

    }
}
