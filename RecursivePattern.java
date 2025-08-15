package ödev;
import java.util.Scanner;

public class RecursivePattern {
    static int pattern(int number,int newNumber,int reverse){
        System.out.print(newNumber+" ");
        if(newNumber==0||newNumber<0||reverse==1){
            if(newNumber==number){
                return 0;
            }
            return pattern(number,newNumber+5,1);
        }

        return pattern(number,newNumber-5,0);
    }

    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        number=input.nextInt();
        pattern(number, number,0);
    }
}