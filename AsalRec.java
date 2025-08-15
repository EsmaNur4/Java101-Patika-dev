package ödev;
import java.util.Scanner;
public class AsalRec {
    static int Asal(int number,int i){
        if(number==2){
            return 1;
        }
        if(i==1){
            return 1;
        }
        if( number%i==0){
            return 0;
        }

        return Asal(number,i-1);
    }
    public static void main(String[] args) {
        int number;
        System.out.print("Bir Sayi Giriniz:");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        int isAsal=Asal(number,number/2);

        if(isAsal==1){
            System.out.println("Girdiginiz Sayi Asaldir");
        }else {
            System.out.println("Girdiginiz Sayi Asal Degildir.");
        }

    }

}
