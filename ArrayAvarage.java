package ödev;

public class ArrayAvarage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 45};
        double sum = 0;
        double avarage;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        avarage=sum/ arr.length;
        System.out.println(avarage);

    }
}
