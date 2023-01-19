import java.util.Scanner;
/**Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
 * ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 * Aynı program içerisinde koşullu ifadeler kullanılarak,
 * eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 * Not : If ve Else kullanılmayacak...*/
public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,tarih,muzik;

        Scanner input=new Scanner(System.in);
        System.out.println("matematik notunu giriniz:");
        mat=input.nextInt();
        System.out.println("fizik notunu giriniz:");
        fizik=input.nextInt();
        System.out.println("turkce notunu giriniz:");
        turkce=input.nextInt();
        System.out.println("kimya notunu giriniz:");
        kimya=input.nextInt();
        System.out.println("tarih notunu giriniz:");
        tarih=input.nextInt();
        System.out.println("muzik notunu giriniz:");
        muzik=input.nextInt();

        int toplam=mat+fizik+turkce+kimya+tarih+muzik;
        double sonuc=toplam/6.0;
        //System.out.println("Not ortalamanız: "+sonuc);
        System.out.println(sonuc>60 ? "Sınıfı geçti" : "Sınıfta kaldı");
    }
}
