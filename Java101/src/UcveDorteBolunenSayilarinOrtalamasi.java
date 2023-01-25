import java.util.Scanner;

public class UcveDorteBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        /**
         * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
         * tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */

        int x,sayac = 0;
        double sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        x=input.nextInt();

        for(int i=0; i<=x; i++){
            if(i%3==0 && i%4==0){
                sum+=i;
                sayac+=1;
            }
        }
        System.out.println("Ortalama: "+sum/(double)sayac);
    }
}
