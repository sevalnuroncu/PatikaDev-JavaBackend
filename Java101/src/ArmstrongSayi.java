import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        /**
         * Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.
         * N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse,
         * böyle sayılara Armstrong sayı denir.
         * Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
         * Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int number=scan.nextInt();
        int basamakSayisi=0, tempNumber=number, basValue, result=0, basPow;

        /**
         * basamak sayısını bulma örnek sayi=2451
         * 2451/10=245
         * 245/10=24
         * 24/10=2
         * 2/10=0
         * 0/10=0
         */

        while(tempNumber!=0){
            tempNumber=tempNumber/10;
            basamakSayisi++;
        }
        //System.out.println(basamakSayisi);
        /**Bir sayının son basmağını bulma
         * 2451%10=1
         */
        tempNumber=number;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            //System.out.println(basmakDegeri);
            basPow=1;
            for(int i=1; i<=basamakSayisi; i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;

        }
        if (result==number){
            System.out.println(number +" sayısı bir Armstrong sayısıdır");
        }else{
            System.out.println(number +" sayısı bir Armstrong sayısı değildir");
        }




    }
}
