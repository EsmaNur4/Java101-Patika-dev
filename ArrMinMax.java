package ödev;

public class ArrMinMax {
    public static void main(String[] args) {
        int[] list={-21,12,-34,-15,81};
        int min=list[0];
        int max=list[0];

        for(int i:list){
          if(i<min){
              min=i;
          }
          if(i>max){
              max=i;
          }
        }
        System.out.println("Min deger= "+min+" Max deger= "+max);

    }

}
