import java.util.Scanner;

public class DortveBesinKuvveti {
    public static void main(String[] args) {
        /**
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana
         * yazdıran programı yazıyoruz.
         */
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi=input.nextInt();

        System.out.println("4'ün katları: ");
        for(int i=1; i<=sayi; i*=4){
            System.out.println(i);
        }

        System.out.println("\n5'in katları: ");
        for(int i=1; i<=sayi; i*=5){
            System.out.println(i);
        }
    }
}
