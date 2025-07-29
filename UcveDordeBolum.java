package ödev;
import java.util.Scanner;
public class CiftSayilar {
    public static void main(String[] args) {
        int sayi;
        Scanner input= new Scanner(System.in);
        System.out.print(" Bir Sayi Giriniz: ");
        sayi=input.nextInt();
        System.out.println("Girdiginiz sayiya kadar olan cift sayilar ");
        for(int i=0;i<sayi;i+=2){
            System.out.print(i+ " ");
        }
    }
}
