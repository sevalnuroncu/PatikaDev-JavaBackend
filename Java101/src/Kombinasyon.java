import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        /**
         * Java ile kombinasyon hesaplayan program yazınız.
         * C(n,r) = n! / (r! * (n-r)!)
         */
        int n, r,total=1,total2=1,total3=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        n=scan.nextInt();
        System.out.print("r değerini giriniz: ");
        r=scan.nextInt();

        for (int i=1; i<=n; i++){
            total*=i;
        }
        for (int i=1; i<=r; i++){
            total2*=i;
        }
        for (int i=1; i<=n-r; i++){
            total3*=i;
        }

        System.out.println("Kombinasyon: "+total/(total2*total3));


    }
}
