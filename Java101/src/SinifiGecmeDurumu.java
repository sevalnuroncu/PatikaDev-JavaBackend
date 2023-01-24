import java.util.Scanner;

public class SinifiGecmeDurumu {
    /**
     * Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
     * Geçme Notu : 55
     * Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
     */
    public static void main(String[] args) {
        int mat, fizik,turkce,kimya,muzik;
        int dersSayisi=0;
        int toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        mat=input.nextInt();
        if(mat>=0 && mat<=100){
            toplam+=mat;
            dersSayisi++;
        }
        System.out.print("Fizik Notunuz: ");
        fizik=input.nextInt();
        if(fizik>=0 && fizik<=100){
            toplam+=fizik;
            dersSayisi++;
        }
        System.out.print("Türkçe Notunuz: ");
        turkce=input.nextInt();
        if(turkce>=0 && turkce<=100){
            toplam+=turkce;
            dersSayisi++;
        }
        System.out.print("Kimya Notunuz: ");
        kimya=input.nextInt();
        if(kimya>=0 && kimya<=100){
            toplam+=kimya;
            dersSayisi++;
        }
        System.out.print("Müzik Notunuz: ");
        muzik=input.nextInt();
        if(muzik>=0 && muzik<=100){
            toplam+=muzik;
            dersSayisi++;
        }

        double ortalama=toplam/(double)dersSayisi;
        if(ortalama<=55){
            System.out.println("Sınıfta kaldınız");

        }else{
            System.out.println("Tebrikler sınıfını geçtiniz!");

        }
        System.out.println("Ortalamanız: "+ortalama);

    }
}
