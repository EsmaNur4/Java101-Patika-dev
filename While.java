package ödev;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int password;
        Scanner input = new Scanner(System.in);
        boolean isPasswordSuccess = false;
        while (!isPasswordSuccess) {
            System.out.print("Sifreyi Giriniz: ");
            password = input.nextInt();
            if (password == 123) {
                System.out.println("Basarili");
                isPasswordSuccess = true;
            } else {
                System.out.println("Basarisiz");
            }
        }
    }
}
