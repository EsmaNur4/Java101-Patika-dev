package ödev;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        boolean isError = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Yil Giriniz: ");
        yil = input.nextInt();
        if (yil % 4 == 0) {
            if (yil % 100 == 0 && yil % 400 != 0) {
                isError = true;
            } else {
                isError = false;
            }
        }
        if (isError) {
            System.out.println(yil + " Bir Artik Yil Degildir");
        } else {
            System.out.print(yil + " Bir Artik Yildir");
        }

    }
}


