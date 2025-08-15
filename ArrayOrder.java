package ödev;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayOrder {
    static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int a = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = a;
                sort(arr);
            }
        }
    }

    static void printArr(int[] list) {
        System.out.print("Sıralama: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Dizi Boyutunu Giriniz: ");
        n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ". Elemanı Giriniz: ");
            array[i] = input.nextInt();
        }
        sort(array);
        printArr(array);
    }
}
