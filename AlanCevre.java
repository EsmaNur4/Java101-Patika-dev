package ödev;
import java.util.Scanner;

public class AlanCevre {
    public static void main(String[] args) {  // dairenin alanını ve çevresini hesaplayan program
        double r, alan, cevre, pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.print("yaricapı giriniz ");
        r= input.nextDouble();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("dairenin alanı= "+ alan);
        System.out.println("dairenin çevresi= "+ cevre);
    }
}
