import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double paraDegeri;
        Scanner input=new Scanner(System.in);
        System.out.print("Para değeri giriniz: ");
        paraDegeri=input.nextDouble();

        //kdvTutariHesapla(paraDegeri);

        kosulluKdvTutariHesapla(paraDegeri);

    }
    private static void kdvTutariHesapla(double paraDegeri) {
        /**Java ile kullanıcıdan alınan para değerinin KDV'li
         * fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
         * (Not : KDV tutarını 18% olarak alın)
         * */

        double kdvTutari= (paraDegeri * 18) / 100.0;
        double kdvliFiyat=paraDegeri+kdvTutari;

        System.out.println("KDV Tutarı: "+kdvTutari);
        System.out.println("KDV'li Fiyat: "+kdvliFiyat);
    }

    private static void kosulluKdvTutariHesapla(double paraDegeri) {
        /**Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
         * tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */
        /*if(paraDegeri>=0 && paraDegeri<=1000){
            double kdvTutari= (paraDegeri * 18) / 100.0;
            System.out.println("KDV Tutarı: "+kdvTutari);
        } else if (paraDegeri>1000) {
            double kdvTutari= (paraDegeri * 8) / 100.0;
            System.out.println("KDV Tutarı: "+kdvTutari);
        }*/
        double kdvTutari1= (paraDegeri * 18) / 100;
        double kdvTutari2= (paraDegeri * 8) / 100;
        System.out.println(paraDegeri>0 && paraDegeri<1000 ? "KDV Tutarı: "+kdvTutari1 : "KDV Tutarı: "+kdvTutari2 );
    }


}
