package ödev;
import java.util.Scanner;
public class UcveDordeBolum {
    public static void main(String[] args) {
        int sayi;
        int sayac=0;
        int toplam=0;
        Scanner input= new Scanner(System.in);
        System.out.print(" Bir Sayi Giriniz: ");
        sayi=input.nextInt();


        for(int i=1;i<sayi;i++){
           if(i%3==0 && i%4==0){
               sayac++;
               toplam+=i;
           }
        }
        System.out.println("Girilen Sayiya Kadar 3 ve 4'e tam bolunen sayilarin ortalamasi "+ toplam/sayac);
    }
}
