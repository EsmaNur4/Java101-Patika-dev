package ödev;

public class AsalSayilar {
    public static void main(String[] args) {
        int counter;
        for (int i = 2; i < 100; i++) {
            counter = 0;
            if (i == 2) {
                System.out.print(i + " ");
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        counter++;
                    }
                }
                if (counter == 0) {
                    System.out.print(i + " ");
                }
            }
        }


    }
}