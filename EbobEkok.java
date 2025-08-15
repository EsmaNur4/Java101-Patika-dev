package ödev;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, ebob = 0, ekok = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz: ");
        n1 = input.nextInt();
        System.out.print("Ikıncı Sayiyi Giriniz: ");
        n2 = input.nextInt();

        /*   Bu yontem daha pratik ebob bulmada  n1 i kucuk kabul edelim
        for(i=n1;i>=1;i--){
        if(n1%i==0 && n2%i==0){
        ebob=i;
        break;
        }
     } */
        if (n1 < n2) {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("Sayilarin Ebobu: " + ebob);

        } else {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("Sayilarin Ebobu: " + ebob);
        }
        for (int i = 1; i <= n1 * n2; i++) {
            if ((i % n1 == 0) && (i % n2 == 0)) {
                ekok = i;
                System.out.println("Sayilarin Ekoku: " + ekok);
                break;
            }
        }

    }
}
