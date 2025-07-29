package ödev;

import java.util.Scanner;

public class Dongu {
    public static void main(String[] args) {
    /*    for(int i=3;i<10;i+=2){
            System.out.print(i);
        }
        System.out.println();
        int k=3;
        while (k<10){
            System.out.print(k);
            k+=2;
        }
        System.out.println();
        int j=3;
        do {
            System.out.print(j);
            j+=2;
        }while(j<10); */

        // Eksi deger girilene kadar döngü devam eder  for ve while döngüleri ile yapıldı
        Scanner input=new Scanner(System.in);
       for(boolean run=true;run;){
            int sayi;
            System.out.print("sayi girin: ");
            sayi=input.nextInt();
            if(sayi<0){
                run=false;
            }
        }             // Bu kısımdan ayırarak calıstır
        int sayi;
        do{
            System.out.print("sayi girin: ");
            sayi=input.nextInt();
        }while(sayi>0);

    }
}
