package ödev;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {   // kullanıcıdan dik kenarları isteyip hipotenüsü bulan program

      double hipo,kenar1,kenar2;

      Scanner input= new Scanner(System.in);
        System.out.print("birinci kenarı giriniz ");
        kenar1= input.nextInt();

        System.out.print("ikinci kenarı giriniz ");
        kenar2=input.nextInt();
        hipo=Math.sqrt(kenar1*kenar1+kenar2*kenar2);

        System.out.println("hipotenüs uzunluğu= "+hipo);
    }
}
