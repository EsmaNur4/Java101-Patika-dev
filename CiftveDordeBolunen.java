package ödev;
import java.util.Scanner;
public class TekSayilar {   // Kullanıcı negatif bir sayi girene kadar olan sayilardan tek olanların toplamını bulan program
    public static void main(String[] args) {
        int sayi, toplam;
        Scanner inp=new Scanner(System.in);

        do{
            System.out.print("Sayi girin: ");
            sayi=inp.nextInt();
            if(sayi%2==0 && sayi%4==0){
                toplam+=sayi;
        } while(sayi%2==1);

    }
}
}
