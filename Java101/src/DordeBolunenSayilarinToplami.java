import java.util.Scanner;

public class DordeBolunenSayilarinToplami {
    public static void main(String[] args) {
        /**
         * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
         * girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        int sayi,sum=0;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz: ");
            sayi=scan.nextInt();
            if(sayi%4==0){
                sum+=sayi;
            }
        }while(sayi%2==0);

        System.out.println("Toplam: "+sum);
    }

}
