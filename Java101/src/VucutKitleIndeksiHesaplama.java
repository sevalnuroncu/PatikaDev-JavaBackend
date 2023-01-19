import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
         * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın
         * Kilo (kg) / Boy(m) * Boy(m)
         */
        double boy, kilo, indeks;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=input.nextDouble();
        indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+indeks);


    }
}
