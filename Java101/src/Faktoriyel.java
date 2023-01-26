import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        /**
         * Java ile faktöriyel hesaplayan program yazıyoruz.
         */
        int sayi,sonuc=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi=scan.nextInt();
        for(int i=1; i<=sayi; i++){
            sonuc*=i;
        }
        System.out.print("Faktoriyel: "+sonuc);

    }
}
