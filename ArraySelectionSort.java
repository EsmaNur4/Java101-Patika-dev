package ödev;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySelectionSort {

    static void sort(int[] arr){
            for(int i=0;i< arr.length;i++){
                for(int j=i+1;j< arr.length;j++){
                    if(arr[j]<arr[i]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        System.out.println(Arrays.toString(arr));

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



    }
}
