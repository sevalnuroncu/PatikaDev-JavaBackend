import java.awt.*;
import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        /**
         * Java ile girilen sayının harmonik serisini bulan program yazacağız.
         * 1+1/2+1/3+1/4+......1/n
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n=scan.nextInt();
        double result=0;
        for (int i=1; i<=n; i++){
           result+=(1.0/i);         // int/int=int  double/int=double
        }
        System.out.println(result);
    }
}
