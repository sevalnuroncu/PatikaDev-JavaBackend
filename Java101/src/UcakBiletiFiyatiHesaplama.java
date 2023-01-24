import java.util.Arrays;
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    /**
     * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
     * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
     * Mesafe başına ücret 0,10 TL / km olarak alın.
     * İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın
     * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
     * Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
     * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
     * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
     * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
     * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     *
     */
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double biletFiyati;
        boolean isError=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        mesafe=input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();
        System.out.print("1-Tek yön\n2-Gidiş-Dönüş\nYolculuk Tipini giriniz:  ");
        yolculukTipi=input.nextInt();
        if(mesafe>0 && yas>0 ){
            if(yas<12){
                if(yolculukTipi==1){
                    biletFiyati=mesafe*0.10*(0.50);
                    System.out.println(biletFiyati);
                }else if(yolculukTipi==2){
                    biletFiyati=((mesafe*0.10*(0.50))-(mesafe*0.10*(50/100)*0.20))*2;
                    System.out.println(biletFiyati);
                }else{
                    isError=true;
                }

            }else if(yas>=12 && yas<=24){
                if(yolculukTipi==1){
                    biletFiyati=mesafe*0.10*(0.90);
                    System.out.println(biletFiyati);
                }else if(yolculukTipi==2){
                    biletFiyati=((mesafe*0.10*(0.90))-(mesafe*0.10*(0.90)*0.20))*2;
                    System.out.println(biletFiyati);
                }else{
                    isError=true;
                }

            }else if(yas>65){
                if(yolculukTipi==1){
                    biletFiyati=mesafe*0.10*(0.70);
                    System.out.println(biletFiyati);
                }else if(yolculukTipi==2){
                    biletFiyati=((mesafe*0.10*(0.70))-(mesafe*0.10*(0.70)*0.20))*2;
                    System.out.println(biletFiyati);
                }else{
                    isError=true;
                }
            }else{
                if(yolculukTipi==1){
                    biletFiyati=mesafe*0.10;
                    System.out.println(biletFiyati);
                }else if(yolculukTipi==2){
                    biletFiyati=((mesafe*0.10)-(mesafe*0.10*0.20))*2;
                    System.out.println(biletFiyati);
                }else{
                    isError=true;
                }

            }
        }
        else{
            isError=true;
        }
        if(isError){
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}
