package ödev;

import java.util.Arrays;

public class ArrayCount {
    static void counter(int[] arr) {
        boolean[] again = new boolean[arr.length];
        Arrays.fill(again, false);
        int sum = 0;
        System.out.println("Tekrar Sayilari:");
        for (int i = 0; i < arr.length; i++) {
            if (again[i] == false) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        sum++;
                        again[j] = true;
                    }
                }
                System.out.println(arr[i] + " Sayisi " + sum + " Kez Tekrar Etti.");
                sum = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println(Arrays.toString(array));
        counter(array);
    }
}
